package net.yallerco.mapeobasico.service;

import java.util.List;

import net.yallerco.mapeobasico.dto.EmpleadoDto;
import net.yallerco.mapeobasico.dto.EstudianteDto;
import net.yallerco.mapeobasico.dto.ObreroDto;
import net.yallerco.mapeobasico.dto.PersonDto;
import net.yallerco.mapeobasico.dto.PersonaDto;
import net.yallerco.mapeobasico.persistence.entity.Persona;

public interface PersonaService {

	// Read
	public List<PersonaDto> buscarTodos();
	
	public List<PersonDto> buscarTodosEnIngles();
	
	public List<EmpleadoDto> listarTodos();
	
	public List<EstudianteDto> listarEstudiante();
	
	public List<ObreroDto> listarObrero();

	//crear
	public Persona crear(Persona persona);

}
