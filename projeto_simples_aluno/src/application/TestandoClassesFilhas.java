package application;

import projeto.classes.Aluno;
import projeto.classes.Diretor;
import projeto.classes.Secretario;

public class TestandoClassesFilhas {
	
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Pablo B.");
		aluno.setNomeEscola("Jdev Treinamento");
		
		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("42425596");
		diretor.setNome("Alex");
		
		Secretario secretario = new Secretario();
		secretario.setExperiencia("Administração");
		secretario.setNumeroCpf("000888555669");
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
	}

}
