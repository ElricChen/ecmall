package com.ecmall4j.cloud.ecmall4cloudadmin.modules.job.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ecmall4j.cloud.ecmall4cloudadmin.modules.job.entity.ScheduleJobLogEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 定时任务日志
 *
 * @author Mark sunlightcs@gmail.com
 */
@Mapper
public interface ScheduleJobLogDao extends BaseMapper<ScheduleJobLogEntity> {
	
}
