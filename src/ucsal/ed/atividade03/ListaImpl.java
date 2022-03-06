package ucsal.ed.atividade03;

import java.util.Objects;

import ucsal.ed.atividade02.interfaces.Lista;

public class ListaImpl<T> implements Lista<T> {
	
	private static Object[] objetos = {};
	
	private static final Object[] EMPETY = {};
	
	public ListaImpl(int tamanho) {
		
		if(tamanho < 0) {
			throw new RuntimeException("Valor negativo não suportado!");
		} else {
			objetos = new Object[tamanho];
		}
		
	}
	
	public ListaImpl() {
	}

	@Override
	public T consultar(T t) {
		for (Object o : objetos) {
			if(Objects.nonNull(o) && o.equals(t)) {
				return t;
			}
		}
		System.out.println(t.toString() + " não existe!");
		return null;
	}

	@Override
	public void incluir(T t) {
		if(Objects.isNull(t)) {
			throw new RuntimeException("Não é possível incluir um professor que não existe!");
		} 
		
		if (estaCheio()) crescer();
		
		objetos[obterIndexInclusao()] = t;
		
	}

	@Override
	public void remover(T t) {
		boolean existe = false;
		for (int i = 0; i < objetos.length; i++) {
			Object o = objetos[i];
			if(Objects.nonNull(t) && o.equals(t)) {
				objetos[i] = null;
				diminuir();
				existe = true; 
			}
		}
		
		if(!existe) {
			System.out.println(t.toString() + " não existe!");
		}
		
	}

	@Override
	public int obterTamanho() {
		return objetos.length;
	}

	@Override
	public void limpar() {
		objetos = EMPETY;
	}
	
	private static int obterIndexInclusao() {
		
		int index = 0;
		
		for(int i = 0; i < objetos.length; i++) {
			if(Objects.isNull(objetos[i])) {
				index = i;
				break;
			}
		}
		
		return index;
	}
	
	private static boolean estaCheio() {
		boolean estaCheio = true;
		
		for(Object o : objetos) {
			if(Objects.isNull(o)) {
				estaCheio = false;
			}
		}
		
		return estaCheio;
		
	}
	
	private static void crescer() {
		int tamanho = objetos.length;
		Object[] novo = new Object[tamanho + 1];
		
		for(int i = 0; i < tamanho; i++) {
			novo[i] = objetos[i];
		}
		
		objetos = novo;
	}
	
	private static void diminuir() {
		Object[] novo = new Object[objetos.length - 1];
		
		int index = 0;
		
		for (Object o : objetos) {
			if(Objects.nonNull(o)) {
				novo[index] = o;
				index++;
			}
		}
		
		objetos = novo;
	}
	
}

