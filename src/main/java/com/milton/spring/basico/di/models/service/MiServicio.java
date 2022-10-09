package com.milton.spring.basico.di.models.service;

import org.springframework.stereotype.Component;

@Component("miServicioSimple")
public class MiServicio implements IServicio {
	
	@Override
	public String operacion() {
		return "Ejecutando algún proceso importante...";
	}

}
