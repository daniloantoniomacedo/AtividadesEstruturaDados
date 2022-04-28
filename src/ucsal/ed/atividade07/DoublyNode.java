package ucsal.ed.atividade07;

public class DoublyNode<T> {
	
	private T content;
	
	private DoublyNode<T> next;
	
	private DoublyNode<T> prev;

	public DoublyNode(T content) {
		this.next = null;
		this.prev = null;
		this.content = content;
	}

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}

	public DoublyNode<T> getNext() {
		return next;
	}

	public void setNext(DoublyNode<T> next) {
		this.next = next;
	}

	public DoublyNode<T> getPrev() {
		return prev;
	}

	public void setPrev(DoublyNode<T> prev) {
		this.prev = prev;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DoublyNode [content=");
		builder.append(content);
		builder.append(", next=");
		builder.append(next);
		builder.append(", prev=");
		builder.append(prev);
		builder.append("]");
		return builder.toString();
	}
	
}
