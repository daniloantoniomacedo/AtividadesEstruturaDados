package ucsal.ed.lista01;

import java.util.stream.Stream;

import ucsal.ed.lista01.utils.Primo;

/**
 * Faça um programa que exiba os números primos de 1 até 50.
 *
 */
public class Questao10 {
	
	private static final Long LIMITE = 50L;
	
	public static void main(String[] args) {
		
		Primo primo = (n) -> Stream.iterate(2, i -> ++i).limit(n)
								   .filter(i -> i<n && n%i == 0)
								   .findAny().isEmpty();
				   
		Stream.iterate(2, n -> ++n).limit(LIMITE)
								   .filter(n -> primo.verificar(n) && n <= 50)
								   .forEach(System.out::println);
		
	}
	
}

