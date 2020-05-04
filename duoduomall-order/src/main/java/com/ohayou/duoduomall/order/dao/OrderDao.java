package com.ohayou.duoduomall.order.dao;

import com.ohayou.duoduomall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author ohayou
 * @email llyyffhh@gmail.com
 * @date 2020-05-04 14:16:33
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
