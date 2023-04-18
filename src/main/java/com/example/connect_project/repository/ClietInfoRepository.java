package com.example.connect_project.repository;

import com.example.connect_project.model.entity.ClientInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClietInfoRepository extends JpaRepository<ClientInfoEntity,Long> {
    ClientInfoEntity getAtmEntityByLastName (String lastname);
    ClientInfoEntity getAtmEntityByFirstName (String firstname);
    List<ClientInfoEntity> getAtmEntitiesByFirstName(String firstname);
    List<ClientInfoEntity> getFullInfoByFirstName(String firstname);


    @Query("SELECT a FROM ClientInfoEntity a where a.firstName= ?1")
    List<ClientInfoEntity> getAtmEntitiesList(String firstname);

}
