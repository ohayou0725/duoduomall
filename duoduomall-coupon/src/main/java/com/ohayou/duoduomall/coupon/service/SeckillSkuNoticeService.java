package com.ohayou.duoduomall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ohayou.common.utils.PageUtils;
import com.ohayou.duoduomall.coupon.entity.SeckillSkuNoticeEntity;

import java.util.Map;

/**
 * 秒杀商品通知订阅
 *
 * @author ohayou
 * @email llyyffhh@gmail.com
 * @date 2020-05-04 13:58:35
 */
public interface SeckillSkuNoticeService extends IService<SeckillSkuNoticeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

