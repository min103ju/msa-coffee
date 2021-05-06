package com.citizen.msa.member.springboot.repository;

import com.citizen.msa.member.springboot.repository.dvo.MemberDVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ICoffeeMemberMapper {
    MemberDVO existByMemberName(MemberDVO memberDVO);
    int createMemberTable();
    int insertMemberData();
}
