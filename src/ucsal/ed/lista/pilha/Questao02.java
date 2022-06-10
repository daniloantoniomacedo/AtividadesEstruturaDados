package ucsal.ed.lista.pilha;

import java.util.Scanner;
import java.util.Stack;

public class Questao02 {

	public static void main(String[] args) {
		
		System.out.println("Insira o nome:");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		Stack<Character> letras = new Stack<Character>();
		
		for(int i=0; i < input.length(); i++) {
			letras.push(input.charAt(i));
		}
		
		String reverse = "";
		for(int i = letras.size() - 1; i >= 0; i--) {
			reverse += letras.get(i);
		}
		
		if(reverse.equals(input)) {
			System.out.println("É um Palíndromo!");
		} else {
			System.out.println("Não é!");
		}
		
	}

}
