package com.ricoh.api.DataCRUD.services;

import java.util.List;

import com.ricoh.api.DataCRUD.entities.Coche;

public interface ICocheService {
	
	public Coche add(Coche coche);
	public List<Coche> findAllCoches();
	public Coche update(Coche coche);
	public void delete(Coche coche);
	public Coche findByCocheId(Integer cocheID);
}