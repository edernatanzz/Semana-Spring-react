package com.devedernatan.dsmeta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devedernatan.dsmeta.entities.Sale;
import com.devedernatan.dsmeta.repositories.SalesRepository;

@Service //uma classe depender da outra
public class SaleService {
	
	@Autowired   // auto importar
	private SalesRepository repository;
	
	public List <Sale> findSales() {
	return repository.findAll();
		
	}
	
}
