package com.raghav.eq.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerAddressModel {
    private Long id;
    private String address1;
    private String address2;
    private String zipCode;
    private String location;
    private String city;
    private String state;
    private String country;
    private String addressType;
    private String availableTime;
    private String status;
}
