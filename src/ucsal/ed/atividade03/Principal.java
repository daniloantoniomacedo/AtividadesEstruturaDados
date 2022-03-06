package ucsal.ed.atividade03;

import ucsal.ed.atividade02.interfaces.Lista;
import ucsal.ed.atividade02.utils.Utils;
import ucsal.ed.atividade03.model.Disciplina;

public class Principal {

	public static void main(String[] args) {
		
		Lista<Disciplina> disciplinas = new ListaImpl<Disciplina>();
		
		Disciplina logica = new Disciplina("Logica", 1);
		Disciplina redes = new Disciplina("Redes", 2);
		Disciplina ed = new Disciplina("Estrutura de Dados", 3);
		
		disciplinas.incluir(logica);
		disciplinas.incluir(redes);
		disciplinas.incluir(ed);
		
		Utils.imprimir("Tamanho antes de remover: " + disciplinas.obterTamanho());
		disciplinas.remover(logica);
		
		Utils.imprimir(disciplinas.consultar(logica));
		Utils.imprimir(disciplinas.consultar(redes));
		Utils.imprimir(disciplinas.consultar(ed));
		
		Utils.imprimir("Tamanho antes de limpar: " + disciplinas.obterTamanho());
		disciplinas.limpar();
		Utils.imprimir("Tamanho após limpar: " + disciplinas.obterTamanho());

	}

}
