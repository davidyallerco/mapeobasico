package net.yallerco.mapeobasico.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import net.yallerco.mapeobasico.dto.EmpleadoDto;
import net.yallerco.mapeobasico.persistence.entity.Persona;

@Mapper(componentModel = "spring")
public interface EmpleadoMapper {

	@Mapping(source = "persona.dni", target = "dni", qualifiedByName = "integerToString")
	EmpleadoDto personaToEmpleadoDto(Persona persona);

	@Mapping(source = "empleadoDto.dni", target = "dni", qualifiedByName = "stringToInteger")
	Persona empleadoDtoToPersona(EmpleadoDto empleadoDto);

	// Métodos de conversión personalizados
	@Named("integerToString")
	default String integerToString(Integer value) {
		return value != null ? value.toString() : null;
	}

	@Named("stringToInteger")
	default Integer stringToInteger(String value) {
		try {
			return value != null ? Integer.parseInt(value) : null;
		} catch (NumberFormatException e) {
			return null;
		}
	}
}
