package com.myProject.tripease.dto.response;

import com.myProject.tripease.dto.response.DriverResponse;
import lombok.*;

@NoArgsConstructor // default constructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class CabResponse {
    private String cabNumber;
    private String cabmodel;
    private double perKmRate;
    private boolean available;
    private DriverResponse driver;
}