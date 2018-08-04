package br.edu.unicesumar.excecao;

import java.io.FileNotFoundException;


public class NumeroNegativoException extends Exception {
 
	private static final long serialVersionUID = 8612600631110617048L;

	public NumeroNegativoException(String msg){
		super(msg);
	}
	
	public NumeroNegativoException(String msg, Throwable causa){
		super(msg, causa);
	}
}
