package com.devedernatan.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devedernatan.dsmeta.entities.Sale;

//classe responsavel pelo banco de dados

public interface SalesRepository extends JpaRepository <Sale , Long> {

}
