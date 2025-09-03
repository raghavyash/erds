package com.raghav.eq.service;

import com.raghav.eq.model.CustomerModel;

public interface CustomerService {
    CustomerModel getCustomerDetail(String email);
     void saveCustomerDetail(CustomerModel model);
}
