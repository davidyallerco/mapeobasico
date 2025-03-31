package net.yallerco.mapeobasico.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.yallerco.mapeobasico.dto.EmpleadoDto;
import net.yallerco.mapeobasico.dto.EstudianteDto;
import net.yallerco.mapeobasico.dto.ObreroDto;
import net.yallerco.mapeobasico.dto.PersonDto;
import net.yallerco.mapeobasico.dto.PersonaDto;
import net.yallerco.mapeobasico.mapper.EmpleadoMapper;
import net.yallerco.mapeobasico.mapper.EstudianteMapper;
import net.yallerco.mapeobasico.mapper.ObreroMapper;
import net.yallerco.mapeobasico.mapper.PersonMapper;
import net.yallerco.mapeobasico.mapper.PersonaMapper;
import net.yallerco.mapeobasico.persistence.dao.PersonaRepository;
import net.yallerco.mapeobasico.persistence.entity.Persona;
import net.yallerco.mapeobasico.service.PersonaService;

@Service
public class PersonaServiceImpl implements PersonaService{
	
	@Autowired
	private PersonaRepository personaRepository;
	
	@Autowired
    private PersonaMapper personaMapper;
	
	@Autowired
    private PersonMapper personMapper;
	
	@Autowired
    private EmpleadoMapper empleadoMapper;
	
	@Autowired
    private EstudianteMapper estudianteMapper;
	
	@Autowired
    private ObreroMapper obreroMapper;

	//********* listar ************************
	@Override
	public List<PersonaDto> buscarTodos() {
		return personaRepository.findAll().stream()
				.map(personaMapper::toDto)
				.collect(Collectors.toList());
	}
	
	@Override
	public List<PersonDto> buscarTodosEnIngles() {
		return personaRepository.findAll().stream()
				.map(personMapper::personaToPersonDto)
				.collect(Collectors.toList());
	}

	@Override
	public List<EmpleadoDto> listarTodos() {
		return personaRepository.findAll().stream()
				.map(empleadoMapper::personaToEmpleadoDto)
				.collect(Collectors.toList());
	}
	
	@Override
	public List<EstudianteDto> listarEstudiante() {
		return personaRepository.findAll().stream()
				.map(estudianteMapper::personaToEstudianteDto)
				.collect(Collectors.toList());
	}
	
	@Override
	public List<ObreroDto> listarObrero() {
		return personaRepository.findAll().stream()
				.map(obreroMapper::personaToObreroDto)
				.collect(Collectors.toList());
	}
	
	//crear
	@Override
	public Persona crear(Persona persona) {
		return personaRepository.save(persona);
	}

	

	

	


	

	

	

}
