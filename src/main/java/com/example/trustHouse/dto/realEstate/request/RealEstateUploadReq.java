package com.example.trustHouse.dto.realEstate.request;

import com.example.trustHouse.entity.Member;
import com.example.trustHouse.entity.RealEstate;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import java.time.LocalDateTime;

@Getter @Setter
public class RealEstateUploadReq {
    private String price; // 가격
    private String loan; // 융자(대출)
    private String extraCost; // 관리비
    private Boolean canParking; // 주차가능 여부
    private String buildingName; // 건물 이름
    private Integer floor; // 층
    private Double area; // 면적
    private Integer roomAmount; // 방 수
    private Integer toiletAmount; // 화장실 수
    private Integer totalHousehold; // 총 세대수
    private Integer totalParkingAmount; // 총 주차대수
    private LocalDateTime authorizationDate; // 사용 승인일
    private String usage; //건축물 용도
    private String options; // 옵션
    private String security; // 보안관련 옵션
    private String location; // 주소
    private Double longitude; // 경도
    private Double latitude; // 위도
    private String facility; // 주변 편의 시설

    static public RealEstate toEntity(RealEstateUploadReq realEstateUploadReq, Member seller) {
        return new RealEstate(
                realEstateUploadReq.getPrice(),
                realEstateUploadReq.getLoan(),
                realEstateUploadReq.getExtraCost(),
                realEstateUploadReq.getCanParking(),
                realEstateUploadReq.getBuildingName(),
                realEstateUploadReq.getFloor(),
                realEstateUploadReq.getArea(),
                realEstateUploadReq.getRoomAmount(),
                realEstateUploadReq.getToiletAmount(),
                realEstateUploadReq.getTotalHousehold(),
                realEstateUploadReq.getTotalParkingAmount(),
                realEstateUploadReq.getAuthorizationDate(),
                realEstateUploadReq.getUsage(),
                realEstateUploadReq.getOptions(),
                realEstateUploadReq.getSecurity(),
                realEstateUploadReq.getLocation(),
                realEstateUploadReq.getLongitude(),
                realEstateUploadReq.getLatitude(),
                realEstateUploadReq.getFacility(),
                seller
        );
    }
}
