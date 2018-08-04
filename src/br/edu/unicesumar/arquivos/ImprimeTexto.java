package br.edu.unicesumar.arquivos;

import java.util.function.Consumer;

public class ImprimeTexto implements Consumer<String>{

	@Override
	public void accept(String t) {
		System.out.println(t);
	}
}
