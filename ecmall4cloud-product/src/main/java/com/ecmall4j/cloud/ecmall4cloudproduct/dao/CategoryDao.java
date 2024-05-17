package com.ecmall4j.cloud.ecmall4cloudproduct.dao;

import com.ecmall4j.cloud.ecmall4cloudproduct.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author Elric
 * @date 2024-05-16 16:53:38
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
