package br.com.meloatuto.oficina.utils;

import java.util.HashMap;
import java.util.Map;

import br.com.meloatuto.oficina.veiculos.Carro;
import br.com.meloatuto.oficina.veiculos.constantes.OficinaConstantes;
import br.com.meloatuto.oficina.veiculos.pecas.Arrefecimento;
import br.com.meloatuto.oficina.veiculos.pecas.Motor;
import br.com.meloatuto.oficina.veiculos.pecas.Transmissao;
import br.com.meloatuto.oficina.veiculos.pecas.interfaces.Desgastavel;
import br.com.meloatuto.oficina.veiculos.pecas.interfaces.Sujavel;

public class Oficina {

	public void receberCarro(Carro carro) {
		System.out.println("O carro é um " + carro.getModelo() + " da marca " + carro.getMarca());
		
		Map<String, String> diagnostico = testarCarro(carro);
		
		if (diagnostico.get(OficinaConstantes.MOTOR) == OficinaConstantes.DESGASTADO) {
			carro.setMotor((Motor) trocarPeca(carro.getMotor()));
		}
		if (diagnostico.get(OficinaConstantes.MOTOR) == OficinaConstantes.SUJO) {
			limparPeca(carro.getMotor());
		}
		
		if (diagnostico.get(OficinaConstantes.ARREFECIMENTO) == OficinaConstantes.DESGASTADO) {
			carro.setArremecimento((Arrefecimento) trocarPeca(carro.getArremecimento()));
		}
		if (diagnostico.get(OficinaConstantes.ARREFECIMENTO) == OficinaConstantes.SUJO) {
			limparPeca(carro.getArremecimento());
		}
		
		if (diagnostico.get(OficinaConstantes.TRANSMISSAO) == OficinaConstantes.DESGASTADO) {
			carro.setTransmissao((Transmissao) trocarPeca(carro.getTransmissao()));
		}
		
		System.out.println("Seu carro está novinho em folha!");
		
	}
	
	public Map<String, String> testarCarro(Carro carro) {
		Map<String, String> diagnostico = new HashMap<String, String>();
		diagnostico.put(OficinaConstantes.MOTOR, carro.getMotor().darPartida());
		diagnostico.put(OficinaConstantes.ARREFECIMENTO, carro.getArremecimento().aquecer());
		diagnostico.put(OficinaConstantes.TRANSMISSAO, carro.getTransmissao().trocarMarcha());
		
		return diagnostico;
	}
	
	public void limparPeca(Sujavel sujavel) {
		sujavel.limpar();
	}
	
	public Desgastavel trocarPeca(Desgastavel desgastavel) {
		return desgastavel.trocar();
	}
	
}
