package ucsal.ed.lista01;

import java.util.Scanner;

import ucsal.ed.lista01.enums.OperacoesEnum;
import ucsal.ed.lista01.utils.Constantes;
import ucsal.ed.lista01.utils.Utils;

/**
 * Crie uma classe java em que o usuário informe dois números e a operação que deve
 * executar e apresente o resultado.
 */
public class Questao04 {
	

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner (System.in)) {
			
			Utils.imprimirMsgTela(Constantes.COMANDO_01);
			double n1 = Double.parseDouble(scan.nextLine().replace(',', '.'));
			
			Utils.imprimirMsgTela(Constantes.COMANDO_02);
			double n2 = Double.parseDouble(scan.nextLine().replace(',', '.'));
			
			Utils.imprimirMsgTela(Constantes.MENU);
			OperacoesEnum opercao = OperacoesEnum.
					obterOpercaoesEnumPorCodigo(Integer.parseInt(scan.nextLine()));
			
			Utils.imprimirFormatado(Constantes.RESULTADO_OPERACAO, opercao.getDescricao(),
					realizarOperacao(opercao, n1, n2));
			
		} catch (NumberFormatException e) {
			Utils.imprimirMsgTela(Constantes.VALOR_NAO_SUPORTADO);
			
		} catch (RuntimeException e) {
			Utils.imprimirMsgTela(e.getMessage());
		} 
		
	}
	
	private static double realizarOperacao(OperacoesEnum operacao, double n1, double n2) {
		
		double resultado = 0;
		
		switch (operacao.getCodigo()) {
		case 1: {
			resultado = obterSoma(n1, n2);
			break;
		}
		case 2: {
			resultado = obterDiferenca(n1, n2);
			break;
		}
		case 3: {
			resultado = obterProduto(n1, n2);
			break;
		}
		case 4: {
			resultado = obterQuociente(n1, n2);
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + operacao.getCodigo());
		}
		
		return resultado;
		
	}
	
	private static double obterSoma(double n1, double n2) {
		return n1 + n2;
	}
	
	private static double obterDiferenca(double n1, double n2) {
		return n1 - n2;
	}
	
	private static double obterProduto(double n1, double n2) {
		return n1 * n2;
	}
	
	private static double obterQuociente(double n1, double n2) {
		return n1/n2;
	}
	
}
