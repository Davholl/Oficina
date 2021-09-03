package br.com.meloatuto.oficina.veiculos.pecas;

import br.com.meloatuto.oficina.veiculos.constantes.OficinaConstantes;
import br.com.meloatuto.oficina.veiculos.pecas.interfaces.Desgastavel;

public class Transmissao implements Desgastavel{
	
	int desgaste = 0;
	
	public String trocarMarcha() {
		if (desgaste > 50) {
			System.out.println("A Marcha está gasta");
			return OficinaConstantes.DESGASTADO;
		}else {
			System.out.println("A Marcha está boa");
			return OficinaConstantes.OK;
		}
	}
	
	@Override
	public Desgastavel trocar() {
		Transmissao transmissaoNova = new Transmissao();
		return transmissaoNova;
	}
	
}
