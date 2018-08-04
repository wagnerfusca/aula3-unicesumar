package br.edu.unicesumar.sistemaacademico;

public class Secretaria extends Funcionario implements Autenticavel, Nota{

	@Override
	protected Double calculaSalario() {
		return 100 * 1.2;
	}

	@Override
	public void logar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calcularNota() {
		// TODO Auto-generated method stub
		
	}

}
