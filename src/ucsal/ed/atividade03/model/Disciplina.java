package ucsal.ed.atividade03.model;

import java.util.Objects;

public class Disciplina {
	
	private String nome;
	
	private int semestre;
	
	public Disciplina(String nome, int semestre) {
		super();
		this.nome = nome;
		this.semestre = semestre;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getSemestre() {
		return semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, semestre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplina other = (Disciplina) obj;
		return Objects.equals(nome, other.nome) && semestre == other.semestre;
	}

	@Override
	public String toString() {
		return "Disciplina " + nome + " do " + semestre + "° semestre";
	}
	
}
