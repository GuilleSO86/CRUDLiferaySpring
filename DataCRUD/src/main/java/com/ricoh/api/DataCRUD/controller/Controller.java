package com.ricoh.api.DataCRUD.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ricoh.api.DataCRUD.entities.Coche;
import com.ricoh.api.DataCRUD.entities.Marca;
import com.ricoh.api.DataCRUD.services.ICocheService;
import com.ricoh.api.DataCRUD.services.IMarcaService;

@RestController
@RequestMapping("/api")
public class Controller {
	
	@Autowired
	private ICocheService cocheService;
	
	@Autowired
	private IMarcaService marcaService;
	
	
	@PostMapping("/car")
	public void addCoche(@RequestBody Coche coche) {
		
		cocheService.add(coche);
	}
	
	@GetMapping("/car/{id}")
	@ResponseBody
	public Coche findCocheById(@PathVariable Integer id) {
		
		return cocheService.findByCocheId(id);
	}
	
	@GetMapping("/car/listAll")
	@ResponseBody
	public List<Coche> findAllCoches() {
		return cocheService.findAllCoches();
	}
	
	@PutMapping("/car/update")
	public Coche updateCoche(@RequestBody Coche coche) {
		
		return cocheService.update(coche);
	}
	
	@DeleteMapping("/car/delete/{id}")
	public void deleteCoche(@PathVariable Integer id) {
		
		cocheService.delete(cocheService.findByCocheId(id));
	}
	
	@GetMapping("/branch/{id}/models")
	@ResponseBody
	public Marca findMarcaById(@PathVariable Integer id) {
		
		return marcaService.findByMarcaId(id);
	}
}
