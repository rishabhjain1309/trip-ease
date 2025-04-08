package com.myProject.tripease.service;

import com.myProject.tripease.dto.request.CabRequest;
import com.myProject.tripease.dto.response.CabResponse;
import com.myProject.tripease.exception.DriverNotFoundException;
import com.myProject.tripease.model.Cab;
import com.myProject.tripease.model.Driver;
import com.myProject.tripease.respository.DriverRepository;
import com.myProject.tripease.transformer.CabTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CabService {

    @Autowired
    DriverRepository driverRepository;

    public CabResponse registerCab(CabRequest cabRequest, int driverId) {

        Optional<Driver> optionalDriver = driverRepository.findById(driverId);
        if(optionalDriver.isEmpty()){
            throw new DriverNotFoundException("Invalid Driver Id!");
        }
        Driver driver = optionalDriver.get();
        Cab cab = CabTransformer.cabRequestToCab (cabRequest);
        driver.setCab(cab);
        Driver savedDriver = driverRepository.save(driver);  // save both: driver and cab

        return CabTransformer.cabToCabResponse(savedDriver.getCab(), savedDriver);
    }
}
