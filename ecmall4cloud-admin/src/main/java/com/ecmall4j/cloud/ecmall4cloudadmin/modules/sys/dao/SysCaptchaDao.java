package com.ecmall4j.cloud.ecmall4cloudadmin.modules.sys.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ecmall4j.cloud.ecmall4cloudadmin.modules.sys.entity.SysCaptchaEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 验证码
 *
 * @author Mark sunlightcs@gmail.com
 */
@Mapper
public interface SysCaptchaDao extends BaseMapper<SysCaptchaEntity> {

}
