package net.yallerco.mapeobasico.dto;

import java.util.Date;


public class PersonDto {
	
	private Integer id;

	private String name;

	private String personWeight;

	private Integer dni;

	private String country;

	private String fatherName;

	private Date birthDate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPersonWeight() {
		return personWeight;
	}

	public void setPersonWeight(String personWeight) {
		this.personWeight = personWeight;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	

	
}
