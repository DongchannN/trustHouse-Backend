package com.example.trustHouse.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "REAL_ESTATE")
public class RealEstate {
    @Id
    @GeneratedValue
    private Long id;


    @Column
    private String price; // 가격

    @Column
    private String loan; // 융자(대출)

    @Column
    private String extraCost; // 관리비

    @Column
    private Boolean canParking; // 주차가능 여부

    @Column
    private String buildingName; // 건물 이름

    @Column
    private Integer floor; // 층

    @Column
    private Double area; // 면적

    @Column
    private Integer roomAmount; // 방 수

    @Column
    private Integer toiletAmount; // 화장실 수

    @Column
    private Integer totalHousehold; // 총 세대수

    @Column
    private Integer totalParkingAmount; // 총 주차대수

    @Column
    private LocalDateTime authorizationDate; // 사용 승인일

    @Column
    private String usage; //건축물 용도

    @Column
    private String options; // 옵션

    @Column
    private String security; // 보안관련 옵션

    @Column
    private String location; // 주소

    @Column
    private Double longitude; // 경도

    @Column
    private Double latitude; // 위도

    @Column
    private String facility; // 주변 편의 시설

    @JoinColumn(name = "SELLER")
    @ManyToOne
    private Member seller;


    public RealEstate(String price, String loan, String extraCost, Boolean canParking, String buildingName, Integer floor, Double area, Integer roomAmount, Integer toiletAmount, Integer totalHousehold, Integer totalParkingAmount, LocalDateTime authorizationDate, String usage, String options, String security, String location, Double longitude, Double latitude, String facility, Member seller) {
        this.price = price;
        this.loan = loan;
        this.extraCost = extraCost;
        this.canParking = canParking;
        this.buildingName = buildingName;
        this.floor = floor;
        this.area = area;
        this.roomAmount = roomAmount;
        this.toiletAmount = toiletAmount;
        this.totalHousehold = totalHousehold;
        this.totalParkingAmount = totalParkingAmount;
        this.authorizationDate = authorizationDate;
        this.usage = usage;
        this.options = options;
        this.security = security;
        this.location = location;
        this.longitude = longitude;
        this.latitude = latitude;
        this.facility = facility;
        this.seller = seller;
    }
}
