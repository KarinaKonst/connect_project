package com.example.connect_project.repository;

import com.example.connect_project.entity.AtmEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AtmRepository extends JpaRepository<AtmEntity,Long> {

    AtmEntity getAtmEntityByLastName (String lastname);
    AtmEntity getAtmEntityByFirstName (String firstname);
    List<AtmEntity> getAtmEntitiesByFirstName(String firstname);




}
