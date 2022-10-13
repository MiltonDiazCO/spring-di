package com.milton.spring.basico.di.models.service;

public class MiServicio implements IServicio {
	
	@Override
	public String operacion() {
		return "Ejecutando algún proceso simple...";
	}

}
