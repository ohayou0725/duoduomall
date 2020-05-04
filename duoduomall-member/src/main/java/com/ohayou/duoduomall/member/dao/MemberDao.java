package com.ohayou.duoduomall.member.dao;

import com.ohayou.duoduomall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author ohayou
 * @email llyyffhh@gmail.com
 * @date 2020-05-04 14:06:32
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
