package com.example.connect_project.service;

import com.example.connect_project.entity.AtmEntity;

import java.util.List;

public interface AtmService {
    public String generateDateAndSaveToBase(AtmEntity atmEntity);
    public AtmEntity getInfoToLastname(String lastname);
public AtmEntity getInfoToFirstname(String firstname);
public List<AtmEntity> getAtmEntitiesByFirstName(String firstname);


}
