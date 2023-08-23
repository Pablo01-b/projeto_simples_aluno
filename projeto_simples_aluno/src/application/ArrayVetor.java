package application;

import projeto.classes.Aluno;
import projeto.classes.Disciplina;

public class ArrayVetor {

	public static void main(String[] args) {
		
		double[] notas = {8.8, 9.7, 7.6, 6.8};
		double[] notasLogica = {7.5, 5.6, 9.8, 6.9};
		
		/*Criação do aluno*/
		Aluno aluno = new Aluno();
		aluno.setNome("Pablo");
		aluno.setNomeEscola("Jdev");
		
		/*Criação da disciplina*/
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Curso Java");
		disciplina.setNota(notas);
		
		aluno.getDisciplinas().add(disciplina);
		
		/*Criação da disciplina2*/
		Disciplina disciplina2 = new Disciplina();
		disciplina.setDisciplina("Lógica de Programação");
		disciplina2.setNota(notasLogica);
		
		aluno.getDisciplinas().add(disciplina2);
		
	
 }

}
