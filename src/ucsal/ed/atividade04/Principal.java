package ucsal.ed.atividade04;

public class Principal {
	
public static void main(String[] args) {
		
		System.out.print("Calcular o fatorial de 5: ");
		System.out.println(calcularFatorial(5));
		
		System.out.print("Imprmir na tela a sequencia de Fibonacci até o 10° termo: ");
		int i = 0;
		while(i < 10) {
			System.out.print(calcularFibonacci(i) + " ");
			i++;
		}
		
		System.out.print("\nCalcule a 2^3: ");
		System.out.println(calcularPotencia(2, 3));
	}
	
	private static int calcularFatorial(int i) {
		if(i == 0) {
			return 1;
		}
		return i*calcularFatorial(i-1);
	}
	
	private static int calcularFibonacci(int i) {
		if(i < 2) {
			return i;
		} else {
			return calcularFibonacci(i - 1) + calcularFibonacci(i - 2);
		}
	}
	
	private static int calcularPotencia(int x, int y) {
		if(y == 0) {
			return 1;
		}else {
			return x * calcularPotencia(x, y-1);
		}
	}

}
