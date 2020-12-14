package com.ricoh.api.DataCRUD.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "coche")
public class Coche implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idcoche")
	private Integer idCoche;
	
	private String modelo;
	private Integer cv;
	private Double precio;
	
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idmarca")
	private Marca marca;
	
	
	public Coche() {
		super();
	}


	public Coche(Integer idCoche, String modelo, Integer cv, Double precio, Marca marca) {
		super();
		this.idCoche = idCoche;
		this.modelo = modelo;
		this.cv = cv;
		this.precio = precio;
		this.marca = marca;
	}


	public Integer getIdCoche() {
		return idCoche;
	}

	public void setIdCoche(Integer idCoche) {
		this.idCoche = idCoche;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getCv() {
		return cv;
	}

	public void setCv(Integer cv) {
		this.cv = cv;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}


	@Override
	public String toString() {
		return "Coche [idCoche=" + idCoche + ", modelo=" + modelo + ", cv=" + cv + ", precio=" + precio + ", marca="
				+ marca + "]";
	}
}