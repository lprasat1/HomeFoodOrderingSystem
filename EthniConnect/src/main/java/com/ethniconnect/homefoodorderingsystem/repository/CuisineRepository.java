package com.ethniconnect.homefoodorderingsystem.repository;

import com.ethniconnect.homefoodorderingsystem.entity.Cuisine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CuisineRepository extends JpaRepository<Cuisine,Long> {

    List<Cuisine> findAll();
}
