package br.com.meloatuto.oficina.veiculos.pecas;

import br.com.meloatuto.oficina.veiculos.constantes.OficinaConstantes;
import br.com.meloatuto.oficina.veiculos.pecas.interfaces.Desgastavel;
import br.com.meloatuto.oficina.veiculos.pecas.interfaces.Sujavel;

public class Arrefecimento implements Sujavel, Desgastavel{
	
	int sujo = 0;
	int desgaste = 0;
	
	public String aquecer() {
		if (sujo > 50) {
			System.out.println("O arrefecimento está muito sujo");
			return OficinaConstantes.SUJO;
		}else if (desgaste > 25){
			System.out.println("O arrefecimento está muito desgastado");
			return OficinaConstantes.DESGASTADO;
		}else {
			System.out.println("O arrefecimento está bom");
			return OficinaConstantes.OK;
		}
	}

	@Override
	public void limpar() {
		this.sujo = 0;
		System.out.println("O arrefecimento esta limpo");
	}

	@Override
	public Desgastavel trocar() {
		Arrefecimento arrefecimentoNovo = new Arrefecimento();
		return arrefecimentoNovo;
	}
	
	
	
}
