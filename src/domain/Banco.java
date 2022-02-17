package domain;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private String nome;
	List<Conta> contas = new ArrayList<>();
	
	public Banco(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public List<Conta> getContas() {
		return contas;
	}
	
	public void imprimirRelacaoDeContas() {
		for (Conta c : contas) {
			c.imprimirExtrato();
		}
	}

}
