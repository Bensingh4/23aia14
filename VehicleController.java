package com.affordmed.vehicleschedulerbe.controller;

import com.affordmed.vehicleschedulerbe.service.vehicleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehicleController {
    @RequestMapping("/vehicle")
    public String vehicle(){
        return" vehicle";
    }
}
