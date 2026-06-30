package com.affordmed.vehicleschedulerbe.service;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class depotService {
public List<String> getdepot(){
    return List.of("depot1","depot2","depot3");
    }
}
