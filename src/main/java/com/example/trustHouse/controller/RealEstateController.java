package com.example.trustHouse.controller;

import com.example.trustHouse.common.exception.BaseException;
import com.example.trustHouse.common.response.BaseResponse;
import com.example.trustHouse.dto.realEstate.request.RealEstateUploadReq;
import com.example.trustHouse.service.RealEstateService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class RealEstateController {

    private final RealEstateService realEstateService;

    @PostMapping("/estate/upload")
    public BaseResponse<String> uploadRealEstate(RealEstateUploadReq realEstateUploadReq) {
        try {
            String res = realEstateService.upload(realEstateUploadReq, 1L);// todo : 로그인 방식 정할 시 적용.
            return new BaseResponse<>(res);
        } catch (BaseException e) {
            return new BaseResponse<>(e.getStatus());
        }
    }
}
