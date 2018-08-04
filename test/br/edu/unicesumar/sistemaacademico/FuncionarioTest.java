package br.edu.unicesumar.sistemaacademico;

import org.junit.Test;

public class FuncionarioTest {

	@Test
	public void test(){
		Nota aluno = new Aluno();
		Nota extensao = new AlunoCursoExtensao();
		Nota secretaria = new Secretaria();
		
		aluno.calcularNota();
		extensao.calcularNota();
		secretaria.calcularNota();
		
		System.out.println(aluno.algumaCoisa("outra mensagem") );
		
	}
}
