package com.ecmall4j.cloud.ecmall4cloudproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import ecmall4j.cloud.ecmall4cloudcommon.common.utils.PageUtils;
import com.ecmall4j.cloud.ecmall4cloudproduct.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author Elric
 * @email sunlightcs@gmail.com
 * @date 2024-05-16 16:53:38
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

