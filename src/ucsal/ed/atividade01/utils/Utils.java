package ucsal.ed.atividade01.utils;

public abstract class Utils {
	
	public static void imprimirMsgTela(String msg) {
		System.out.println(msg);
	}
		
	public static void imprimirFormatado(String msg, Object... resultado) {
		System.out.println(String.format(msg, resultado));
	}

}
