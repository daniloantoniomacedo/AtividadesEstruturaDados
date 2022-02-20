package ucsal.ed.atividade01.utils;

public abstract class Constantes {
	
	public static final String COMANDO_01 = "Digite o primeiro valor: ";
	public static final String COMANDO_02 = "Digite o segundo valor: ";
	public static final String MENU = gerarMenu();
	
	public static final String RESULTADO = "O maior número é %d.";
	public static final String RESULTADO_OPERACAO = "O resultado da %s é %.2f.";
	public static final String RESULTADO_PRODUTO = "O estoque médio do produto %s é %.2f.";
	public static final String RESULTADO_PESO_IDEAL = "%s, o seu peso ideal é %.2f Kg.";
	public static final String RESULTADO_MEDIA = "%s, sau média é %.2f.";
	
	public static final String NOME_PRODUTO = "Qual o nome do produto?";
	public static final String QT_MAX = "Qual a quantidade máxima do produto?";
	public static final String QT_MIN = "Qual a quantidade mínima do produto?";
	
	public static final String NOTA_X = "Qual sua nota na %dº avaliação?";
	
	public static final String NOME_PESSOA = "Qual seu nome?";
	public static final String ALTURA = "Qual sua altura?";
	public static final String SEXO = "Qual seu sexo? Digite 'M' para masculino e 'F' feminino";
	
	public final static String VALOR_NAO_SUPORTADO = "Valor digitado não suportado.";
	public final static String VALORES_IGUAIS = "Os valores digitados são iguais.";
	public final static String VALORES_DIFERENTES = "Os valores digitados são diferentes.";
	public final static String OPCAO_INVALIDA = "Opção inválida.";

	private static String gerarMenu() {
		StringBuilder builder = new StringBuilder();
		builder.append("\nQual a operação deseja realizar? \n");
		builder.append("Digite 1 para soma \n");
		builder.append("Digite 2 para subtração \n");
		builder.append("Digite 3 para multiplicação \n");
		builder.append("Digite 4 para divisão \n");
		return builder.toString();
	}
}
