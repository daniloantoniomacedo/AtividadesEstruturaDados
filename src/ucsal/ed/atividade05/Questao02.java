package ucsal.ed.atividade05;

import ucsal.ed.atividade05.estruturasDados.ListaEncadeada;
import ucsal.ed.atividade05.interfaces.Lista;
import ucsal.ed.atividade05.model.Aluno;
import ucsal.ed.atividade05.utils.Utils;

public class Questao02 {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Foo", 18);
		Aluno aluno2 = new Aluno("Bar", 25);
		
		Lista<Aluno> lista = new ListaEncadeada<>();
		
		lista.incluir(aluno1);
		lista.incluir(aluno2);
		
		Utils.imprimir(lista.consultarEm(0));
		
		Utils.imprimir(lista.toString());
		
		lista.remover(aluno1);
		
		
	}

}
