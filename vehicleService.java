package com.affordmed.vehicleschedulerbe.service;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class vehicleService {
    public List<String> getVehicles() {
        return List.of("Vehicle 1","Vehicle 2","Vehicle 3");

    }
}