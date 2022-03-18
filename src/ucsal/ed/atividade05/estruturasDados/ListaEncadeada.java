package ucsal.ed.atividade05.estruturasDados;

import ucsal.ed.atividade05.interfaces.Lista;

public class ListaEncadeada<T> implements Lista<T>{
	
	private Celula<T> inicio;
	
	private int tamanho;

	@Override
	public T consultarEm(int index) throws IndexOutOfBoundsException {
		verificarIndex(index);
		Celula<T> atual = inicio;
		for(int i = 0; i < tamanho && atual != null; i++) {
			if(i == index) {
				return atual.getValor();
			}
			atual = atual.getProximo();
		}
		return null;
	}

	@Override
	public void incluir(T t) {
		Celula<T> novaCelula = new Celula<T>(t); //Cria nova celula com ponteiro null
		novaCelula.setValor(t); //insere valor parametrizado na nova celula
		if(inicio ==  null) { //Se a lista estiver vazia
			inicio = novaCelula; 
		} else {
			Celula<T> atual; //variável para percorrer a lista
			atual = inicio; //inicia a busca pelo início 
			while(atual.getProximo() != null) { //identifica a última celula da lista
				atual = atual.getProximo();
			}
			atual.setProximo(novaCelula); //insere a nova celula no ponteiro do último item da lista.
		}
		tamanho++;
	}
	
	@Override
	public void incluirEm(T t, int index) throws IndexOutOfBoundsException {
		Celula<T> novo = new Celula<T>(t);
		if(index == 0) {
			novo.setProximo(inicio);
			inicio = novo;
		} else {
			Celula<T> anterior = obterPeloIndex(index - 1);
			Celula<T> atual = anterior.getProximo();
			anterior.setProximo(novo);
			novo.setProximo(atual);
		}
		tamanho++;
	}

	@Override
	public boolean remover(T t) {
		Celula<T> anterior = null;
		for(Celula<T> atual = inicio; atual.getProximo() != null; atual = atual.getProximo()) {
			if(atual.getValor().equals(t)) {
				anterior.setProximo(atual.getProximo());
				tamanho--;
				return true;
			}
			anterior = atual;
		}
		return false;
	}
	
	@Override
	public boolean removerEm(int index) throws IndexOutOfBoundsException {
		if(index == 0) {
			this.inicio = this.inicio.getProximo();
		} else {
			Celula<T> anterior = obterPeloIndex(index - 1);
			Celula<T> atual = anterior.getProximo();
			anterior.setProximo(atual.getProximo());
		}
		tamanho--;
		return true;
	}
	
	@Override
	public int obterTamanho() {
		return tamanho;
	}

	@Override
	public void limpar() {
		tamanho = 0;
		inicio = null;
	}

	@Override
	public String toString() {
		return "ListaEncadeada [inicio=" + inicio + "]";
	}
	
	@Override
	public int indexOf(T t) {
		Celula<T> atual = inicio;
		for(int i = 0; i < tamanho; i++) {
			if(atual.getValor().equals(t)) {
				return i;
			}
			atual = atual.getProximo();
		}
		return -1;
	}
	
	private void verificarIndex(int index) throws IndexOutOfBoundsException {
		if(index < 0 || index >= tamanho) {
			throw new IndexOutOfBoundsException(index);
		}
	}
	
	private Celula<T> obterPeloIndex(int index) throws IndexOutOfBoundsException {
		verificarIndex(index);
		Celula<T> atual = this.inicio;
		for(int i = 0; i < index && atual != null; i++) {
			atual = atual.getProximo();
		}
		return atual;
	}

}
