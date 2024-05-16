package com.ecmall4j.cloud.ecmall4cloudmember.service;

import com.baomidou.mybatisplus.extension.service.IService;
import ecmall4j.cloud.ecmall4cloudcommon.common.utils.PageUtils;
import com.ecmall4j.cloud.ecmall4cloudmember.entity.MemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 *
 * @author Elric
 * @email sunlightcs@gmail.com
 * @date 2024-05-16 16:50:37
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

