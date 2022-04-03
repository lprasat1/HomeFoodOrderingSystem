package com.ethniconnect.homefoodorderingsystem.service;

import com.ethniconnect.homefoodorderingsystem.entity.Zip;
import com.ethniconnect.homefoodorderingsystem.repository.ZipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZipService {
    @Autowired
    ZipRepository zipRepository;
    public List<Zip> getZipList(){
       return zipRepository.findAll();
    }

}
