package com.ohayou.duoduomall.product.dao;

import com.ohayou.duoduomall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author ohayou
 * @email llyyffhh@gmail.com
 * @date 2020-05-04 13:12:57
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
