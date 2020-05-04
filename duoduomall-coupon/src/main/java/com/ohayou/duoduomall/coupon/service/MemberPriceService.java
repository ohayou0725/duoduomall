package com.ohayou.duoduomall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ohayou.common.utils.PageUtils;
import com.ohayou.duoduomall.coupon.entity.MemberPriceEntity;

import java.util.Map;

/**
 * 商品会员价格
 *
 * @author ohayou
 * @email llyyffhh@gmail.com
 * @date 2020-05-04 13:58:34
 */
public interface MemberPriceService extends IService<MemberPriceEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

