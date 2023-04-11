package com.example.connect_project.service.impl;

import com.example.connect_project.entity.AtmEntity;
import com.example.connect_project.repository.AtmRepository;
import com.example.connect_project.service.AtmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AtmServiceImpl implements AtmService {

    @Autowired
    private AtmRepository atmRepository;

    @Override
    public String generateDateAndSaveToBase(AtmEntity atmEntity) {

        atmEntity.setDateOperation();
        atmRepository.save(atmEntity);
        return "Запись осуществлена";


    }

    @Override
    public AtmEntity getInfoToLastname(String lastname) {
        AtmEntity atmEntityByLastName = atmRepository.getAtmEntityByLastName(lastname);
        return atmEntityByLastName;
    }

    @Override
    public AtmEntity getInfoToFirstname(String firstname) {
        AtmEntity atmEntityByFirstName= atmRepository.getAtmEntityByFirstName(firstname);
        return atmEntityByFirstName;
    }

    @Override
    public List<AtmEntity> getAtmEntitiesByFirstName(String firstname) {
        List<AtmEntity> atmEntities=atmRepository.getAtmEntitiesByFirstName(firstname);
        return atmEntities ;
    }




}

