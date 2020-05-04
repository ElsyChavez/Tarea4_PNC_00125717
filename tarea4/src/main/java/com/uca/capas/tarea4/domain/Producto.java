package com.uca.capas.tarea4.domain;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Producto {

	@Size(min = 1, max = 12, message = "El codigo del producto debe tener maximo 12 digitos y no debe ir vacio.")
	private String codigoP;
	
	@Size(min = 1, max = 100, message = "El nombre del producto debe tener maximo 100 caracteres y no debe ir vacio.")
	private String nombreP;
	
	@Size(min = 1, max = 100, message = "La marca del producto debe tener maximo 100 caracteres y no debe ir vacia.")
	private String marcaP;
	
	@Size(min = 1, max = 500, message = "La descripcion del producto debe tener maximo 100 caracteres y no debe ir vacia.")
	private String descripcion;
	
	@NotEmpty(message ="La existencias pueden ser 0 pero no deben ir vacias.")
	private	String existencias;

	@Pattern(regexp = "^(0[1-9]|[12][0-9]|3[01])[/](0[1-9]|1[012])[/](19|20)\\d\\d$", 
			message = "La fecha de ingreso debe estar en formato dd/mm/aaaa")
	private	String fechaI;
	
	
	public String getCodigoP() {
		return codigoP;
	}
	
	public void setCodigoP(String codigoP) {
		this.codigoP = codigoP;
	}
	
	public String getNombreP() {
		return nombreP;
	}
	
	public void setNombreP(String nombreP) {
		this.nombreP = nombreP;
	}
	
	public String getMarcaP() {
		return marcaP;
	}
	
	public void setMarcaP(String marcaP) {
		this.marcaP = marcaP;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public String getExistencias() {
		return existencias;
	}
	
	public void setExistencias(String existencias) {
		this.existencias = existencias;
	}
	
	public String getFechaI() {
		return fechaI;
	}
	
	public void setFechaI(String fechaI) {
		this.fechaI= fechaI;
	}
	
}
	
