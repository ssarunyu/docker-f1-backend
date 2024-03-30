package com.example.formula1.controller;

import com.example.formula1.Service.DriverService;
import com.example.formula1.model.Driver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// FIX cors
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@RestController
// Front end URL and port you setting on docker container
//@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("api/v1/")
public class DriverController {
    private final DriverService driverService;

    @Autowired
    public DriverController(DriverService driverService) {
        this.driverService = driverService;
    }

    @GetMapping("/drivers/2022")
    public List<Driver> getItems() {
        return driverService.getAllItems();
    }
}
