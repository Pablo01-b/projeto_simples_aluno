package application;

import projeto.classes.Aluno;
import projeto.classes.Diretor;
import projeto.classes.Secretario;

public class TestandoClassesFilhas {
	
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Pablo B.");
		aluno.setNomeEscola("Jdev Treinamento");
		aluno.setIdade(16);
		
		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("42425596");
		diretor.setNome("Alex");
		diretor.setIdade(50);
		
		Secretario secretario = new Secretario();
		secretario.setExperiencia("Administração");
		secretario.setNumeroCpf("000888555669");
		secretario.setIdade(18);
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
		System.out.println(aluno.pessoaMaiorIdade() + " - " + aluno.msgMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
		
		System.out.println(" Salário é = " + aluno.salario());
		System.out.println(" Salário é = " + diretor.salario());
		System.out.println(" Salário é = " + secretario.salario());
	}

}
