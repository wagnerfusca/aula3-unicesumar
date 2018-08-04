package br.edu.unicesumar.sistemaacademico;

public interface Nota {

	void calcularNota();
	
	default String algumaCoisa(String texto){
		return "valor "+ texto;
	}
	
}
