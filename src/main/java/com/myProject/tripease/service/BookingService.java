package com.myProject.tripease.service;

import com.myProject.tripease.dto.request.BookingRequest;
import com.myProject.tripease.dto.response.BookingResponse;
import com.myProject.tripease.exception.CabUnavailableException;
import com.myProject.tripease.exception.CustomerNotFoundException;
import com.myProject.tripease.model.Booking;
import com.myProject.tripease.model.Cab;
import com.myProject.tripease.model.Customer;
import com.myProject.tripease.model.Driver;
import com.myProject.tripease.respository.BookingRepository;
import com.myProject.tripease.respository.CabRepository;
import com.myProject.tripease.respository.CustomerRepository;
import com.myProject.tripease.respository.DriverRepository;
import com.myProject.tripease.transformer.BookingTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookingService {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CabRepository cabRepository;

    @Autowired
    DriverRepository driverRepository;

    @Autowired
    BookingRepository bookingRepository;

    public BookingResponse bookCab(BookingRequest bookingRequest, int customerId ) {

        Optional<Customer> optionalCustomer = customerRepository.findById(customerId);
        if(optionalCustomer.isEmpty()){
            throw new CustomerNotFoundException("Invalid customer Id");
        }
        Customer customer = optionalCustomer.get();
        Cab availableCab = cabRepository.getAvailableCabRandomly();
        if(availableCab==null){
            throw new CabUnavailableException("Sorry! No cabs available");
        }
        Booking booking = BookingTransformer.bookingRequestToBooking(bookingRequest, availableCab.getPerKmRate());
        Booking savedBooking = bookingRepository.save(booking);
        availableCab.setAvailable(false);
        customer.getBookings().add(booking);
        Driver driver = driverRepository.getDriverByCabId(availableCab.getCabId());
        driver.getBookings().add(booking);

        Customer savedCustomer =customerRepository.save(customer);
        Driver savedDriver = driverRepository.save(driver);
        return BookingTransformer.bookingToBookingResponse(savedBooking, savedCustomer, availableCab, savedDriver);
    }
}
