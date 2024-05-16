package com.ecmall4j.cloud.ecmall4cloudmember.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import ecmall4j.cloud.ecmall4cloudcommon.common.utils.PageUtils;
import ecmall4j.cloud.ecmall4cloudcommon.common.utils.Query;

import com.ecmall4j.cloud.ecmall4cloudmember.dao.MemberLevelDao;
import com.ecmall4j.cloud.ecmall4cloudmember.entity.MemberLevelEntity;
import com.ecmall4j.cloud.ecmall4cloudmember.service.MemberLevelService;


@Service("memberLevelService")
public class MemberLevelServiceImpl extends ServiceImpl<MemberLevelDao, MemberLevelEntity> implements MemberLevelService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<MemberLevelEntity> page = this.page(
                new Query<MemberLevelEntity>().getPage(params),
                new QueryWrapper<MemberLevelEntity>()
        );

        return new PageUtils(page);
    }

}