package com.ecmall4j.cloud.ecmall4cloudadmin.modules.oss.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ecmall4j.cloud.ecmall4cloudadmin.common.utils.PageUtils;
import com.ecmall4j.cloud.ecmall4cloudadmin.common.utils.Query;
import com.ecmall4j.cloud.ecmall4cloudadmin.modules.oss.dao.SysOssDao;
import com.ecmall4j.cloud.ecmall4cloudadmin.modules.oss.entity.SysOssEntity;
import com.ecmall4j.cloud.ecmall4cloudadmin.modules.oss.service.SysOssService;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("sysOssService")
public class SysOssServiceImpl extends ServiceImpl<SysOssDao, SysOssEntity> implements SysOssService {

	@Override
	public PageUtils queryPage(Map<String, Object> params) {
		IPage<SysOssEntity> page = this.page(
			new Query<SysOssEntity>().getPage(params)
		);

		return new PageUtils(page);
	}
	
}
