package com.myProject.tripease.service;

import com.myProject.tripease.Enum.Gender;
import com.myProject.tripease.dto.request.CustomerRequest;

import com.myProject.tripease.dto.response.CustomerResponse;
import com.myProject.tripease.exception.CustomerNotFoundException;
import com.myProject.tripease.model.Customer;
import com.myProject.tripease.respository.CustomerRepository;
import com.myProject.tripease.transformer.CustomerTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

//    public Customer addCustomer(Customer customer) {
//        System.out.println("Before Save: " + customer); // Debugging log
//        Customer savedCustomer = customerRepository.save(customer);
//        System.out.println("After Save: " + savedCustomer); // Debugging log
//        return savedCustomer;
//    }

    public CustomerResponse addCustomer(CustomerRequest customerRequest){
        // Request DTO to --> Entity conversion
        Customer customer = CustomerTransformer.customerRequestToCustomer(customerRequest);

        // save the entity to DB
        Customer savedCustomer = customerRepository.save(customer);

        // Saved entity --> Response DTO

        return CustomerTransformer.customerToCustomerResponse(customer);
    }

    public CustomerResponse getCustomer(int customerId) {

        Optional<Customer> optionalCustomer = customerRepository.findById(customerId);
        if(optionalCustomer.isEmpty()){
            throw new CustomerNotFoundException("Invalid customer id");
        }

        Customer savedCustomer = optionalCustomer.get();
        // Saved entity --> Response DTO
        return CustomerTransformer.customerToCustomerResponse(savedCustomer);
    }

    public List<CustomerResponse> getAllByGender(Gender gender) {
        List<Customer> customers = customerRepository.findByGender(gender);

        List<CustomerResponse> customerResponses = new ArrayList<>();
        for(Customer customer : customers){
            customerResponses.add(CustomerTransformer.customerToCustomerResponse(customer));
        }
        return customerResponses;
    }

    public List<CustomerResponse> getAllByGenderAndAge(Gender gender, int age) {
        List<Customer> customers = customerRepository.findByGenderAndAge(gender, age);
        List<CustomerResponse> customerResponses = new ArrayList<>();
        for(Customer customer : customers){
            customerResponses.add(CustomerTransformer.customerToCustomerResponse(customer));
        }
        return customerResponses;
    }

    public List<CustomerResponse> getAllByGenderAndAgeGreaterThan(Gender gender, int age) {
        List<Customer> customers = customerRepository.getAllByGenderAndAgeGreaterThan(gender, age);
        List<CustomerResponse> customerResponses = new ArrayList<>();
        for(Customer customer : customers){
            customerResponses.add(CustomerTransformer.customerToCustomerResponse(customer));
        }
        return customerResponses;
    }
}
