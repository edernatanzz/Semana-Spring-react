package com.devedernatan.dsmeta.services;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import org.springframework.stereotype.Service;

import com.devedernatan.dsmeta.entities.Sale;
import com.devedernatan.dsmeta.repositories.SalesRepository;


@Service //
public class SaleService {
	
	@Autowired
	private SalesRepository repository;
	
	public Page<Sale> findSales( String minDate , String maxDate , Pageable pageable) {

		LocalDate today = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault());//criar data com o dia de hoje



		LocalDate min  = minDate.equals("") ? today.minusDays(365) : LocalDate.parse(minDate);//converter datas em texto para o tipo localdate java
		LocalDate max  = maxDate.equals("") ? today : LocalDate.parse(maxDate); //converter datas em texto para o tipo localdate java
		return repository.findSales(min , max , pageable);

	}
	}