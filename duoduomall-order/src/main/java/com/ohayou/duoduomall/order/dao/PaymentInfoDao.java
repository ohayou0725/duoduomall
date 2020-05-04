package com.ohayou.duoduomall.order.dao;

import com.ohayou.duoduomall.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author ohayou
 * @email llyyffhh@gmail.com
 * @date 2020-05-04 14:16:33
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
