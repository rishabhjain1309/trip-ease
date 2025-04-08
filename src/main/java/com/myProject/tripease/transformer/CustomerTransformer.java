package com.myProject.tripease.transformer;

import com.myProject.tripease.dto.request.CustomerRequest;
import com.myProject.tripease.dto.response.CustomerResponse;
import com.myProject.tripease.model.Customer;
import lombok.Builder;

public class CustomerTransformer {


    public static Customer customerRequestToCustomer(CustomerRequest customerRequest) {
//        Customer customer = new Customer();
//        customer.setName (customerRequest.getName());
//        customer.setAge (customerRequest.getAge());
//        customer.setEmailId(customerRequest.getEmailId());
//        customer.setGender (customerRequest.getGender());
        return Customer.builder()
                .name(customerRequest.getName())
                .age(customerRequest.getAge())
                .emailId(customerRequest.getEmailId())
                .gender (customerRequest.getGender())
                .build();
    }

    public static CustomerResponse customerToCustomerResponse (Customer customer) {
//        CustomerResponse customerResponse = new CustomerResponse();
//        customerResponse.setName(customer.getName());
//        customerResponse.setAge(customer.getAge());
//        customerResponse.setEmailId(customer.getEmailId());
        return CustomerResponse.builder()
                .name(customer.getName())
                .emailId(customer.getEmailId())
                .age(customer.getAge())
                .build();
    }
}
