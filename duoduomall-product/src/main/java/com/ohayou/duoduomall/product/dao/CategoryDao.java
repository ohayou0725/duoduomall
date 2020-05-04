package com.ohayou.duoduomall.product.dao;

import com.ohayou.duoduomall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author ohayou
 * @email llyyffhh@gmail.com
 * @date 2020-05-04 13:12:57
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
