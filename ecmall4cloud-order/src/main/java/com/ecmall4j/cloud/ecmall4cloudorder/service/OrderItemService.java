package com.ecmall4j.cloud.ecmall4cloudorder.service;

import com.baomidou.mybatisplus.extension.service.IService;
import ecmall4j.cloud.ecmall4cloudcommon.common.utils.PageUtils;
import com.ecmall4j.cloud.ecmall4cloudorder.entity.OrderItemEntity;

import java.util.Map;

/**
 * 订单项信息
 *
 * @author Elric
 * @email sunlightcs@gmail.com
 * @date 2024-05-16 16:52:08
 */
public interface OrderItemService extends IService<OrderItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

