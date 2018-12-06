package com.mballen.curso.boot.web.conversor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.mballen.curso.boot.domain.Departamento;
import com.mballen.curso.boot.service.DepartamentoService;

@Component
public class StringToDepartamento implements Converter<String,Departamento>{

	@Autowired
	private DepartamentoService service;
	
	@Override
	public Departamento convert(String txt) {
		if(txt.isEmpty()) {
			return null;
		}
		
		Long id = Long.valueOf(txt);
		return service.buscarPorId(id);
		
	}

}
