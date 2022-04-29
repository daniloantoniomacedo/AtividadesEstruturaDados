package ucsal.ed.atividade07;

import java.util.Objects;

public class LinkedList<T> implements List<T> {
	
	private Node<T> head;
	
	int length;

	@Override
	public void insert(T t, int index) throws NotFoundException {
		if(index >= 0 && index <= this.length) {
			Node<T> newNode = new Node<T>(t);
			if(index == 0) {
				newNode.setNext(this.head);
				this.head = newNode;
			} else {
				Node<T> beforeNode = getNodeAt(index - 1);
				Node<T> currentNode = beforeNode.getNext();
				beforeNode.setNext(newNode);
				newNode.setNext(currentNode);
			}
			length++;
		} else {
			throw new NotFoundException();
		}
		
	}
	
	/**
	 * Insere no fim da lista
	 */
	@Override
	public void push(T t) {
		Node<T> newNode = new Node<T>(t, null);
		if(Objects.isNull(this.head)) {
			this.head = newNode;
		} else {
			Node<T> currentNode = this.head;
			while(Objects.nonNull(currentNode.getNext())) {
				currentNode = currentNode.getNext();
			}
			currentNode.setNext(newNode);
		}
		length++;
		
	}

	@Override
	public T getElementAt(int index) throws NotFoundException {
		if(index >= 0 && index <= this.length) {
			Node<T> currentNode = this.head;
			for(int i = 0; i < index && Objects.nonNull(currentNode); i++) {
				currentNode = currentNode.getNext();
			}
			return Objects.isNull(currentNode) ? null : currentNode.getContent();
		}
		throw new NotFoundException();
	}

	@Override
	public void remove(T t) throws NotFoundException {
		int index = indexOf(t);
		removeAt(index);
		
	}

	@Override
	public void removeAt(int index) throws NotFoundException {
		verifyIndex(index);
		if(index == 0) {
			this.head = this.head.getNext();
		} else {
			Node<T> beforeNode = getNodeAt(index - 1);
			Node <T> currentNode = beforeNode.getNext();
			beforeNode.setNext(currentNode.getNext());
		}
		length--;
	}

	@Override
	public int indexOf(T t) throws NotFoundException {
		Node<T> currentNode = this.head;
		for(int i = 0; i < this.length && Objects.nonNull(currentNode); i++) {
			if(currentNode.getContent().equals(t)) {
				return i;
			}
			currentNode = currentNode.getNext();
		}
		throw new NotFoundException();
	}

	@Override
	public boolean isEmpty() {
		return Objects.isNull(head);
	}

	@Override
	public int size() {
		return length;
	}
	
	@Override
	public void clear() {
		this.head = null;
		length = 0;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LinkedList [head=");
		builder.append(head);
		builder.append("]");
		return builder.toString();
	}
	
	private Node<T> getNodeAt(int index) throws NotFoundException {
		verifyIndex(index);
		Node<T> currentNode = this.head;
		for(int i = 0; i < index && Objects.nonNull(currentNode); i++) {
			currentNode = currentNode.getNext();
		}
		return currentNode;
	}
	
	void verifyIndex(int index) throws NotFoundException {
		if(index < 0 || index > this.length) {
			throw new NotFoundException();
		}
	}
	
}
