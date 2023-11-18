package com.example.trustHouse.entity;

import com.example.trustHouse.common.entity.BaseEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "MEMBER")
public class Member extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String email;

    @Column
    private String password;

    @Column
    private String username;

    @Column
    private String nickname;

    @Column
    private String birth;

    @Column
    private String memberType;

    public Member(String email, String password, String username, String nickname, String birth, String memberType) {
        this.email = email;
        this.password = password;
        this.username = username;
        this.nickname = nickname;
        this.birth = birth;
        this.memberType = memberType;
    }
}
