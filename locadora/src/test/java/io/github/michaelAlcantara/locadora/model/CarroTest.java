package io.github.michaelAlcantara.locadora.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CarroTest {

	@Test // Anotação para esse método ser um Test
	@DisplayName("Deve calcular o valor correto do aluguel")
	void deveCalcularValorAluguel() {
		Carro carro = new Carro("Sedan", 100.00);
		double total = carro.calcularValorAluguel(3);
		Assertions.assertEquals(300.00, total);
	}
	
}
