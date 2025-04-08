package com.myProject.tripease.controller;

import com.myProject.tripease.dto.request.DriverRequest;
import com.myProject.tripease.dto.response.DriverResponse;
import com.myProject.tripease.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/driver")
public class DriverController {
    @Autowired
    DriverService driverService;
    @PostMapping("/add")
    public DriverResponse addDriver(@RequestBody DriverRequest driverRequest) {
        return driverService.addDriver (driverRequest);
    }
}
