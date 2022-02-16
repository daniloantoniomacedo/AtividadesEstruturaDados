package ucsal.ed.lista01;

import java.util.stream.Stream;

/**
 * Faça um programa que exiba os números de 1 até 100.
 */
public class Questao07 {

	public static void main(String[] args) {
		Stream.iterate(1, n -> ++n).limit(100L).forEach(System.out::println);
	}

}
