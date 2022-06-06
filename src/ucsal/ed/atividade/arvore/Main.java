package ucsal.ed.atividade.arvore;

public class Main {
	
	private static final Integer[] ARRAY = {11, 7, 15, 5, 9, 13, 20, 3, 6, 8, 10, 12, 14, 18, 25}; 

	public static void main(String[] args) {
		Tree<Integer> tree = new TreeImpl<Integer>();
		for(Integer i: ARRAY) {
			tree.insert(i);
		}
		
		System.out.println("###################### ");
		System.out.println("BOTH SIDES");
		System.out.println("###################### ");
		
		System.out.println("\ninOrderTraverse: ");
		tree.inOrderTraverse();
		
		System.out.println("\npreOrderTraverse: ");
		tree.preOrderTraverse();
		
		System.out.println("\npostOrderTraverse: ");
		tree.postOrderTraverse();
		
		System.out.println("\n\n###################### ");
		System.out.println("JUST LEFT");
		System.out.println("###################### ");
		
		System.out.println("\ninOrderTraverse: ");
		tree.inOrderTraverseLeft();
		
		System.out.println("\npreOrderTraverse: ");
		tree.preOrderTraverseLeft();
		
		System.out.println("\npostOrderTraverse: ");
		tree.postOrderTraverseLeft();
		
		System.out.println("\n\n###################### ");
		System.out.println("JUST RIGHT");
		System.out.println("###################### ");
		
		System.out.println("\ninOrderTraverse: ");
		tree.inOrderTraverseRight();
		
		System.out.println("\npreOrderTraverse: ");
		tree.preOrderTraverseRight();
		
		System.out.println("\npostOrderTraverse: ");
		tree.postOrderTraverseRight();
		
		System.out.println("\n\n###################### ");
		System.out.println("JUST LEAF NODES");
		System.out.println("######################\n ");
		
		tree.showJustLeafNodes();
		
		System.out.println("\n\n###################### ");
		System.out.println("JUST PAIR NODES");
		System.out.println("######################\n ");
		
		tree.showJustPairNodes();
		
	}

}
