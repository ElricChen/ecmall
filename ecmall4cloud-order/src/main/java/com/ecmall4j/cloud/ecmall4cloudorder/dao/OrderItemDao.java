package com.ecmall4j.cloud.ecmall4cloudorder.dao;

import com.ecmall4j.cloud.ecmall4cloudorder.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author Elric
 * @email sunlightcs@gmail.com
 * @date 2024-05-16 16:52:08
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
