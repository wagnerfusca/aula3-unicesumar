package br.edu.unicesumar.sistemaacademico;

public class Seguranca extends Funcionario{

	@Override
	protected Double calculaSalario() {
		return 100 * 1.5;
	}

}
