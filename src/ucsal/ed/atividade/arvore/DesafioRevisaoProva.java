package ucsal.ed.atividade.arvore;

public class DesafioRevisaoProva {
	
	private static final Integer[] ARRAY = {11, 7, 15, 5, 9, 13, 20, 3, 6, 8, 10, 12, 14, 18, 25}; 

	public static void main(String[] args) {
		Tree<Integer> tree = new TreeImpl<Integer>();
		for(Integer i: ARRAY) {
			tree.insert(i);
		}
		
		System.out.println("\nEscreva um programa que leia 10 números, armazene-os em uma árvore e,\nem seguida, liste apenas os números pares. Pode utilizar qualquer caminhamento: ");
		tree.showJustPairNodes();

	}

}
