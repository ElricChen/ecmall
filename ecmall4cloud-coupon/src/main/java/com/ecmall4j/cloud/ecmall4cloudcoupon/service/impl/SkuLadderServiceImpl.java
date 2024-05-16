package com.ecmall4j.cloud.ecmall4cloudcoupon.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import ecmall4j.cloud.ecmall4cloudcommon.common.utils.PageUtils;
import ecmall4j.cloud.ecmall4cloudcommon.common.utils.Query;

import com.ecmall4j.cloud.ecmall4cloudcoupon.dao.SkuLadderDao;
import com.ecmall4j.cloud.ecmall4cloudcoupon.entity.SkuLadderEntity;
import com.ecmall4j.cloud.ecmall4cloudcoupon.service.SkuLadderService;


@Service("skuLadderService")
public class SkuLadderServiceImpl extends ServiceImpl<SkuLadderDao, SkuLadderEntity> implements SkuLadderService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SkuLadderEntity> page = this.page(
                new Query<SkuLadderEntity>().getPage(params),
                new QueryWrapper<SkuLadderEntity>()
        );

        return new PageUtils(page);
    }

}