package domain;

public abstract class Conta implements ContaInterface{
	
	private static String AGENCIA_PADRAO = "0450";
	private static Integer CONTA_SEQUENCIAL = 2356;
	
	protected String agencia;
	protected Integer conta;
	protected Double saldo = 0d;
	protected Banco banco;
	protected Cliente cliente;
	

	public Conta(Banco banco, Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.conta = CONTA_SEQUENCIAL++;
		this.banco = banco;
		this.cliente = cliente;
		banco.getContas().add(this);
	}
	
	@Override
	public void depositar(double quantia) {
		saldo += quantia;
	}
	
	@Override
	public void sacar(double quantia) {
		saldo -= quantia;
	}
	
	@Override
	public void transferir(double quantia, Conta conta) {
		this.sacar(quantia);
		conta.depositar(quantia);
	}
	
	public void imprimirInfo() {
		System.out.printf("Cliente: %s\n", cliente.getNome());		
		System.out.printf("Agência: %s\n", agencia);
		System.out.printf("Conta: %d\n", conta);
		System.out.printf("Saldo: R$ %.2f\n\n", saldo);
	}
	
}
