package com.example.trustHouse.dto.member.request;

import com.example.trustHouse.entity.Member;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
public class MemberSignupReq {
    private String email;
    private String password;
    private String username;
    private String nickname;
    private String birth;
    private String memberType;

    static public Member toEntity(MemberSignupReq memberSignupReq) {
        return new Member(
                memberSignupReq.getEmail(),
                memberSignupReq.getPassword(),
                memberSignupReq.getUsername(),
                memberSignupReq.getNickname(),
                memberSignupReq.getBirth(),
                memberSignupReq.getMemberType()
        );
    }
}
