package com.ecmall4j.cloud.ecmall4cloudadmin.modules.oss.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ecmall4j.cloud.ecmall4cloudadmin.common.utils.PageUtils;
import com.ecmall4j.cloud.ecmall4cloudadmin.modules.oss.entity.SysOssEntity;

import java.util.Map;

/**
 * 文件上传
 *
 * @author Mark sunlightcs@gmail.com
 */
public interface SysOssService extends IService<SysOssEntity> {

	PageUtils queryPage(Map<String, Object> params);
}
