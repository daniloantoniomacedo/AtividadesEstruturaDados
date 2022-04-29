package ucsal.ed.atividade07;

public class DoublyMain {
	
	public static void main(String[] args) {
		
		Professor prof1 = new Professor("Angela1");
		Professor prof2 = new Professor("Angela2");
		Professor prof3 = new Professor("Angela3");
		
		List<Professor> listaDuplaLigada = new DoublyLinkedList<Professor>();
		
		try {
			listaDuplaLigada.insert(prof1, 0);
			listaDuplaLigada.insert(prof2, 1);
			listaDuplaLigada.insert(prof3, 2);
			
			System.out.println(listaDuplaLigada.getElementAt(0));
			System.out.println(listaDuplaLigada.getElementAt(1));
			System.out.println(listaDuplaLigada.getElementAt(2));
			
			System.out.println("----------------------------------");
			
			listaDuplaLigada.removeAt(0);
			
			System.out.println(listaDuplaLigada.getElementAt(0));
			System.out.println(listaDuplaLigada.getElementAt(1));
			System.out.println(listaDuplaLigada.getElementAt(2));

			System.out.println("----------------------------------");
			
			listaDuplaLigada.remove(prof3);
			
			System.out.println(listaDuplaLigada.getElementAt(0));
			System.out.println(listaDuplaLigada.getElementAt(1));
			System.out.println(listaDuplaLigada.size());
			
			System.out.println("----------------------------------");
			
		} catch (NotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
