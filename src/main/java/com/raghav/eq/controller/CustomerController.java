package com.raghav.eq.controller;

import com.raghav.eq.model.CustomerModel;
import com.raghav.eq.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @GetMapping("/validate")
    public ResponseEntity<CustomerModel> validateCustomerEmailDetails(@RequestParam String email){
        CustomerModel customerModel =customerService.getCustomerDetail(email);
        return new ResponseEntity<>(customerModel, HttpStatus.OK);

    }
    @GetMapping("/getDetail")
    public ResponseEntity<CustomerModel> getCustomerDetail(@RequestParam String email){
        CustomerModel customerModel =customerService.getCustomerDetail(email);
        return new ResponseEntity<>(customerModel, HttpStatus.OK);

    }
    @PostMapping("/save/newCustomer")
    public ResponseEntity<String> saveCustomerDetail(@RequestBody CustomerModel customerModel){
        customerService.saveCustomerDetail(customerModel);
        return new ResponseEntity<>("Successfully Save Customer Details", HttpStatus.OK);

    }
}

