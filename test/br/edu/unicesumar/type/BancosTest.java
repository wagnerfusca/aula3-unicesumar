package br.edu.unicesumar.type;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BancosTest {

	@Test
	public void nomeBancosTest(){
		assertEquals("Itaú" , Bancos.ITAU.nomeBanco);
	}
	
	@Test
	public void numeroBancosTest(){
		assertEquals("001" , Bancos.BANCO_BRASIL.numeroBanco);
		assertEquals("033" , Bancos.SANTANDER.numeroBanco);
		assertEquals("341" , Bancos.ITAU.numeroBanco);
		assertEquals("104" , Bancos.CEF.numeroBanco);
		assertEquals("756" , Bancos.BANCOOB.numeroBanco);
	}
}
