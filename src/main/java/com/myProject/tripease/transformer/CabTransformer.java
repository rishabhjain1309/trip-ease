package com.myProject.tripease.transformer;

import com.myProject.tripease.dto.request.CabRequest;
import com.myProject.tripease.dto.response.CabResponse;
import com.myProject.tripease.model.Cab;
import com.myProject.tripease.model.Driver;

public class CabTransformer {

    public static Cab cabRequestToCab (CabRequest cabRequest) {
        return Cab.builder()
                .cabNumber(cabRequest.getCabNumber())
                .cabModel(cabRequest.getCabmodel())
                .perKmRate(cabRequest.getPerKmRate())
                .available(true)
                .build();
    }

    public static CabResponse cabToCabResponse (Cab cab, Driver driver) {
        return CabResponse.builder()
                .cabNumber(cab.getCabNumber())
                .perKmRate(cab.getPerKmRate())
                .cabmodel(cab.getCabModel())
                .available(cab.isAvailable())
                .driver(DriverTransformer.driverToDriverResponse(driver))
                .build();
    }
}
