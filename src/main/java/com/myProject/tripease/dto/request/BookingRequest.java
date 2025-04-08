package com.myProject.tripease.dto.request;

import lombok.*;

@NoArgsConstructor // default constructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class BookingRequest {

    private String pickup;
    private String destination;
    private double tripDistanceInKm;
}
