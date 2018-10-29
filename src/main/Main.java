package main;

import enums.EnumExemplo;
import exceptions.FaltaDeFundosException;

public class Main {
	public static void main(String[] args) {
		double fundos = 0;
		try {
			verificarFundos(fundos);
		} catch (FaltaDeFundosException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("Verifica��o de fundos conclu�da");
		}

		// TESTES ENUM
		System.out.println(EnumExemplo.SALVAR.getValor());
		int teste = 1;
		if (teste == EnumExemplo.SALVAR.getValor()) {

		}

	}

	private static void verificarFundos(double fundos) throws FaltaDeFundosException {
		if (fundos <= 0) {
			throw new FaltaDeFundosException(fundos, "Fundos informados s�o insuficientes");
		}
	}
}
