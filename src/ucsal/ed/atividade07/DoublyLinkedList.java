package ucsal.ed.atividade07;

import java.util.Objects;

public class DoublyLinkedList<T> implements List<T>{
	
	private DoublyNode<T> head;
	
	private DoublyNode<T> tail;
	
	private int length;
	
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
	
	@Override
	public void removeAt(int index) throws NotFoundException {
		
		verifyIndex(index);
		
		if(index == 0) {
			this.head = this.head.getNext();
			if(this.length == 1) {
				this.tail = null;
			}else{
				this.head.setPrev(null);
			}
			
		} else if(index == this.length - 1) {
			DoublyNode<T> currentNode = this.tail;
			this.tail = currentNode.getPrev();
			this.tail.setNext(null);
			
		} else {
			DoublyNode<T> currentNode = getDoublyNodeAt(index);
			DoublyNode<T> previousNode = currentNode.getPrev();
			previousNode.setNext(currentNode.getNext());
			currentNode.getNext().setNext(previousNode);
		}
		
		this.length--;
		
	}
	
	private DoublyNode<T> getDoublyNodeAt(int index) throws NotFoundException {
		verifyIndex(index);
		DoublyNode<T> currentNode = this.head;
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DoublyLinkedList [head=");
		builder.append(head);
		builder.append(", tail=");
		builder.append(tail);
		builder.append(", length=");
		builder.append(length);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public void push(T t) {
		try {
			insert(t, this.length);
		} catch (NotFoundException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public T getElementAt(int index) throws NotFoundException {
		if(index >= 0 && index <= this.length) {
			DoublyNode<T> currentNode = this.head;
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
	public int indexOf(T t) throws NotFoundException {
		DoublyNode<T> currentNode = this.head;
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
		return Objects.isNull(this.head);
	}

	@Override
	public int size() {
		return this.length;
	}

	@Override
	public void clear() {
		this.head = null;
		this.tail = null;
		this.length = 0;
		
	}
	
}
