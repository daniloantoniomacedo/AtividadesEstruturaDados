package ucsal.ed.atividade.arvore;

public interface Tree<T> {
	
	void insert(T key);
	
	T search(T key);
	
	void inOrderTraverse();
	
	void inOrderTraverseLeft();
	
	void inOrderTraverseRight();
	
	void preOrderTraverse();
	
	void preOrderTraverseLeft();
	
	void preOrderTraverseRight();
	
	void postOrderTraverse();
	
	void postOrderTraverseLeft();
	
	void postOrderTraverseRight();
	
	void showJustLeafNodes();
	
	void showJustPairNodes();
	
	T min();
	
	T max();
	
	void remove(T key);

}
