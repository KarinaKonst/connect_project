package com.example.connect_project.service;

import com.example.connect_project.model.dto.ClientDto;
import com.example.connect_project.model.entity.AtmEntity;
import com.example.connect_project.model.entity.ClientInfoEntity;

import java.util.List;

public interface AtmService {
    public String generateDateAndSaveToBase(AtmEntity atmEntity);
    public ClientInfoEntity getInfoToLastname(String lastname);
public ClientInfoEntity getInfoToFirstname(String firstname);
public List<ClientDto> getAtmEntitiesByFirstName(String firstname);
public List<ClientDto> getFullInfoByFirstName(String firstname);


}
