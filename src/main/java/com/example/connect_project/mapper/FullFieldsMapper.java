package com.example.connect_project.mapper;

import com.example.connect_project.model.dto.AtmDto;
import com.example.connect_project.model.dto.ClientDto;
import com.example.connect_project.model.entity.ClientInfoEntity;
import org.springframework.stereotype.Component;

@Component
public class FullFieldsMapper {


    public ClientDto getFullMappingEntityToDto(ClientInfoEntity clientInfoEntity){

        AtmDto atmDto=new AtmDto();

        atmDto.setLocationPoint(clientInfoEntity.getAtmEntity().getLocationPoint());
        atmDto.setDateOperation(clientInfoEntity.getAtmEntity().getDateOperation());
        atmDto.setSumTransaction(clientInfoEntity.getAtmEntity().getSumTransaction());
        atmDto.setModelBankomat(clientInfoEntity.getAtmEntity().getModelBankomat());

        ClientDto clientDto= new ClientDto();

        clientDto.setAtmDto(atmDto);
        clientDto.setClientFullName(clientInfoEntity.getFirstName(), clientInfoEntity.getLastName());
        clientDto.setPhoneNumber(clientInfoEntity.getPhoneNumber());
        clientDto.setPasportNumber(clientInfoEntity.getPasportNumber());
        clientDto.setNumberCard(clientInfoEntity.getNumberCard());
        return clientDto;
    }
}
