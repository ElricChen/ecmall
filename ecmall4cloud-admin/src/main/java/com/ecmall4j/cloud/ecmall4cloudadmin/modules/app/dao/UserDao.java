package com.ecmall4j.cloud.ecmall4cloudadmin.modules.app.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ecmall4j.cloud.ecmall4cloudadmin.modules.app.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户
 *
 * @author Mark sunlightcs@gmail.com
 */
@Mapper
public interface UserDao extends BaseMapper<UserEntity> {

}
