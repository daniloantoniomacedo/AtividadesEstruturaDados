package ucsal.ed.atividade02;

import java.util.Objects;

import ucsal.ed.atividade02.interfaces.Lista;
import ucsal.ed.atividade02.model.Professor;

public class ProfessoresUcsal implements Lista<Professor> {
	
	private static Professor[] professores = {};
	
	private static final Professor[] EMPETY = {};
	
	public ProfessoresUcsal(int tamanho) {
		
		if(tamanho < 0) {
			throw new RuntimeException("Valor negativo não suportado!");
		} else {
			professores = new Professor[tamanho];
		}
		
	}
	
	public ProfessoresUcsal() {
	}

	@Override
	public Professor consultar(Professor c) {
		for (Professor p : professores) {
			if(Objects.nonNull(p) && p.equals(c)) {
				return p;
			}
		}
		System.out.println(c.toString() + " não existe!");
		return null;
	}

	@Override
	public void incluir(Professor p) {
		if(Objects.isNull(p)) {
			throw new RuntimeException("Não é possível incluir um professor que não existe!");
		} 
		
		if (estaCheio()) crescer();
		
		professores[obterIndexInclusao()] = p;
		
	}

	@Override
	public void remover(Professor r) {
		boolean existe = false;
		for (int i = 0; i < professores.length; i++) {
			Professor p = professores[i];
			if(Objects.nonNull(p) && p.equals(r)) {
				professores[i] = null;
				diminuir();
				existe = true; 
			}
		}
		
		if(!existe) {
			System.out.println(r.toString() + " não existe!");
		}
		
	}

	@Override
	public int obterTamanho() {
		return professores.length;
	}

	@Override
	public void limpar() {
		professores = EMPETY;
	}
	
	private static int obterIndexInclusao() {
		
		int index = 0;
		
		for(int i = 0; i < professores.length; i++) {
			if(Objects.isNull(professores[i])) {
				index = i;
				break;
			}
		}
		
		return index;
	}
	
	private static boolean estaCheio() {
		boolean estaCheio = true;
		
		for(Professor p : professores) {
			if(Objects.isNull(p)) {
				estaCheio = false;
			}
		}
		
		return estaCheio;
		
	}
	
	private static void crescer() {
		int tamanho = professores.length;
		Professor[] novo = new Professor[tamanho + 1];
		
		for(int i = 0; i < tamanho; i++) {
			novo[i] = professores[i];
		}
		
		professores = novo;
	}
	
	private static void diminuir() {
		Professor[] novo = new Professor[professores.length - 1];
		
		int index = 0;
		
		for (Professor p : professores) {
			if(Objects.nonNull(p)) {
				novo[index] = p;
				index++;
			}
		}
		
		professores = novo;
	}
	
	

}
