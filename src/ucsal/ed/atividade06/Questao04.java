package ucsal.ed.atividade06;

/**
 * Faça um programa em java fazendo uso da recursividade que solicite para o
 * usuário digitar um número, em seguida, faça a soma de todos os algarismos do
 * número.
 * @author Danilo
 *
 */
public class Questao04 {
	
	private static int SUM;

	public static void main(String[] args) {
		sum("1981");
		System.out.print(SUM);
	}
	
	private static void sum(String n) {
		
		if(n.length() > 0) {
			sum(n.substring(0, n.length() - 1));
			SUM += Character.getNumericValue(n.charAt(n.length() - 1));
		}
	}

}
