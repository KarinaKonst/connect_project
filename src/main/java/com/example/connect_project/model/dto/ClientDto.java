package com.example.connect_project.model.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class ClientDto {

    private String clientFullName;


    private String numberCard;

    private  String pasportNumber;
    private String phoneNumber;

    private AtmDto atmDto;


    public void setClientFullName(String firstName, String lastName) {
        this.clientFullName = firstName + " " + lastName;
    }

//    public void setNumberCard(String numberCard) {
//        String o = "**** **** **** ";
//        this.numberCard = o + numberCard.substring(15);
//    }
//
//    public void setPhoneNumber(String phoneNumber) {
//        String a = "+*******";
//        this.phoneNumber = a + phoneNumber.substring(8);
//    }
}
