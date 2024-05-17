package com.ecmall4j.cloud.ecmall4cloudorder.dao;

import com.ecmall4j.cloud.ecmall4cloudorder.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author Elric
 * @date 2024-05-16 16:52:08
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}
