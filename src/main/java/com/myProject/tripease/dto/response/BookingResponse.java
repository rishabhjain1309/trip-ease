package com.myProject.tripease.dto.response;


import com.myProject.tripease.Enum.TripStatus;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@NoArgsConstructor // default constructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class BookingResponse {

    String pickup;
    String destination;
    double tripDistanceInKm;
    TripStatus tripStatus;
    double billAmount;
    Date bookedAt;
    Date lastUpdateAt;

    CustomerResponse customer;
    CabResponse cab;
}
