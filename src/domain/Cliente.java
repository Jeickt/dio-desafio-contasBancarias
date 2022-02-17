package domain;

public class Cliente {
	
	private static Integer ID = 0;
	
	private Integer id;
	private String nome;

	public Cliente(String nome) {
		id = ID++;
		this.nome = nome;
	}

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

}
