package ucsal.ed.atividade05;

import ucsal.ed.atividade05.estruturasDados.ListaEncadeada;
import ucsal.ed.atividade05.interfaces.Lista;
import ucsal.ed.atividade05.utils.Utils;
import ucsal.ed.atividade05.model.Professor;

public class Questao01 {

	public static void main(String[] args) {
		Lista<Professor> lista = new ListaEncadeada<Professor>();
		
		Professor p1 = new Professor("Angela1", 31);
		Professor p2 = new Professor("Angela2", 32);
		Professor p3 = new Professor("Angela3", 33);
		
		lista.incluir(p1);
		lista.incluir(p2);
		lista.incluir(p3);
		
		Utils.imprimir(lista.toString());
		
		lista.removerEm(1);
		
		Utils.imprimir(lista.toString());
		
		Utils.imprimir(lista.obterTamanho());
		
		Utils.imprimir(lista.consultarEm(1));
		
		Utils.imprimir(lista.indexOf(p1));
		
		lista.incluirEm(p2, 2);
		
		Utils.imprimir(lista.obterTamanho());
		
		Utils.imprimir(lista.toString());
		
		lista.remover(p3);
		
		Utils.imprimir(lista.toString());
		
		lista.limpar();
		
		Utils.imprimir(lista.toString());
	}

}
