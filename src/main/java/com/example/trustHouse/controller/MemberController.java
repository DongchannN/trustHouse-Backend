package com.example.trustHouse.controller;

import com.example.trustHouse.common.exception.BaseException;
import com.example.trustHouse.common.response.BaseResponse;
import com.example.trustHouse.dto.member.request.MemberLoginReq;
import com.example.trustHouse.dto.member.request.MemberSignupReq;
import com.example.trustHouse.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class MemberController {

    private final MemberService memberService;

    @PostMapping
    public BaseResponse<String> signup(@RequestBody MemberSignupReq signupReq) {
        try {
            String res = memberService.signup(signupReq);
            return new BaseResponse<>(res);
        } catch (BaseException e) {
            return new BaseResponse<>(e.getStatus());
        }
    }

    @PostMapping("/login")
    public BaseResponse<String> login(@RequestBody MemberLoginReq loginReq) {
        try {
            String res = memberService.login(loginReq);
            return new BaseResponse<>(res);
        } catch (BaseException e) {
            return new BaseResponse<>(e.getStatus());
        }
    }
}
