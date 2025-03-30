package net.yallerco.mapeobasico.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.yallerco.mapeobasico.service.PersonaService;
import net.yallerco.mapeobasico.dto.EmpleadoDto;
import net.yallerco.mapeobasico.dto.EstudianteDto;
import net.yallerco.mapeobasico.dto.PersonDto;
import net.yallerco.mapeobasico.dto.PersonaDto;
import net.yallerco.mapeobasico.persistence.entity.Persona;

@RestController
@RequestMapping("/persona")
public class PersonaController {

	@Autowired
	private PersonaService personaService;

	// *************** Read ****************************

	// http://localhost:8030/mapeos/persona/listar
	@GetMapping("/listar")
	public List<PersonaDto> buscarTodos() {
		return personaService.buscarTodos();
	}
	
	@GetMapping("/listar-en-ingles")
	public List<PersonDto> buscarTodosEnIngles() {
		return personaService.buscarTodosEnIngles();
	}
	
	@GetMapping("/listar-con-campo-dni-string")
	public List<EmpleadoDto> listarTodoCambiandoCampoDniIntegerToString() {
		return personaService.listarTodos();
	}
	
	@GetMapping("/listar-minimos-campos")
	public List<EstudianteDto> listarEstudiante() {
		return personaService.listarEstudiante();
	}

	// ************** Create *********************
	
	
		@PostMapping("/crear")
		public Persona add(@RequestBody Persona persona) {
			return personaService.crear(persona);
		}


}
