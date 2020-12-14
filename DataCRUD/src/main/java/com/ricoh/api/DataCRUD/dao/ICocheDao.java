package com.ricoh.api.DataCRUD.dao;

import org.springframework.data.repository.CrudRepository;

import com.ricoh.api.DataCRUD.entities.Coche;

public interface ICocheDao extends CrudRepository<Coche, Integer>{
	
}