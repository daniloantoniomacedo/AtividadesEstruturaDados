package ucsal.ed.atividade07;

public interface List<T> {
	
	void insert(T t, int index) throws NotFoundException;
	
	void push(T t);
	
	T getElementAt(int index) throws NotFoundException;
	
	void remove(T t) throws NotFoundException;
	
	void removeAt(int index) throws NotFoundException;
	
	int indexOf(T t) throws NotFoundException;
	
	boolean isEmpty();
	
	int size();
	
	String toString();
	
	void clear();

}
