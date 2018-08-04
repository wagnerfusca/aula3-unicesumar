package br.edu.unicesumar.excecao;

public class Numero {

	public Integer somar(Integer valor1, Integer valor2) throws NumeroNegativoException {
		if (valor2 < 0){
			throw new NumeroNegativoException("valor negativo");
		}
		
		return valor1 + valor2;
		
	}

}
