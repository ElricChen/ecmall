package com.ecmall4j.cloud.ecmall4cloudadmin.modules.sys.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.ecmall4j.cloud.ecmall4cloudadmin.common.utils.PageUtils;
import com.ecmall4j.cloud.ecmall4cloudadmin.modules.sys.entity.SysLogEntity;

import java.util.Map;


/**
 * 系统日志
 *
 * @author Mark sunlightcs@gmail.com
 */
public interface SysLogService extends IService<SysLogEntity> {

    PageUtils queryPage(Map<String, Object> params);

}
