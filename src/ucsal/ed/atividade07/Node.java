package ucsal.ed.atividade07;

public class Node<T> {
	
	private T content;
	
	private Node<T> next;
	
	public Node(T content, Node<T> next) {
		this.content = content;
		this.next = next;
	}
	
	public Node(T content) {
		this.content = content;
		this.next = null;
	}

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Node [content=");
		builder.append(content);
		builder.append(", next=");
		builder.append(next);
		builder.append("]");
		return builder.toString();
	}
	
}
