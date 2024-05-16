package com.ecmall4j.cloud.ecmall4cloudproduct.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import ecmall4j.cloud.ecmall4cloudcommon.common.utils.PageUtils;
import ecmall4j.cloud.ecmall4cloudcommon.common.utils.Query;

import com.ecmall4j.cloud.ecmall4cloudproduct.dao.AttrGroupDao;
import com.ecmall4j.cloud.ecmall4cloudproduct.entity.AttrGroupEntity;
import com.ecmall4j.cloud.ecmall4cloudproduct.service.AttrGroupService;


@Service("attrGroupService")
public class AttrGroupServiceImpl extends ServiceImpl<AttrGroupDao, AttrGroupEntity> implements AttrGroupService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<AttrGroupEntity> page = this.page(
                new Query<AttrGroupEntity>().getPage(params),
                new QueryWrapper<AttrGroupEntity>()
        );

        return new PageUtils(page);
    }

}