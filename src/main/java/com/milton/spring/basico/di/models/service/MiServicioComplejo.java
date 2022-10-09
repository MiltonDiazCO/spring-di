package com.milton.spring.basico.di.models.service;

import org.springframework.stereotype.Component;

@Component("miServicioComplejo")
public class MiServicioComplejo implements IServicio {
	
	@Override
	public String operacion() {
		return "Ejecutando algún proceso complejo...";
	}

}
