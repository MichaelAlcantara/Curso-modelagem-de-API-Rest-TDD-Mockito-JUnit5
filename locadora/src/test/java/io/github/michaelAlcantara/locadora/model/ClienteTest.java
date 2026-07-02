package io.github.michaelAlcantara.locadora.model;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ClienteTest {
	
	@Test
	void deveCriarClienteComNome() {
		// 1. Cenário
		var cliente = new Cliente("Maria");
		
		// 2. Execição
		String nome = cliente.getNome();
		
		// 3. Verificações
		assertNotNull(nome); // Verifica se é Not Null
		
		assertThat(nome).isEqualTo("Maria"); // Verifica se a variável nome é igual a Maria
		assertThat(nome).isLessThan("Maria5"); // Verifica o tamanho da variável
		
		assertTrue(nome.startsWith("M")); // Verifica se o começo do nome tem essa Letra
		assertFalse(nome.length() == 100); // Verifica se tem 100 caracteris
		
		assertThat(nome.length()).isLessThan(100); // Verifica se tem 100 caracteris
		assertThat(nome).contains("M"); // Verifica se o começo do nome tem essa Letra
	}
	
	@Test
	void deveCriarClientSemNome() {
		// 1. Cenário
		var cliente = new Cliente(null);
		
		// 2. Execição
		String nome = cliente.getNome();
		
		// 3. Verificações
		assertNull(nome);
	}

}
