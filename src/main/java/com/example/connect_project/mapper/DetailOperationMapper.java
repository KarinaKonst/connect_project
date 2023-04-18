package com.example.connect_project.mapper;

import com.example.connect_project.model.dto.AtmDto;
import com.example.connect_project.model.dto.ClientDto;
import com.example.connect_project.model.entity.ClientInfoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DetailOperationMapper {

    public ClientDto getMappingEntityToDto(ClientInfoEntity clientInfoEntity){

        AtmDto atmDto=new AtmDto();
        atmDto.setDateOperation(clientInfoEntity.getAtmEntity().getDateOperation());
        atmDto.setSumTransaction(clientInfoEntity.getAtmEntity().getSumTransaction());
        atmDto.setLocationPoint(clientInfoEntity.getAtmEntity().getLocationPoint());

        ClientDto clientDto= new ClientDto();
        clientDto.setAtmDto(atmDto);
        clientDto.setClientFullName(clientInfoEntity.getFirstName(), clientInfoEntity.getLastName());
        clientDto.setNumberCard(clientInfoEntity.getNumberCard());
        clientDto.setPhoneNumber(clientInfoEntity.getPhoneNumber());
        return clientDto;
    }



}
