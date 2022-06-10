package ucsal.ed.lista.pilha;

import java.util.Stack;

public class Questao03 {

	public static void main(String[] args) {
		
		Stack<String> tarefas = new Stack<String>();
		
		tarefas.push("Tarefa 1");
		tarefas.push("Tarefa 2");
		
		for(String tarefa : tarefas) {
			System.out.println(tarefa);
		}

	}

}
