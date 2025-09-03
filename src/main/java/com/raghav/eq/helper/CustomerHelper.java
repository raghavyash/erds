package com.raghav.eq.helper;

import com.raghav.eq.entity.CustomerAddressEntity;
import com.raghav.eq.entity.CustomerEntity;
import com.raghav.eq.model.CustomerModel;

import java.util.HashSet;
import java.util.Set;

public class CustomerHelper {

    public static CustomerEntity changeEntityToModel(CustomerModel model){
        CustomerEntity entity= new CustomerEntity();
        entity.setCustomerStatus("Active");
        entity.setEmail(model.getEmail());
        entity.setFirstName(model.getFirstName());
        entity.setLastName(model.getLastName());
        entity.setGender(model.getGender());
        CustomerAddressEntity customerAddressEntity= new CustomerAddressEntity();
        customerAddressEntity.setAddress1(model.getCustomerAddressModel().getAddress1());
        customerAddressEntity.setAddress2(model.getCustomerAddressModel().getAddress2());
        Set<CustomerAddressEntity> addressEntitySet= new HashSet<>();
        addressEntitySet.add(customerAddressEntity);
        entity.setCustomerAddressList(addressEntitySet);
        return entity;
    }
}
