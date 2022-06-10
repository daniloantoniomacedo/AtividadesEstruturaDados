package ucsal.ed.lista.pilha;

public class Livro {
	
	private String nome;
	
	public Livro(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Livro [nome=");
		builder.append(nome);
		builder.append("]");
		return builder.toString();
	}
	
}
