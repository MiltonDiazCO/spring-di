package com.milton.spring.basico.di.models.service;

public class MiServicioComplejo implements IServicio {
	
	@Override
	public String operacion() {
		return "Ejecutando algún proceso complejo...";
	}

}
