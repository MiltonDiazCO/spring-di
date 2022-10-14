package com.milton.spring.basico.di;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.milton.spring.basico.di.models.domain.ItemFactura;
import com.milton.spring.basico.di.models.domain.Producto;
import com.milton.spring.basico.di.models.service.IServicio;
import com.milton.spring.basico.di.models.service.MiServicio;
import com.milton.spring.basico.di.models.service.MiServicioComplejo;

@Configuration
public class AppConfig {

	@Primary
	@Bean("miServicioSimple")
	public IServicio registrarMiServicio() {
		return new MiServicio();
	}

	@Bean("miServicioComplejo")
	public IServicio registrarMiServicioComplejo() {
		return new MiServicioComplejo();
	}

	@Bean("itemsFactura")
	public List<ItemFactura> registrarItems() {
		Producto producto1 = new Producto("Camara Sony", 100);
		Producto producto2 = new Producto("Bicicleta Bianchi", 200);

		ItemFactura item1 = new ItemFactura(producto1, 5);
		ItemFactura item2 = new ItemFactura(producto2, 2);

		return Arrays.asList(item1, item2);
	}
	
	@Primary
	@Bean("itemsFacturaOficina")
	public List<ItemFactura> registrarItemsOficina() {
		Producto producto1 = new Producto("Monitor LG", 250);
		Producto producto2 = new Producto("Notebook ASUS", 370);
		Producto producto3 = new Producto("Impresora HP", 240);
		Producto producto4 = new Producto("Escritorio de oficina", 180);

		ItemFactura item1 = new ItemFactura(producto1, 5);
		ItemFactura item2 = new ItemFactura(producto2, 2);
		ItemFactura item3 = new ItemFactura(producto3, 2);
		ItemFactura item4 = new ItemFactura(producto4, 2);

		return Arrays.asList(item1, item2, item3, item4);
	}

}
