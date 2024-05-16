package com.ecmall4j.cloud.ecmall4cloudware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import ecmall4j.cloud.ecmall4cloudcommon.common.utils.PageUtils;
import com.ecmall4j.cloud.ecmall4cloudware.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author Elric
 * @email sunlightcs@gmail.com
 * @date 2024-05-16 16:54:58
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

