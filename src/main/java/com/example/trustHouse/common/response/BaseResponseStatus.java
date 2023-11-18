package com.example.trustHouse.common.response;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum BaseResponseStatus {
    /**
     * 성공 코드 2xx
     * 코드의 원활한 이해을 위해 code는 숫자가 아닌 아래 형태로 입력해주세요.
     */
    SUCCESS(true, HttpStatus.OK.value(), "요청에 성공하였습니다."),

    /**
     * Client Error - 4xx 에러
     */
    NO_AUTH(false, HttpStatus.UNAUTHORIZED.value(), "권한이 없습니다."),
    NON_EXIST_MEMBER(false, HttpStatus.NOT_FOUND.value(), "해당 이메일로 가입된 사용자가 없습니다."),
    PASSWORD_NOT_MATCHED(false, HttpStatus.UNAUTHORIZED.value(), "패스워드가 틀렸습니다."),
    EXIST_EMAIL(false, HttpStatus.CONFLICT.value(), "이미 존재하는 이메일입니다."),
    EXIST_NICKNAME(false, HttpStatus.CONFLICT.value(), "이미 존재하는 닉네임입니다."),

    /**
     * Server Error - 5xx 에러
     */
    IMAGE_INSERT_ERROR(false, HttpStatus.INTERNAL_SERVER_ERROR.value(), "이미지 저장에 실패하였습니다."),
    DATABASE_INSERT_ERROR(false, HttpStatus.INTERNAL_SERVER_ERROR.value(), "데이터베이스 저장에 실패하였습니다."),
    INTERNAL_SERVER_ERROR(false, HttpStatus.INTERNAL_SERVER_ERROR.value(), "알 수 없는 에러가 발생하였습니다."),
    ;

    private final boolean isSuccess;
    private final int code;
    private final String message;

    /**
     * isSuccess : 요청의 성공 또는 실패
     * code : Http Status Code
     * message : 설명
     */
    BaseResponseStatus(boolean isSuccess, int code, String message) {
        this.isSuccess = isSuccess;
        this.code = code;
        this.message = message;
    }
}
