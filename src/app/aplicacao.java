package app;

import domain.Banco;
import domain.Cliente;
import domain.Conta;
import domain.ContaCorrente;
import domain.ContaPoupanca;

public class aplicacao {
	public static void main(String[] args) {
		Cliente cli = new Cliente("Otávio");
		Banco banco = new Banco("Centro");
		
		Conta cc = new ContaCorrente(banco, cli);
		Conta poup = new ContaPoupanca(banco, cli);
		
		cc.depositar(200);
		cc.transferir(100, poup);
		
		cc.imprimirExtrato();
		poup.imprimirExtrato();
		
		banco.imprimirRelacaoDeContas();
	}

}
