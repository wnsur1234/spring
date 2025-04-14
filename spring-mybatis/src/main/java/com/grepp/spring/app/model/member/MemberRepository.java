package com.grepp.spring.app.model.member;

import com.grepp.spring.app.model.member.dto.Member;
import java.util.Optional;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberRepository {

    Optional<Member> selectById(String userId);

}
