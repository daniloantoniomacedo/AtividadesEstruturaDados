package ucsal.ed.atividade02.interfaces;

public interface Lista<T> {
	
	T consultar(T t);
	
	void incluir(T t);
	
	void remover(T t);
	
	int obterTamanho();
	
	void limpar();

}
