package ucsal.ed.atividade06;

public class Questao02 {
	
	/**
	 * Desenvolva um programa em java que calcule o fatorial de um número x.
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(fat(5));

	}
	
	private static int fat(int n) {
		if(n == 0) {
			return 1;
		} else {
			return n * fat(n - 1);
		}
	}
	
	

}
