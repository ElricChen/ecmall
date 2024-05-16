package com.ecmall4j.cloud.ecmall4cloudorder.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import ecmall4j.cloud.ecmall4cloudcommon.common.utils.PageUtils;
import ecmall4j.cloud.ecmall4cloudcommon.common.utils.Query;

import com.ecmall4j.cloud.ecmall4cloudorder.dao.OrderReturnApplyDao;
import com.ecmall4j.cloud.ecmall4cloudorder.entity.OrderReturnApplyEntity;
import com.ecmall4j.cloud.ecmall4cloudorder.service.OrderReturnApplyService;


@Service("orderReturnApplyService")
public class OrderReturnApplyServiceImpl extends ServiceImpl<OrderReturnApplyDao, OrderReturnApplyEntity> implements OrderReturnApplyService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OrderReturnApplyEntity> page = this.page(
                new Query<OrderReturnApplyEntity>().getPage(params),
                new QueryWrapper<OrderReturnApplyEntity>()
        );

        return new PageUtils(page);
    }

}