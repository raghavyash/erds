package com.raghav.eq.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "customer_address")

public class CustomerAddressEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator="CustomerAddressSEQ")
    @SequenceGenerator(name="CustomerAddressSEQ",initialValue=1, allocationSize=100)
    private Long id;

    @Column(name = "ADDRESS1")
    private String address1;

    @Column(name = "ADDRESS2")
    private String address2;
    @Column(name = "ZIP_CODE")
    private String zipCode;
    @Column(name = "LOCATION")
    private String location;
    @Column(name = "CITY")
    private String city;
    @Column(name = "STATE")
    private String state;
    @Column(name = "COUNTRY")
    private String country;

    @Column(name = "ADDRESS_TYPE")
    private String addressType;//HOME ,OFFICE
    @Column(name = "AVAILABLE_TIME")
    private String availableTime;
    @Column(name = "status")
    private String status;

    @ManyToOne
    @JoinColumn(name = "CUSTOMER_ID")
    private CustomerEntity customerEntity;
}
