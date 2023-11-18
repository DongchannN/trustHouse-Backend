package com.example.trustHouse.service;

import com.example.trustHouse.common.exception.BaseException;
import com.example.trustHouse.common.response.BaseResponseStatus;
import com.example.trustHouse.dto.member.request.MemberLoginReq;
import com.example.trustHouse.dto.member.request.MemberSignupReq;
import com.example.trustHouse.entity.Member;
import com.example.trustHouse.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class MemberService {

    private final MemberRepository memberRepository;

    public String signup(MemberSignupReq signupReq) throws BaseException {
        if (memberRepository.findByEmail(signupReq.getEmail()).isPresent())
            throw new BaseException(BaseResponseStatus.EXIST_EMAIL);
        if (memberRepository.findByNickname(signupReq.getNickname()).isPresent())
            throw new BaseException(BaseResponseStatus.EXIST_NICKNAME);

        Member member = MemberSignupReq.toEntity(signupReq);
        try {
            memberRepository.save(member);
            return "회원가입에 성공하였습니다.";
        } catch (BaseException e) {
            throw new BaseException(BaseResponseStatus.DATABASE_INSERT_ERROR);
        }
    }
    public String login(MemberLoginReq loginReq) throws BaseException {
        Member member = memberRepository.findByEmail(loginReq.getEmail()).orElseThrow(() -> new BaseException(BaseResponseStatus.NON_EXIST_MEMBER));
        if (!Objects.equals(member.getPassword(), loginReq.getPassword())) {
            throw new BaseException(BaseResponseStatus.PASSWORD_NOT_MATCHED);
        }
        return "로그인에 성공하였습니다.";
    }
}
