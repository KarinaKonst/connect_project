package com.example.connect_project.controller;

import com.example.connect_project.entity.AtmEntity;
import com.example.connect_project.repository.AtmRepository;
import com.example.connect_project.service.AtmService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AtmController {

@Autowired
private AtmService atmService;

    @PostMapping("/savetobase")
    public String saveToBase(@RequestBody AtmEntity atm){
        String result = atmService.generateDateAndSaveToBase(atm);

        return result;
    }


    @GetMapping("/getinfo/{lastname}")
    public AtmEntity getInfo(@PathVariable String lastname){
        AtmEntity infoToLastname = atmService.getInfoToLastname(lastname);

        return infoToLastname;
    }
    @GetMapping("/getinf/{firstname}")
    public AtmEntity getInf(@PathVariable String firstname){
        AtmEntity infoToFirstName = atmService.getInfoToFirstname(firstname);

        return infoToFirstName;
    }
    @GetMapping("/getinfofirstname/{firstname}")
    public List<AtmEntity> getInfoFirstname(@PathVariable String firstname){
        List<AtmEntity> entitiesInfoToFirstname=atmService.getAtmEntitiesByFirstName(firstname);
        return entitiesInfoToFirstname;
    }



}
