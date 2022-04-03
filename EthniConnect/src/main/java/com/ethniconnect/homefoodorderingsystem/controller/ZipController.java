package com.ethniconnect.homefoodorderingsystem.controller;

import com.ethniconnect.homefoodorderingsystem.entity.Zip;
import com.ethniconnect.homefoodorderingsystem.service.ZipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ZipController {
    @Autowired
    ZipService zipService;
    @GetMapping("/getZipCodes")
    public List<Zip> getZipCodes(){
        return zipService.getZipList();
    }
}
