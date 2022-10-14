package com.milton.spring.basico.di.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.milton.spring.basico.di.models.domain.Factura;

@Component
@RequestMapping("/factura")
public class FacturaController {
	
	@Autowired
	private Factura factura;
	
	@GetMapping({"", "/", "ver"})
	public String ver(Model model) {
		model.addAttribute("titulo", "Factura con inyección de dependencias");
		model.addAttribute("factura", factura);
		return "factura/ver";
	}

}
