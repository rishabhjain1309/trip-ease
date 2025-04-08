package com.myProject.tripease.service;

import com.myProject.tripease.dto.request.DriverRequest;
import com.myProject.tripease.dto.response.DriverResponse;
import com.myProject.tripease.model.Driver;
import com.myProject.tripease.respository.DriverRepository;
import com.myProject.tripease.transformer.DriverTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DriverService {

    @Autowired
    DriverRepository driverRepository;

    public DriverResponse addDriver (DriverRequest driverRequest) {
        Driver driver = DriverTransformer.driverRequestToDriver (driverRequest);
        Driver savedDriver = driverRepository.save(driver);
        return DriverTransformer.driverToDriverResponse(savedDriver);
    }
}
