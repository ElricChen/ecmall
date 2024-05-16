package com.ecmall4j.cloud.ecmall4cloudadmin.modules.oss.controller;

import com.google.gson.Gson;
import com.ecmall4j.cloud.ecmall4cloudadmin.common.exception.RRException;
import com.ecmall4j.cloud.ecmall4cloudadmin.common.utils.ConfigConstant;
import com.ecmall4j.cloud.ecmall4cloudadmin.common.utils.Constant;
import com.ecmall4j.cloud.ecmall4cloudadmin.common.utils.PageUtils;
import com.ecmall4j.cloud.ecmall4cloudadmin.common.utils.R;
import com.ecmall4j.cloud.ecmall4cloudadmin.common.validator.ValidatorUtils;
import com.ecmall4j.cloud.ecmall4cloudadmin.common.validator.group.AliyunGroup;
import com.ecmall4j.cloud.ecmall4cloudadmin.common.validator.group.QcloudGroup;
import com.ecmall4j.cloud.ecmall4cloudadmin.common.validator.group.QiniuGroup;
import com.ecmall4j.cloud.ecmall4cloudadmin.modules.oss.cloud.CloudStorageConfig;
import com.ecmall4j.cloud.ecmall4cloudadmin.modules.oss.cloud.OSSFactory;
import com.ecmall4j.cloud.ecmall4cloudadmin.modules.oss.entity.SysOssEntity;
import com.ecmall4j.cloud.ecmall4cloudadmin.modules.oss.service.SysOssService;
import com.ecmall4j.cloud.ecmall4cloudadmin.modules.sys.service.SysConfigService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;

/**
 * 文件上传
 *
 * @author Mark sunlightcs@gmail.com
 */
@RestController
@RequestMapping("sys/oss")
public class SysOssController {
	@Autowired
	private SysOssService sysOssService;
    @Autowired
    private SysConfigService sysConfigService;

    private final static String KEY = ConfigConstant.CLOUD_STORAGE_CONFIG_KEY;
	
	/**
	 * 列表
	 */
	@GetMapping("/list")
	@RequiresPermissions("sys:oss:all")
	public R list(@RequestParam Map<String, Object> params){
		PageUtils page = sysOssService.queryPage(params);

		return R.ok().put("page", page);
	}


    /**
     * 云存储配置信息
     */
    @GetMapping("/config")
    @RequiresPermissions("sys:oss:all")
    public R config(){
        CloudStorageConfig config = sysConfigService.getConfigObject(KEY, CloudStorageConfig.class);

        return R.ok().put("config", config);
    }


	/**
	 * 保存云存储配置信息
	 */
	@PostMapping("/saveConfig")
	@RequiresPermissions("sys:oss:all")
	public R saveConfig(@RequestBody CloudStorageConfig config){
		//校验类型
		ValidatorUtils.validateEntity(config);
		ValidatorUtils.validateEntity(config, Constant.CloudService.getByValue(config.getType()));

        sysConfigService.updateValueByKey(KEY, new Gson().toJson(config));

		return R.ok();
	}
	

	/**
	 * 上传文件
	 */
	@PostMapping("/upload")
	@RequiresPermissions("sys:oss:all")
	public R upload(@RequestParam("file") MultipartFile file) throws Exception {
		if (file.isEmpty()) {
			throw new RRException("上传文件不能为空");
		}

		//上传文件
		String suffix = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
		String url = OSSFactory.build().uploadSuffix(file.getBytes(), suffix);

		//保存文件信息
		SysOssEntity ossEntity = new SysOssEntity();
		ossEntity.setUrl(url);
		ossEntity.setCreateDate(new Date());
		sysOssService.save(ossEntity);

		return R.ok().put("url", url);
	}


	/**
	 * 删除
	 */
	@PostMapping("/delete")
	@RequiresPermissions("sys:oss:all")
	public R delete(@RequestBody Long[] ids){
		sysOssService.removeByIds(Arrays.asList(ids));

		return R.ok();
	}

}
