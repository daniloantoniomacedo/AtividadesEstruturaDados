
package ucsal.ed.lista.pilha;

import java.util.Stack;

public class Questao01 {

	public static void main(String[] args) {
		
		Stack<Livro> pilha = new Stack<Livro>();
		
		Livro livro1 = new Livro("Livro 1");
		Livro livro2 = new Livro("Livro 2");
		
		pilha.push(livro1);
		pilha.push(livro2);
		System.out.println(pilha.elementAt(0));
		pilha.clear();
	}

}
