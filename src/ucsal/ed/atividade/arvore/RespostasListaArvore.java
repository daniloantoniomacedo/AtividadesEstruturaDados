package ucsal.ed.atividade.arvore;

public class RespostasListaArvore {
	
	private static final Integer[] ARRAY = {5, 3, 9, 4, 7, 11}; 

	public static void main(String[] args) {
		Tree<Integer> tree = new TreeImpl<Integer>();
		for(Integer i: ARRAY) {
			tree.insert(i);
		}
		
		System.out.println("\na) Mostrar o caminhamento central a esquerda: ");
		tree.inOrderTraverseLeft();
		
		System.out.println("\nb) Mostrar o caminhamento pré-fixado a direita: ");
		tree.preOrderTraverseRight();
		
		System.out.println("\nc) Mostrar o caminhamento pós-fixado a esquerda: ");
		tree.postOrderTraverseLeft();
		
		System.out.println("\nd) Apresentar todos os nós folhas: ");
		tree.showJustLeafNodes();
		
		System.out.println("\ne) Liste o pai (Raiz) e seus Filhos: ");
		tree.inOrderTraverse();
		
	}

}
