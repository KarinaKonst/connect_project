package com.example.connect_project.controller;

import com.example.connect_project.model.dto.ClientDto;
import com.example.connect_project.model.entity.AtmEntity;
import com.example.connect_project.model.entity.ClientInfoEntity;
import com.example.connect_project.service.AtmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AtmController {

    @Autowired
    private AtmService atmService;

    @PostMapping("/savetobase")
    public String saveToBase(@RequestBody AtmEntity atm) {
        String result = atmService.generateDateAndSaveToBase(atm);

        return result;
    }


    @GetMapping("/getinfo/{lastname}")
    public ClientInfoEntity getInfo(@PathVariable String lastname) {
        ClientInfoEntity infoToLastname = atmService.getInfoToLastname(lastname);

        return infoToLastname;
    }

    @GetMapping("/getinf/{firstname}")
    public ClientInfoEntity getInf(@PathVariable String firstname) {
        ClientInfoEntity infoToFirstName = atmService.getInfoToFirstname(firstname);

        return infoToFirstName;
    }

    @GetMapping("/getinfofirstname/{firstname}")
    public List<ClientDto> getInfoFirstname(@PathVariable String firstname) {
        List<ClientDto> entitiesInfoToFirstname = atmService.getFullInfoByFirstName(firstname);
        return entitiesInfoToFirstname;
    }


}
