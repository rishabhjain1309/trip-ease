package com.myProject.tripease.controller;

import com.myProject.tripease.Enum.Gender;
import com.myProject.tripease.dto.request.CustomerRequest;
import com.myProject.tripease.dto.response.CustomerResponse;
import com.myProject.tripease.model.Customer;
import com.myProject.tripease.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer" )
public class CustomerController {

    @Autowired
    CustomerService customerService;

//    @PostMapping("/add")
//    public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer) {
//        System.out.println("Received Customer: " + customer); // Debugging log
//        Customer savedCustomer = customerService.addCustomer(customer);
//        return ResponseEntity.ok(savedCustomer);
//    }

    @PostMapping("/add")
    public CustomerResponse addCustomer(@RequestBody CustomerRequest customerRequest){
        return customerService.addCustomer(customerRequest);
    }


    @GetMapping("/get/Customer-id/{id}")
    public CustomerResponse getCustomer(@PathVariable("id") int customerId){
        return customerService.getCustomer(customerId);
    }

    @GetMapping("/get/gender/{gender}")
    public List<CustomerResponse> getAllByGender(Gender gender){
        return customerService.getAllByGender(gender);
    }

    // get all the people of a particular gender and age. ex all males of age 25
    @GetMapping("/get")
    public List<CustomerResponse> getAllByGenderAndAge(@RequestParam("gender") Gender gender,
                                                       @RequestParam("age") int age){
        return customerService.getAllByGenderAndAge(gender, age);
    }

    @GetMapping("/get-by-age")
    public List<CustomerResponse> getAllByGenderAndAgeGreaterThan(@RequestParam("gender") Gender gender,
                                                       @RequestParam("age") int age) {
        return customerService.getAllByGenderAndAgeGreaterThan(gender, age);
    }
}
