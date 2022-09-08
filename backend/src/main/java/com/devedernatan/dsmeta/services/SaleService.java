package com.devedernatan.dsmeta.services;

import java.util.List;

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
	
	public Page<Sale> findSales( Pageable pageable) {
		return repository.findAll(pageable);
	
		
	}
	
}
