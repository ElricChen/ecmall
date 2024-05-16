package com.ecmall4j.cloud.ecmall4cloudorder.service;

import com.baomidou.mybatisplus.extension.service.IService;
import ecmall4j.cloud.ecmall4cloudcommon.common.utils.PageUtils;
import com.ecmall4j.cloud.ecmall4cloudorder.entity.RefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 *
 * @author Elric
 * @email sunlightcs@gmail.com
 * @date 2024-05-16 16:52:09
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

