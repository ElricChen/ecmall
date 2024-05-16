package com.ecmall4j.cloud.ecmall4cloudmember.dao;

import com.ecmall4j.cloud.ecmall4cloudmember.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author Elric
 * @email sunlightcs@gmail.com
 * @date 2024-05-16 16:50:37
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}
