package com.ricoh.api.DataCRUD.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ricoh.api.DataCRUD.dao.ICocheDao;
import com.ricoh.api.DataCRUD.entities.Coche;

@Service
public class CocheServiceImpl implements ICocheService {

	@Autowired
	private ICocheDao cocheDao;
	
	@Override
	@Transactional
	public Coche add(Coche coche) {
		
		return cocheDao.save(coche);		
	}

	@Override
	@Transactional(readOnly = true)
	public List<Coche> findAllCoches() {
		
		return (List<Coche>) cocheDao.findAll();
	}

	@Override
	@Transactional
	public Coche update(Coche coche) {
		
		Coche existingCoche = findByCocheId(coche.getIdCoche());
		
		existingCoche.setModelo(coche.getModelo());
		existingCoche.setCv(coche.getCv());
		existingCoche.setPrecio(coche.getPrecio());
		
		return add(existingCoche);		
	}

	@Override
	@Transactional
	public void delete(Coche coche) {
		
		cocheDao.delete(coche);
	}

	@Override
	@Transactional(readOnly = true)
	public Coche findByCocheId(Integer cocheID) {
		
		return cocheDao.findById(cocheID).orElse(null);
	}	
}