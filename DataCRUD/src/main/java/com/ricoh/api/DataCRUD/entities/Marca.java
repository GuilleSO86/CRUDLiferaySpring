package com.ricoh.api.DataCRUD.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "marca")
public class Marca implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idmarca")
	private Integer idMarca;
	
	private String nombre;
	private String aniofundacion;
	private String nacionalidad;
	
	@OneToMany(mappedBy = "marca", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JsonIgnore
	private Set<Coche> coches;
	
	
	public Marca() {
		super();
	}

	public Marca(Integer idMarca, String nombre, String aniofundacion, String nacionalidad, Set<Coche> coches) {
		super();
		this.idMarca = idMarca;
		this.nombre = nombre;
		this.aniofundacion = aniofundacion;
		this.nacionalidad = nacionalidad;
		this.coches = coches;
	}
	

	public Integer getIdMarca() {
		return idMarca;
	}

	public void setIdMarca(Integer idMarca) {
		this.idMarca = idMarca;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAniofundacion() {
		return aniofundacion;
	}

	public void setAniofundacion(String aniofundacion) {
		this.aniofundacion = aniofundacion;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public Set<Coche> getCoches() {
		return coches;
	}

	public void setCoches(Set<Coche> coches) {
		this.coches = coches;
	}

	@Override
	public String toString() {
		return "Marca [idMarca=" + idMarca + ", nombre=" + nombre + ", aniofundacion=" + aniofundacion
				+ ", nacionalidad=" + nacionalidad + "]";
	}
}