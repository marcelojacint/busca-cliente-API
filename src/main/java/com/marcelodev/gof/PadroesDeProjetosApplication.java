package com.marcelodev.gof;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * projeto de teste para de padrões de projeto, consumindo API de cep.
 *
 * @author marcelojac
 *
 * @version 1.0
 */
@EnableFeignClients
@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Busca-Cliente_API", version = "1", description = "Api que faz busca por nome e cep, crud completo e consome APi externa ViaCep"))
public class PadroesDeProjetosApplication {

	public static void main(String[] args) {
		SpringApplication.run(PadroesDeProjetosApplication.class, args);
	}

}
