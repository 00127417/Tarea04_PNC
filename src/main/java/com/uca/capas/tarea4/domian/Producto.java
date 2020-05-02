package com.uca.capas.tarea4.domian;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;



public class Producto {
	
	@Size(min=12, max=12, message = "El codigo debe ser exactamente 12 digitos")
	String codigo;
	@Size(min=1, max=100)
	String nombre;
	@Size(min=1, max=100)
	String marca;
	@Size(min=1, max=500)
	String descripcion;
	@NotEmpty()
	String existencias;
	@Pattern(regexp="^([0-2][0-9]|3[0-1])(\\/)(0[1-9]|1[0-2])(\\/)(\\d{4})$", message = "La fecha debe seguir el formato DD/MM/YYYY")
	String fechaing;
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
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
	public String getFechaing() {
		return fechaing;
	}
	public void setFechaing(String fechaing) {
		this.fechaing = fechaing;
	}
	
	
}
