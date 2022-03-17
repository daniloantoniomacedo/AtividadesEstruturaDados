package ucsal.ed.atividade05.testes;

import org.junit.Test;

import junit.framework.TestCase;
import ucsal.ed.atividade05.estruturasDados.ListaEncadeada;
import ucsal.ed.atividade05.interfaces.Lista;
import ucsal.ed.atividade05.model.Professor;

public class ListaEncadeadaTestes  extends TestCase {
	
	private static Lista<Professor> lista; 
	
	private static String RESPOSTA_01 = null;
	
	static {
		lista = new ListaEncadeada<Professor>();
		
		Professor p1 = new Professor("Angela1", 31);
		Professor p2 = new Professor("Angela2", 32);
		Professor p3 = new Professor("Angela3", 33);
		
		lista.incluir(p1);
		lista.incluir(p2);
		lista.incluir(p3);
		
		RESPOSTA_01 = lista.toString();
	}
	
	@Test
	public void teste() {
		assertEquals(RESPOSTA_01, lista.toString());
	}

}
