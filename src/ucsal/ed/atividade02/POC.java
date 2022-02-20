package ucsal.ed.atividade02;

import ucsal.ed.atividade02.interfaces.Lista;
import ucsal.ed.atividade02.model.Professor;
import ucsal.ed.atividade02.utils.Utils;

public class POC {

	public static void main(String[] args) {
		
		Lista<Professor> lista = new ProfessoresUcsal();
		
		Professor angela20 = new Professor("Angela", 20);
		Professor angela30 = new Professor("Angela", 30);
		Professor angela40 = new Professor("Angela", 40);
		
		lista.incluir(angela20);
		lista.incluir(angela30);
		lista.incluir(angela40);
		
		Utils.imprimir("Tamanho antes de remover: " + lista.obterTamanho());
		lista.remover(angela20);
		
		Utils.imprimir(lista.consultar(angela20));
		Utils.imprimir(lista.consultar(angela30));
		Utils.imprimir(lista.consultar(angela40));
		Utils.imprimir("Tamanho antes de limpar: " + lista.obterTamanho());
		
		lista.limpar();
		Utils.imprimir("Tamanho após limpar: " + lista.obterTamanho());
		
	}

}
