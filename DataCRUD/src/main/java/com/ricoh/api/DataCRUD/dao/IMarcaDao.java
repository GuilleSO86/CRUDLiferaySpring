package com.ricoh.api.DataCRUD.dao;

import org.springframework.data.repository.CrudRepository;

import com.ricoh.api.DataCRUD.entities.Marca;

public interface IMarcaDao extends CrudRepository<Marca, Integer> {

}