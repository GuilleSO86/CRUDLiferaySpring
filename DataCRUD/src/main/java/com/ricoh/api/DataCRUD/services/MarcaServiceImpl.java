package com.ricoh.api.DataCRUD.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ricoh.api.DataCRUD.dao.IMarcaDao;
import com.ricoh.api.DataCRUD.entities.Marca;

@Service
public class MarcaServiceImpl implements IMarcaService {

	@Autowired
	private IMarcaDao marcaDao;
	
	@Override
	@Transactional(readOnly = true)
	public Marca findByMarcaId(Integer marcaID) {
		
		return marcaDao.findById(marcaID).orElse(null);
	}	
}