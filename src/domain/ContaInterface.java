package domain;

public interface ContaInterface {
	
	void depositar(double quantia);
	
	void sacar(double quantia);
	
	void transferir(double quantia, Conta conta);
	
	void imprimirExtrato();

}
