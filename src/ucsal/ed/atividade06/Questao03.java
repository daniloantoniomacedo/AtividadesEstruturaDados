package ucsal.ed.atividade06;

public class Questao03 {
	
	/**
	 * Escreva em java um método recursivo que receba um número inteiro na
	 * base decimal e realize a conversão deste número para base binária.
	 * @param args
	 */
	public static void main(String[] args) {
		//System.out.print(bin(2));
		bin(45);

	}
	
	private static int bin(int n) {
		if(n > 0) {
			bin(n / 2);
			System.out.print(n % 2);
		}
		return n;
	}
	
}
