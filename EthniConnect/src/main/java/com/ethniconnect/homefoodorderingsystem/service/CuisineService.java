package com.ethniconnect.homefoodorderingsystem.service;

import com.ethniconnect.homefoodorderingsystem.entity.Chef;
import com.ethniconnect.homefoodorderingsystem.entity.Cuisine;

import com.ethniconnect.homefoodorderingsystem.repository.ChefRepository;
import com.ethniconnect.homefoodorderingsystem.repository.CuisineRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CuisineService {
    @Autowired
    CuisineRepository cuisineRepository;
    @Autowired
    ChefRepository chefRepository;
    public List<Cuisine> getCuisineList(){
        return cuisineRepository.findAll();
    }
   /* public List<Cuisine> getCuisineByZip(String zipCode){
        List<Chef> chef = chefRepository.getChefsByZipCode(zipCode);
       *//* if(!chef.isEmpty()){
            chef.stream().
        }*//*
    }*/
}
