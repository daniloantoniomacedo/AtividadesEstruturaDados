package ucsal.ed.atividade02.utils;

import java.util.Objects;

public abstract class Utils {
	
	public static void imprimir(Object o) {
		if(Objects.nonNull(o)) {
			System.out.println(o);
		}
	}

}
