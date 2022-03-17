package ucsal.ed.atividade05.interfaces;

public interface Lista<T> {
	
	T consultarEm(int index);
	
	void incluir(T t);
	
	void incluirEm(T t, int index);
	
	boolean remover(T t);
	
	boolean removerEm(int index);
	
	int indexOf(T t);
	
	int obterTamanho();
	
	void limpar();

}
