package enums;

public enum EnumExemplo {
	SALVAR(1), REMOVER(2), ATUALIZAR(3);

	private int valor;

	private EnumExemplo(int valor) {
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}


}
