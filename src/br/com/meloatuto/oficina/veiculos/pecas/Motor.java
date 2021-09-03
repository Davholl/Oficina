package br.com.meloatuto.oficina.veiculos.pecas;

import br.com.meloatuto.oficina.veiculos.constantes.OficinaConstantes;
import br.com.meloatuto.oficina.veiculos.pecas.interfaces.Desgastavel;
import br.com.meloatuto.oficina.veiculos.pecas.interfaces.Sujavel;

public class Motor implements Desgastavel, Sujavel{
	
	int sujo = 0;
	int desgaste = 0;
	
	public String darPartida() {
		if (sujo > 50) {
			System.out.println("O motor está sujo");
			return OficinaConstantes.SUJO;
		}else if (desgaste > 25){
			System.out.println("O motor está gasto");
			return OficinaConstantes.DESGASTADO;
		}else {
			System.out.println("O motor está bom");
			return OficinaConstantes.OK;
		}
	}

	@Override
	public void limpar() {
		this.sujo = 0;
		System.out.println("O motor esta limpo");
	}

	@Override
	public Desgastavel trocar() {
		Motor motorNovo = new Motor();
		return motorNovo;
	}
	
	
}
