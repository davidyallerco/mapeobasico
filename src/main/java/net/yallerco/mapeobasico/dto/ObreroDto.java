package net.yallerco.mapeobasico.dto;

import java.util.Date;


public class ObreroDto {
	
private Integer id;
	
	private String nombre;
	
	private String pesoPersona;
	
	private Integer dni;
	
	private String pais;
	
	private String nombrePadre;
	
	private Date fechaNac;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPesoPersona() {
		return pesoPersona;
	}

	public void setPesoPersona(String pesoPersona) {
		this.pesoPersona = pesoPersona;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getNombrePadre() {
		return nombrePadre;
	}

	public void setNombrePadre(String nombrePadre) {
		this.nombrePadre = nombrePadre;
	}

	public Date getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}

	
    
	
    
    

}
