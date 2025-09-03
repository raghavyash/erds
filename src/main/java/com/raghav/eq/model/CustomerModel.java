package com.raghav.eq.model;

import com.raghav.eq.entity.CustomerAddressEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerModel {

    private String email;
    private String firstName;
    private String lastName;
    private String gender;
    private String address;
    private String zipCode;
    private String location;
    private String city;
    private String customerStatus;
    private CustomerAddressModel customerAddressModel;
}
