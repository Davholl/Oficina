package br.com.meloatuto.oficina.veiculos;

import br.com.meloatuto.oficina.veiculos.pecas.Arrefecimento;
import br.com.meloatuto.oficina.veiculos.pecas.Motor;
import br.com.meloatuto.oficina.veiculos.pecas.Transmissao;

public class Carro {
	
	private String modelo;
	private String marca;

	private Motor motor;
	private Transmissao transmissao;
	private Arrefecimento arremecimento;
	
	public String getModelo() {
		return this.modelo;
	}
	
	public String getMarca() {
		return marca;
	}

	public Motor getMotor() {
		return motor;
	}

	public Transmissao getTransmissao() {
		return transmissao;
	}

	public Arrefecimento getArremecimento() {
		return arremecimento;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public void setTransmissao(Transmissao transmissao) {
		this.transmissao = transmissao;
	}

	public void setArremecimento(Arrefecimento arremecimento) {
		this.arremecimento = arremecimento;
	}
	
}
