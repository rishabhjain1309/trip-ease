package com.myProject.tripease.controller;

import com.myProject.tripease.dto.request.CabRequest;
import com.myProject.tripease.dto.response.CabResponse;
import com.myProject.tripease.service.CabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cab")
public class CabController {

    @Autowired
    CabService cabService;

    @PostMapping("/register/driver/{driverId}")
    public CabResponse registerCab(@RequestBody CabRequest cabRequest,
                                   @PathVariable("driverId") int driverId){
        return cabService.registerCab(cabRequest, driverId);
    }
}
