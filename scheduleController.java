package com.affordmed.vehicleschedulerbe.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class scheduleController {
    @RequestMapping("/schedule")
    public String schedule(){
        return " Schedule";
    }
}
