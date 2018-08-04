package br.edu.unicesumar.excecao;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class NumerosTest {

	@Test
	public void somarTest() throws NumeroNegativoException{
		Numero numero = new Numero();
		assertTrue(15 == numero.somar(12, 3));
	}
	
	@Test(expected = NumeroNegativoException.class)
	public void somarNegativoTest() throws NumeroNegativoException{
		Numero numero = new Numero();
		numero.somar(12, -3);
	}
}
