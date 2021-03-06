package com.daw.basquet.data;

import com.daw.basquet.data.service.EquipoService;
import com.daw.basquet.data.service.JugadorService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DataApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(DataApplication.class, args);

		context.getBean(EquipoService.class).testEquipo();
		context.getBean(JugadorService.class).testJugador();

	}
}
