package com.ethniconnect.homefoodorderingsystem.repository;

import com.ethniconnect.homefoodorderingsystem.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Long> {
    /*
    get entire menu for a week by passing chef Id
    eg: 1
     */
    List<Menu> getMenuByChefId(long chefId);

    /*
    get menu for a particular day by passing chef Id and day
    eg: 1, Monday
    */
    List<Menu> getMenuByChefIdAndDay(long chefId, String day);
}
