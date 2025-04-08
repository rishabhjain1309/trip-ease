package com.myProject.tripease.transformer;

import com.myProject.tripease.Enum.TripStatus;
import com.myProject.tripease.dto.request.BookingRequest;
import com.myProject.tripease.dto.response.BookingResponse;
import com.myProject.tripease.model.Booking;
import com.myProject.tripease.model.Cab;
import com.myProject.tripease.model.Customer;
import com.myProject.tripease.model.Driver;

public class BookingTransformer {

    public static Booking bookingRequestToBooking (BookingRequest bookingRequest, double perKmRate) {
        return Booking.builder()
                .pickup(bookingRequest.getPickup())
                .destination(bookingRequest.getDestination())
                .tripDistanceInKm(bookingRequest.getTripDistanceInKm())
                .tripStatus(TripStatus.In_PROGRESS)
                .billAmount(bookingRequest.getTripDistanceInKm() * perKmRate)
                .build();
    }

    public static BookingResponse bookingToBookingResponse
            (Booking booking,
             Customer customer,
             Cab cab,
             Driver driver) {
        return BookingResponse.builder()
                .pickup(booking.getPickup())
                .destination(booking.getDestination())
                .tripDistanceInKm(booking.getTripDistanceInKm())
                .tripStatus(booking.getTripStatus())
                .billAmount(booking.getBillAmount())
                .bookedAt(booking.getBookedAt())
                .lastUpdateAt(booking.getLastUpdateAt())
                .customer(CustomerTransformer.customerToCustomerResponse(customer))
                .cab(CabTransformer.cabToCabResponse(cab, driver))
                .build();
    }
}
