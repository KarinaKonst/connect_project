package com.example.connect_project.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;


@Entity
@Getter
@Setter
@ToString
@Table(name = "atm_detail_info")
public class AtmEntity {

    @Id
    @SequenceGenerator(name = "atm_detail_infoSequence", sequenceName = "atm_detail_info_sequence", allocationSize = 1, initialValue = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "atm_detail_infoSequence")
    @Column(name = "id")
    private Long id;


    @Column(name = "date_operation")
    private LocalDate dateOperation;


    @Column(name = "sum_transaction")
    private String sumTransaction;
    @Column(name = "location_point")
    private String locationPoint;
    @Column(name = "model_bankomat")
    private String modelBankomat;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "atmEntity")
    private List<ClientInfoEntity> clientInfoEntityList;


    public void setDateOperation() {
        this.dateOperation = LocalDate.now();
    }


}
