package com.example.connect_project.repository;

import com.example.connect_project.model.entity.AtmEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtmRepository extends JpaRepository<AtmEntity,Long> {







}
