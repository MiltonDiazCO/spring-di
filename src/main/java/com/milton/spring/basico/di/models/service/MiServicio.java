package com.milton.spring.basico.di.models.service;

import org.springframework.stereotype.Component;

@Component
public class MiServicio {
	
	public String operacion() {
		return "Ejecutando algún proceso importante...";
	}

}
