package ucsal.ed.atividade.arvore;

import java.util.Objects;

public class TreeImpl<T> implements Tree<Integer> {
	
	private Node<Integer> root;
	
	@Override
	public void insert(Integer key) {
		if(Objects.isNull(root)) {
			this.root = new Node<Integer>(key);
		} else {
			this.insertNode(this.root, key);
		}
	}

	public void insertNode(Node<Integer> node, Integer key) {
		if(key.compareTo(node.getKey()) < 0) {
			if(Objects.isNull(node.getLeft())) {
				node.setLeft(new Node<Integer>(key));
			} else {
				insertNode(node.getLeft(), key);
			}
		} else {
			if(Objects.isNull(node.getRight())) {
				node.setRight(new Node<Integer>(key));
			} else {
				insertNode(node.getRight(), key);
			}
		}
	}

	@Override
	public Integer search(Integer key) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void inOrderTraverse() {
		inOrderTraverseNode(this.root);
	}

	private void inOrderTraverseNode(Node<Integer> node) {
		if(Objects.nonNull(node)) {
			inOrderTraverseNode(node.getLeft());
			System.out.print(node.getKey() + " ");
			inOrderTraverseNode(node.getRight());
		}
	}
	
	@Override
	public void inOrderTraverseLeft() {
		inOrderTraverseNodeLeft(this.root);
	}

	private void inOrderTraverseNodeLeft(Node<Integer> node) {
		if(Objects.nonNull(node)) {
			inOrderTraverseNode(node.getLeft());
			System.out.print(node.getKey() + " ");
		}
	}
	
	@Override
	public void inOrderTraverseRight() {
		inOrderTraverseNodeRight(this.root);
	}

	private void inOrderTraverseNodeRight(Node<Integer> node) {
		if(Objects.nonNull(node)) {
			System.out.print(node.getKey() + " ");
			inOrderTraverseNode(node.getRight());
		}
	}
	
	@Override
	public void preOrderTraverse() {
		preOrderTraverseNode(this.root);
	}

	private void preOrderTraverseNode(Node<Integer> node) {
		if(Objects.nonNull(node)) {
			System.out.print(node.getKey() + " ");
			preOrderTraverseNode(node.getLeft());
			preOrderTraverseNode(node.getRight());
		}
	}
	
	@Override
	public void preOrderTraverseLeft() {
		preOrderTraverseNodeLeft(this.root);
	}

	private void preOrderTraverseNodeLeft(Node<Integer> node) {
		if(Objects.nonNull(node)) {
			System.out.print(node.getKey() + " ");
			preOrderTraverseNode(node.getLeft());
		}
	}
	
	@Override
	public void preOrderTraverseRight() {
		preOrderTraverseNodeRight(this.root);
	}

	private void preOrderTraverseNodeRight(Node<Integer> node) {
		if(Objects.nonNull(node)) {
			System.out.print(node.getKey() + " ");
			preOrderTraverseNode(node.getRight());
		}
	}
	
	@Override
	public void postOrderTraverse() {
		postOrderTraverseNode(this.root);
	}

	private void postOrderTraverseNode(Node<Integer> node) {
		if(Objects.nonNull(node)) {
			postOrderTraverseNode(node.getLeft());
			postOrderTraverseNode(node.getRight());
			System.out.print(node.getKey() + " ");
		}
	}
	
	@Override
	public void postOrderTraverseLeft() {
		postOrderTraverseNodeLeft(this.root);
	}

	private void postOrderTraverseNodeLeft(Node<Integer> node) {
		if(Objects.nonNull(node)) {
			postOrderTraverseNode(node.getLeft());
			System.out.print(node.getKey() + " ");
		}
	}
	
	@Override
	public void postOrderTraverseRight() {
		postOrderTraverseNodeRight(this.root);
	}

	private void postOrderTraverseNodeRight(Node<Integer> node) {
		if(Objects.nonNull(node)) {
			postOrderTraverseNode(node.getRight());
			System.out.print(node.getKey() + " ");
		}
	}

	@Override
	public Integer min() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer max() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(Integer key) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void showJustLeafNodes() {
		showJustLeafNodes(this.root);
	}
	
	private static boolean isLeaf(Node<Integer> node) {
		return Objects.isNull(node.getLeft()) && Objects.isNull(node.getRight());
	}

	private void showJustLeafNodes(Node<Integer> node) {
		if(Objects.nonNull(node)) {
			
			if(isLeaf(node)) {
				System.out.print(node.getKey() + " ");
			}
			
			if(Objects.nonNull(node.getLeft())) {
				showJustLeafNodes(node.getLeft());
			}
			
			if(Objects.nonNull(node.getRight())) {
				showJustLeafNodes(node.getRight());
			}
			
		}
	}
	
	@Override
	public void showJustPairNodes() {
		showJustPairNodes(this.root);
	}
	
	private void showJustPairNodes(Node<Integer> node) {
		if(Objects.nonNull(node)) {
			System.out.print(node.getKey()%2 == 0 ? node.getKey() + " " : "");
			showJustPairNodes(node.getLeft());
			showJustPairNodes(node.getRight());
		}
	}
	

}
