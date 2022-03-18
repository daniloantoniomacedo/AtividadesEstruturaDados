package ucsal.ed.atividade05.estruturasDados;

public class Celula<T> { 
	
	private T valor;
	
	private Celula<T> proximo;

	public Celula(T valor) {
		super();
		this.valor = valor;
		this.proximo = null;
	}

	public Celula(T valor, Celula<T> proximo) {
		super();
		this.valor = valor;
		this.proximo = proximo;
	}

	public T getValor() {
		return valor;
	}

	public void setValor(T valor) {
		this.valor = valor;
	}

	public Celula<T> getProximo() {
		return proximo;
	}

	public void setProximo(Celula<T> proximo) {
		this.proximo = proximo;
	}

	@Override
	public String toString() {
		return "Celula [valor=" + valor + ", endereco_memoria=" + this.hashCode() + ", proximo=" + proximo +"]";
	}
	
}
