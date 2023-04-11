package com.example.connect_project.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;


@Entity
@Getter
@Setter
@Table(name="atm_detail_info")
public class AtmEntity {

    @Id
    @SequenceGenerator(name="atm_detail_infoSequence", sequenceName="atm_detail_info_sequence", allocationSize = 1,initialValue =1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="atm_detail_infoSequence")
    @Column(name = "id")
    private Long id;


    @Column(name="date_operation")
    private LocalDate dateOperation;


    @Column(name="first_name")
    private  String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="number_card")
    private  String numberCard;

    @Column(name="sum_transaction")
    private  String sumTransaction;
    @Column(name="location_point")
    private  String locationPoint;


    public void setDateOperation() {
        this.dateOperation = LocalDate.now();
    }

}
