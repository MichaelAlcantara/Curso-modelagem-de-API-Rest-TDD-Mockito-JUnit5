package io.github.michaelAlcantara.locadora.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CarroTest {

	@Test // Anotação para esse método ser um Test
	@DisplayName("Deve calcular o valor correto do aluguel")
	void deveCalcularValorAluguel() {
		// 1. Cenário
		Carro carro = new Carro("Sedan", 100.00);
		
		//2. Execução da regra
		double total = carro.calcularValorAluguel(3);
		
		//3. Verificação
		Assertions.assertEquals(300.00, total);
	}
	
	@Test // Anotação para esse método ser um Test
	@DisplayName("Deve calcular o valor do aluguel com desconto")
	void deveCalcularValorAluguelComDesconto() {
		// 1. Cenário
		Carro carro = new Carro("Sedan", 100.00);
		int quantidadeDias = 5;
		
		//2. Execução da regra
		double total = carro.calcularValorAluguel(quantidadeDias);
		
		//3. Verificação
		Assertions.assertEquals(450.00, total);
	}
	
}
