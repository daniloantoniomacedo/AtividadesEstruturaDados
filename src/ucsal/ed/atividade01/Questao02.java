package ucsal.ed.atividade01;

import java.util.Scanner;

import ucsal.ed.atividade01.utils.Constantes;
import ucsal.ed.atividade01.utils.Utils;

/**
 * Crie uma classe java que contenha um método que receba dois números e indique se
 * são iguais ou se são diferentes. Mostre o maior e o menor (nesta sequência).
 */
public class Questao02 {
	
	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner (System.in)) {
			
			Utils.imprimirMsgTela(Constantes.COMANDO_01);
			int n1 = Integer.parseInt(scan.nextLine());
			
			Utils.imprimirMsgTela(Constantes.COMANDO_02);
			int n2 = Integer.parseInt(scan.nextLine());
			
			verificarIgualdade(n1, n2);
			
			Utils.imprimirFormatado(Constantes.RESULTADO, obterMaiorValor(n1, n2));
			
		} catch (NumberFormatException e) {
			Utils.imprimirMsgTela(Constantes.VALOR_NAO_SUPORTADO);
			
		} catch (RuntimeException e) {
			Utils.imprimirMsgTela(e.getMessage());
		} 
		
	}
	
	private static void verificarIgualdade(int n1, int n2) {
		if(n1 == n2) {
			Utils.imprimirMsgTela(Constantes.VALORES_IGUAIS);
			System.exit(0);
		} else {
			Utils.imprimirMsgTela(Constantes.VALORES_DIFERENTES);
		}
	}
	
	private static int obterMaiorValor(int n1, int n2) {
		return n1 > n2 ? n1 : n2;
	}
	
}
