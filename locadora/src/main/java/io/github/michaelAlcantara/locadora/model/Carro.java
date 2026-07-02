package io.github.michaelAlcantara.locadora.model;

public class Carro {

	private String modelo;
	private double valorDiaria;

	public Carro() {
		super();
	}

	public Carro(String modelo, double valorDiaria) {
		super();
		this.modelo = modelo;
		this.valorDiaria = valorDiaria;
	}
	
	public double calcularValorAluguel(int dias) {
		double desconto = 0;
		if(dias >= 5) {
			desconto = 50.00;
		}
		return (dias * valorDiaria) - desconto;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getValorDiaria() {
		return valorDiaria;
	}

	public void setValorDiaria(double valorDiaria) {
		this.valorDiaria = valorDiaria;
	}

}
