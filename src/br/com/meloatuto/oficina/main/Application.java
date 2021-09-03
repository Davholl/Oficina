package br.com.meloatuto.oficina.main;

import br.com.meloatuto.oficina.utils.Oficina;
import br.com.meloatuto.oficina.veiculos.Carro;

public class Application {
	
	public static void main (String[] args) {
		
		Carro carro = new Carro();
		// preencher motor e etc..
		
		Oficina oficina = new Oficina();
		
		oficina.receberCarro(carro);
		
	}

}
