package net.yallerco.mapeobasico.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import net.yallerco.mapeobasico.dto.PersonDto;
import net.yallerco.mapeobasico.persistence.entity.Persona;

@Mapper(componentModel = "spring")
public interface PersonMapper {

	@Mapping( source = "persona.nombre" , target = "name"  )
	@Mapping( source = "persona.pesoPersona" , target = "personWeight"  )
	@Mapping( source = "persona.pais" , target = "country"  )
	@Mapping( source = "persona.nombrePadre" , target = "fatherName"  )
	@Mapping( source = "persona.fechaNac" , target = "birthDate"  )
	PersonDto personaToPersonDto(Persona persona);
	
	@Mapping(source = "name", target = "nombre")
	@Mapping(source = "personWeight", target = "pesoPersona")
	@Mapping(source = "country", target = "pais")
	@Mapping(source = "fatherName", target = "nombrePadre")
	@Mapping(source = "birthDate", target = "fechaNac")
	Persona personDtoToPersona(PersonDto personDto);
	
	
}
