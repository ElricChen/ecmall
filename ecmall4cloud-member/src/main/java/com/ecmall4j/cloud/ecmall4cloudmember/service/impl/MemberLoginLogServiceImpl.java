package com.ecmall4j.cloud.ecmall4cloudmember.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import ecmall4j.cloud.ecmall4cloudcommon.common.utils.PageUtils;
import ecmall4j.cloud.ecmall4cloudcommon.common.utils.Query;

import com.ecmall4j.cloud.ecmall4cloudmember.dao.MemberLoginLogDao;
import com.ecmall4j.cloud.ecmall4cloudmember.entity.MemberLoginLogEntity;
import com.ecmall4j.cloud.ecmall4cloudmember.service.MemberLoginLogService;


@Service("memberLoginLogService")
public class MemberLoginLogServiceImpl extends ServiceImpl<MemberLoginLogDao, MemberLoginLogEntity> implements MemberLoginLogService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<MemberLoginLogEntity> page = this.page(
                new Query<MemberLoginLogEntity>().getPage(params),
                new QueryWrapper<MemberLoginLogEntity>()
        );

        return new PageUtils(page);
    }

}