package com.example.connect_project.model.entity;

import com.example.connect_project.model.entity.AtmEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity
@ToString
@Getter
@Setter
@Table(name="client_info_table")
public class ClientInfoEntity {
    @Id
    @SequenceGenerator(name="client_info_tableSequence", sequenceName="client_info_table_sequence", allocationSize = 1,initialValue =1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="client_info_tableSequence")
    @Column(name = "id")
    private Long id;

    @Column(name="first_name")
    private  String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="number_card")
    private  String numberCard;


    @Column(name="pasport_number")
    private  String pasportNumber;

    @Column(name="phone_number")
    private  String phoneNumber;

    @ManyToOne
    @JoinColumn(name="atm_id")
    private AtmEntity atmEntity;

}
