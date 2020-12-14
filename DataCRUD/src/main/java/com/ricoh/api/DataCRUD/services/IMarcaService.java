package com.ricoh.api.DataCRUD.services;

import com.ricoh.api.DataCRUD.entities.Marca;

public interface IMarcaService {
	
	public Marca findByMarcaId(Integer marcaID);
}