package com.ecmall4j.cloud.ecmall4cloudmember.dao;

import com.ecmall4j.cloud.ecmall4cloudmember.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author Elric
 * @date 2024-05-16 16:50:36
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
