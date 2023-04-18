package com.example.connect_project.model.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
public class AtmDto {

    private LocalDate dateOperation;

    private String sumTransaction;

    private String locationPoint;
    private String modelBankomat;


}
