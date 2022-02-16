package ucsal.ed.lista01;

import java.util.Scanner;

import ucsal.ed.lista01.enums.OperacoesEnum;
import ucsal.ed.lista01.utils.Constantes;
import ucsal.ed.lista01.utils.Utils;

/**
 * Crie uma classe java que contenha um método que receba dois números e efetue a 
 * multiplicação destes números.
 */
public class Questao03 {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner (System.in)) {
			
			Utils.imprimirMsgTela(Constantes.COMANDO_01);
			double n1 = Double.parseDouble(scan.nextLine().replace(',', '.'));
			
			Utils.imprimirMsgTela(Constantes.COMANDO_02);
			double n2 = Double.parseDouble(scan.nextLine().replace(',', '.'));
			
			Utils.imprimirFormatado(Constantes.RESULTADO_OPERACAO, 
					OperacoesEnum.MULTIPLICACAO.getDescricao(),
					obterProduto(n1, n2));
			
		} catch (NumberFormatException e) {
			Utils.imprimirMsgTela(Constantes.VALOR_NAO_SUPORTADO);
			
		} catch (RuntimeException e) {
			Utils.imprimirMsgTela(e.getMessage());
		} 
		
	}
	
	private static double obterProduto(double n1, double n2) {
		return n1 * n2;
	}

}
