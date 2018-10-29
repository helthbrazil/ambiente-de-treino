package model;

import java.io.Serializable;

public class Pessoa implements Serializable {
	
	private static final long serialVersionUID = 3124731898044505694L;
	
	private String nome;
	private Integer idade;
	private String cpf;

	@Override
	public String toString() {
		String separator = System.getProperty("line.separator");
		return "NOME: " + nome + separator + "IDADE: " + idade + separator + "CPF: " + cpf + separator;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
