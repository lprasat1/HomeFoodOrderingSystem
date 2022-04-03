package com.ethniconnect.homefoodorderingsystem.repository;

import com.ethniconnect.homefoodorderingsystem.entity.Zip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface ZipRepository extends JpaRepository<Zip,Long> {

}
