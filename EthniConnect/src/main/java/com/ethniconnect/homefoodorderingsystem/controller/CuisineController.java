package com.ethniconnect.homefoodorderingsystem.controller;

import com.ethniconnect.homefoodorderingsystem.entity.Cuisine;

import com.ethniconnect.homefoodorderingsystem.service.CuisineService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CuisineController {
    @Autowired
    CuisineService cuisineService;
    @GetMapping("/getCuisinesList")
    public List<Cuisine> getCuisineList(){
        return cuisineService.getCuisineList();
    }

    @GetMapping("/getCuisinesByZip/{zipCode")
    public List<Cuisine> getCuisineList(@PathVariable String zipCode){

        return cuisineService.getCuisineList();
    }
}
