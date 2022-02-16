package ucsal.ed.lista01;

import java.util.Scanner;
import java.util.stream.Stream;

import ucsal.ed.lista01.utils.Constantes;
import ucsal.ed.lista01.utils.Nota;
import ucsal.ed.lista01.utils.Utils;

/**
 * Escrever um programa que leia o nome de um aluno e as notas das três provas que ele
 * obteve no semestre. No final informar o nome do aluno e a sua média (aritmética).
 * MEDIA = nota1 + nota2 + nota3 / 3.
 */
public class Questao11 {
	
	public static void main(String[] args) {
		
		double[] notas = new double[3];
		
		try (Scanner scan = new Scanner (System.in)) {
			
			Utils.imprimirMsgTela(Constantes.NOME_PESSOA);
			String nome = scan.nextLine().trim();
			
			Nota nota = (n) -> {
				Utils.imprimirMsgTela(String.format(Constantes.NOTA_X, ++n));
				return Double.parseDouble(scan.nextLine().replace(',', '.'));
			};
			
			Stream.iterate(0, n -> ++n).limit(3)
				  .forEach(n -> notas[n] = nota.obterNotas(n));
			
			Utils.imprimirFormatado(Constantes.RESULTADO_MEDIA, nome, obterMedia(notas));
			
		} catch (NumberFormatException e) {
			Utils.imprimirMsgTela(Constantes.VALOR_NAO_SUPORTADO);
			
		} catch (RuntimeException e) {
			Utils.imprimirMsgTela(e.getMessage());
		} 
	}
	
	private static double obterMedia(double[] notas){
		double soma = 0;
		for(double nota : notas) {
			soma += nota;
		}
		return soma/3;
	}

}
