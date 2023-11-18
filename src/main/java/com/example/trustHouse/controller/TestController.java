package com.example.trustHouse.controller;

import com.example.trustHouse.common.response.BaseResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public BaseResponse<String> getTest() {
        return new BaseResponse<>("test");
    }

    @GetMapping("/test/{str}")
    public BaseResponse<String> postTest(@PathVariable String str) {
        return new BaseResponse<>(str);
    }
}
