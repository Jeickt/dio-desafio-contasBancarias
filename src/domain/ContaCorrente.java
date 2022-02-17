package domain;

public class ContaCorrente extends Conta {

	public ContaCorrente(Banco banco, Cliente cliente) {
		super(banco, cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato de Conta Corrente ===");
		imprimirInfo();
	}
	
}
