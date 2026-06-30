package com.affordmed.vehicleschedulerbe.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class depotController {
    @RequestMapping("/depot")
    public String depot(){
        return "Depot";
    }
}
