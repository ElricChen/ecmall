package com.ecmall4j.cloud.ecmall4cloudcoupon.dao;

import com.ecmall4j.cloud.ecmall4cloudcoupon.entity.CouponSpuRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券与产品关联
 * 
 * @author Elric
 * @date 2024-05-16 15:33:36
 */
@Mapper
public interface CouponSpuRelationDao extends BaseMapper<CouponSpuRelationEntity> {
	
}
