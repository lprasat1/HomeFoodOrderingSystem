package com.ethniconnect.homefoodorderingsystem.repository;

import com.ethniconnect.homefoodorderingsystem.entity.Chef;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChefRepository extends JpaRepository<Chef,Long> {
    /*
    Get Chef details by mobile number and mobile number can be used username.
     */
    Chef getChefsByMobileNumber(String mobileNumber);

    /*
    Call this service for getting list of Cuisines by passing zipcode. filter cuisines and send it to UI
     */
    List<Chef> getChefsByZipCode(String zipCode);

    /*
    Call this service to get list of chefs for the given cuisine id
    */
    List<Chef> getChefsByPreferredCuisineId(long cuisineId);
}
