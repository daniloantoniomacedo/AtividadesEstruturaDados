package ucsal.ed.lista01;

import java.util.Scanner;

import ucsal.ed.lista01.utils.Constantes;
import ucsal.ed.lista01.utils.Utils;

/**
 * Crie uma classe que receba como entrada o nome, a altura e o sexo da pessoa. Faça o
 * cálculo do peso ideal obedecendo a seguinte fórmula: para homens = (72.7*h) – 58
 * e para mulheres = (62.1 *h) - 44.7.
 */
public class Questao06 {
	
	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner (System.in)) {
			
			Utils.imprimirMsgTela(Constantes.NOME_PESSOA);
			String nome = scan.nextLine().trim();
			
			Utils.imprimirMsgTela(Constantes.SEXO);
			char sexo = scan.nextLine().trim().toUpperCase().charAt(0);
			
			verificarSexo(sexo);
			
			Utils.imprimirMsgTela(Constantes.ALTURA);
			double altura = Double.parseDouble(scan.nextLine().replace(',', '.'));
			
			Utils.imprimirFormatado(Constantes.RESULTADO_PESO_IDEAL, nome, 
			obterPesoIdeal(altura, sexo));
			
		} catch (NumberFormatException e) {
			Utils.imprimirMsgTela(Constantes.VALOR_NAO_SUPORTADO);
			
		} catch (RuntimeException e) {
			Utils.imprimirMsgTela(e.getMessage());
		} 
	}
	
	private static void verificarSexo(char sexo) {
		if(!(sexo == 'M' || sexo == 'F')) {
			throw new RuntimeException(Constantes.OPCAO_INVALIDA);
		}
	}
	
	private static double obterPesoIdeal(double altura, char sexo){
		return sexo == 'M' ? ((72.7 * altura) - 58) : ((62.1 * altura) - 44.7);
	}

}
