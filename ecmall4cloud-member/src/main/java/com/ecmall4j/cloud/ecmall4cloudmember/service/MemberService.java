package com.ecmall4j.cloud.ecmall4cloudmember.service;

import com.baomidou.mybatisplus.extension.service.IService;
import ecmall4j.cloud.ecmall4cloudcommon.common.utils.PageUtils;
import com.ecmall4j.cloud.ecmall4cloudmember.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author Elric
 * @date 2024-05-16 16:50:36
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

