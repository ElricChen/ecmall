package com.ecmall4j.cloud.ecmall4cloudorder.dao;

import com.ecmall4j.cloud.ecmall4cloudorder.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author Elric
 * @email sunlightcs@gmail.com
 * @date 2024-05-16 16:52:09
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
