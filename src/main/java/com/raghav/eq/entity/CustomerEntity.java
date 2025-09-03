package com.raghav.eq.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "customer")
@SequenceGenerator(name="seq", initialValue=1, allocationSize=1)
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="CustomerSEQ")
    @SequenceGenerator(name="CustomerSEQ",initialValue=1, allocationSize=100)
    @Column(name="ID")
    private Long id;
    @Column(name = "EMAIL")
    private String email;
    @Column(name="FIRST_NAME")
    private String firstName;
    @Column(name="LAST_NAME")
    private String lastName;
    @Column(name = "DATE_OF_BIRTH")
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;
    @Column(name = "GENDER")
    private String gender;
    @Column(name="CUSTOMER_STATUS")
    private String customerStatus;
    @OneToMany(mappedBy = "customerEntity", cascade = CascadeType.ALL)
    private Set<CustomerAddressEntity> customerAddressList;

    @Column(name = "CREATED_AT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(name = "CREATED_BY")
    private String createdBy;
    @Column(name = "UPDATED_BY")
    private String updatedBy;
    @Column(name = "UPDATED_AT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

}
