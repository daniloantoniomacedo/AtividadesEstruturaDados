package ucsal.ed.atividade07;

public class Main {

	public static void main(String[] args) {
		
		try {
			
			Professor prof1 = new Professor("Angela1");
			Professor prof2 = new Professor("Angela2");
			Professor prof3 = new Professor("Angela3");
			
			List<Professor> lista = new LinkedList<Professor>();
			lista.push(prof1);
			lista.push(prof2);
			
			System.out.println(lista);
			
			lista.clear();
			
			lista.insert(prof1, 0);
			lista.insert(prof2, 1);
			lista.insert(prof3, 2);
			
			System.out.println(lista);
			
			lista.remove(prof3);
			
			System.out.println(lista);
			
			System.out.println(lista.getElementAt(1));
			
		} catch (NotFoundException e) {
			e.printStackTrace();
		}
	}

}
