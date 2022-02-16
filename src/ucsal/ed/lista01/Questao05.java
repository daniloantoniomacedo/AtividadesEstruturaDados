package ucsal.ed.lista01;

import java.util.Scanner;

import ucsal.ed.lista01.utils.Constantes;
import ucsal.ed.lista01.utils.Utils;

/**
 * Crie uma classe em java para calcular o estoque médio de um produto. O estoque 
 * médio é calculado pela formula: estoque médio = (quantidade mínima + quantidade
 * máxima)/2. Deverá ser solicitado ao usuário o nome do produto, a quantidade mínima
 * e a quantidade máxima do produto.
 */
public class Questao05 {
	
	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner (System.in)) {
			
			Utils.imprimirMsgTela(Constantes.NOME_PRODUTO);
			String nome = scan.nextLine().trim();
			
			Utils.imprimirMsgTela(Constantes.QT_MAX);
			double qtMax = Double.parseDouble(scan.nextLine().replace(',', '.'));
			
			Utils.imprimirMsgTela(Constantes.QT_MIN);
			double qtMin = Double.parseDouble(scan.nextLine().replace(',', '.'));
			
			Utils.imprimirFormatado(Constantes.RESULTADO_PRODUTO, nome, obterMedia(qtMax, qtMin));
			
		} catch (NumberFormatException e) {
			Utils.imprimirMsgTela(Constantes.VALOR_NAO_SUPORTADO);
			
		} catch (RuntimeException e) {
			Utils.imprimirMsgTela(e.getMessage());
		} 
	}
	
	private static double obterMedia(double qtMax, double qtMin){
		return (qtMax+qtMin)/2;
	}

}
