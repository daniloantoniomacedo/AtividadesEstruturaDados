package ucsal.ed.atividade07;

import java.util.Objects;

public class DoublyLinkedList<T> extends LinkedList<T> implements List<T>{
	
	private DoublyNode<T> head;
	
	private DoublyNode<T> tail;
	
	@Override
	public void insert(T t, int index) throws NotFoundException {
		
		verifyIndex(index);
		
		DoublyNode<T> newNode = new DoublyNode<T>(t);
		if(index == 0) {
			if(Objects.isNull(this.head)) {
				this.head = newNode;
				this.tail = newNode;
			} else {
				newNode.setNext(this.head);
				this.head.setPrev(newNode);
				this.head = newNode;
			}
			
		} else if(index == this.length) {
			this.tail.setNext(newNode);
			newNode.setPrev(this.tail);
			this.tail = newNode;
			
		} else {
			DoublyNode<T> previousNode = getDoublyNodeAt(index - 1);
			DoublyNode<T> currentNode = previousNode.getNext();
			newNode.setNext(currentNode);
			previousNode.setNext(newNode);
			currentNode.setPrev(newNode);
			newNode.setPrev(previousNode);
		}
		
		this.length++;
		
	}
	
	private DoublyNode<T> getDoublyNodeAt(int index) throws NotFoundException {
		verifyIndex(index);
		DoublyNode<T> currentNode = this.head;
		for(int i = 0; i < index && Objects.nonNull(currentNode); i++) {
			currentNode = currentNode.getNext();
		}
		return currentNode;
	}
}
