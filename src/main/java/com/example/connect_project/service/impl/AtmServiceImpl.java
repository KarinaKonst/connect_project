package com.example.connect_project.service.impl;

import com.example.connect_project.mapper.DetailOperationMapper;
import com.example.connect_project.mapper.FullFieldsMapper;
import com.example.connect_project.model.dto.ClientDto;
import com.example.connect_project.model.entity.AtmEntity;
import com.example.connect_project.model.entity.ClientInfoEntity;
import com.example.connect_project.repository.AtmRepository;
import com.example.connect_project.repository.ClietInfoRepository;
import com.example.connect_project.service.AtmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class AtmServiceImpl implements AtmService {

    @Autowired
    private AtmRepository atmRepository;

    @Autowired
    private ClietInfoRepository clietInfoRepository;
    @Autowired
    private DetailOperationMapper detailOperationMapper;
    @Autowired
   private FullFieldsMapper fullFieldsMapper;

    @Override
    public String generateDateAndSaveToBase(AtmEntity atmEntity) {

        atmEntity.setDateOperation();
        atmRepository.save(atmEntity);
        return "Запись осуществлена";


    }

    @Override
    public ClientInfoEntity getInfoToLastname(String lastname) {
        ClientInfoEntity atmEntityByLastName = clietInfoRepository.getAtmEntityByLastName(lastname);
        return atmEntityByLastName;
    }

    @Override
    public ClientInfoEntity getInfoToFirstname(String firstname) {
        ClientInfoEntity atmEntityByFirstName= clietInfoRepository.getAtmEntityByFirstName(firstname);
        return atmEntityByFirstName;
    }

    @Override
    public List<ClientDto> getAtmEntitiesByFirstName(String firstname) {
        List<ClientInfoEntity> atmEntities=clietInfoRepository.getAtmEntitiesList(firstname);
        List<ClientDto> resultList=new ArrayList<>();

        for(ClientInfoEntity o:atmEntities){
            ClientDto mappingEntityToDto = detailOperationMapper.getMappingEntityToDto(o);
            resultList.add(mappingEntityToDto);
        }


        return resultList ;
    }

public List<ClientDto> getFullInfoByFirstName(String firstname){
        List<ClientInfoEntity> entities=clietInfoRepository.getAtmEntitiesList(firstname);
        List<ClientDto> listResult=new ArrayList<>();

        for(ClientInfoEntity a:entities){
            ClientDto mappingEntityToDto= fullFieldsMapper.getFullMappingEntityToDto(a);
            listResult.add(mappingEntityToDto);
        }
        return listResult;
}



}

