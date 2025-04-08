package com.myProject.tripease.transformer;

import com.myProject.tripease.dto.request.DriverRequest;
import com.myProject.tripease.dto.response.DriverResponse;
import com.myProject.tripease.model.Driver;

public class DriverTransformer {
    public static Driver driverRequestToDriver (DriverRequest driverRequest) {
        return Driver.builder()
                .name(driverRequest.getName())
                .age(driverRequest.getAge())
                .emailId(driverRequest.getEmailId())
                .build();
    }

    public static DriverResponse driverToDriverResponse (Driver driver){
        return DriverResponse.builder()
                .driverId(driver.getDriverId())
                .name(driver.getName())
                .age(driver.getAge())
                .emailId(driver.getEmailId())
                .build();
    }
}

