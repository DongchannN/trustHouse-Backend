package com.example.trustHouse.dto.member.request;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class MemberLoginReq {
    private String email;
    private String password;
}
