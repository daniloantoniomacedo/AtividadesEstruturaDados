package ucsal.ed.atividade01;

import java.util.stream.Stream;

/**
 * Faça um programa que exiba os números pares de 1 até 50.
 *
 */
public class Questao08 {
	
	public static void main(String[] args) {
		Stream.iterate(1, n -> ++n).limit(50L).filter(n -> n%2 == 0 && n <= 50).forEach(System.out::println);
	}
}
