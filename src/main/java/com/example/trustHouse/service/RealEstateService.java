package com.example.trustHouse.service;

import com.example.trustHouse.common.exception.BaseException;
import com.example.trustHouse.common.response.BaseResponseStatus;
import com.example.trustHouse.dto.realEstate.request.RealEstateUploadReq;
import com.example.trustHouse.entity.Member;
import com.example.trustHouse.entity.RealEstate;
import com.example.trustHouse.repository.MemberRepository;
import com.example.trustHouse.repository.RealEstateRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@RequiredArgsConstructor
@Service
public class RealEstateService {

    private final RealEstateRepository realEstateRepository;
    private final MemberRepository memberRepository;

    public String upload(RealEstateUploadReq realEstateUploadReq, Long memberIdx) {
        Member seller = memberRepository.findById(memberIdx).orElseThrow(() -> new BaseException(BaseResponseStatus.NON_EXIST_MEMBER));
        RealEstate realEstate = RealEstateUploadReq.toEntity(realEstateUploadReq, seller);
        realEstateRepository.save(realEstate);
        return "부동산 업로드에 성공하였습니다.";
    }


}
