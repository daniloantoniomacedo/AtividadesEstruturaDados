package ucsal.ed.atividade02.model;

import java.util.Objects;

public class Professor {
	
	private String nome;
	
	private int idade;
	
	public Professor() { }
	
	public Professor(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	
	public Professor(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}


	@Override
	public int hashCode() {
		return Objects.hash(idade, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Professor other = (Professor) obj;
		return idade == other.idade && Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Professor(a) " + nome.toString() + " com " + idade + " anos";
	}
	
}
