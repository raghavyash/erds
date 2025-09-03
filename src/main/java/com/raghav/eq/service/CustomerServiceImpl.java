package com.raghav.eq.service;

import com.raghav.eq.entity.CustomerAddressEntity;
import com.raghav.eq.entity.CustomerEntity;
import com.raghav.eq.helper.CustomerHelper;
import com.raghav.eq.model.CustomerModel;
import com.raghav.eq.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerRepository customerRepository;

    public CustomerModel getCustomerDetail(String email) {
        CustomerEntity emp=  customerRepository.findByEmail(email);
        CustomerModel customerModel = new CustomerModel();
        if(emp!= null) {
            customerModel.setEmail(emp.getEmail());
            customerModel.setFirstName(emp.getFirstName());
            customerModel.setCustomerStatus(emp.getCustomerStatus());
        }
        return customerModel;
    }

    public void saveCustomerDetail(CustomerModel model) {
        CustomerEntity entity=CustomerHelper.changeEntityToModel(model);
        customerRepository.save(entity);
    }
}
