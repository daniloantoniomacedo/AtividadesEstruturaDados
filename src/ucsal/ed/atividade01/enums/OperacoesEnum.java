package ucsal.ed.atividade01.enums;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import ucsal.ed.atividade01.utils.Constantes;

public enum OperacoesEnum {
	
	SOMA(1, "soma"),
	SUBTRACAO(2, "subtração"),
	MULTIPLICACAO(3, "multiplicação"),
	DIVISAO(4, "divisão");
	
	private int codigo;
	private String descricao;
	
	private OperacoesEnum(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static void verificarOpercoes(List<OperacoesEnum> operacoes) {
		if(Objects.isNull(operacoes) || operacoes.isEmpty()) {
			throw new RuntimeException(Constantes.OPCAO_INVALIDA);
		}
	}
	
	public static OperacoesEnum obterOpercaoesEnumPorCodigo(int codigo) {
		
		List<OperacoesEnum> operacoes = Stream.of(OperacoesEnum.values())
									   		  .filter(op -> op.getCodigo() == codigo)
									   		  .collect(Collectors.toList());
		
		verificarOpercoes(operacoes);
		
		return operacoes.get(0);
		
	}
	
	

}
