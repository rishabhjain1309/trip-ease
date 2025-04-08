package com.myProject.tripease.dto.request;

import lombok.*;

@NoArgsConstructor // default constructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class CabRequest {
    private String cabNumber;
    private String cabmodel;
    private double perKmRate;
}
