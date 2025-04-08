package com.myProject.tripease.controller;

import com.myProject.tripease.dto.request.BookingRequest;
import com.myProject.tripease.dto.response.BookingResponse;
import com.myProject.tripease.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/booking")
public class BookingController {

    @Autowired
    BookingService bookingService;
    @PostMapping("/book/customer/{customerId}")
    public BookingResponse bookCab (@RequestBody BookingRequest bookingRequest,
                                    @PathVariable("customerId") int customerId) {
        return bookingService.bookCab(bookingRequest, customerId);
    }
}
