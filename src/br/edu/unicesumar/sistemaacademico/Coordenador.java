package br.edu.unicesumar.sistemaacademico;

public class Coordenador extends Funcionario implements Autenticavel{

	@Override
	public Double calculaSalario() {
		return 100 * 2.5;
	}

	@Override
	public void logar() {
		// TODO Auto-generated method stub
		
	}

}
