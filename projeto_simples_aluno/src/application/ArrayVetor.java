package application;

import projeto.classes.Aluno;
import projeto.classes.Disciplina;

public class ArrayVetor {

	public static void main(String[] args) {
		
		double[] notasJava = {8.8, 9.7, 7.6, 6.8};
		double[] notasLogica = {7.5, 5.6, 9.8, 6.9};
		double[] notasHtml = {7.3, 6.9, 8.5, 9.9};
		double[] notasCss = {8.8, 9.3, 7.9, 10.0};
		
		/*Criação do aluno*/
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Pablo");
		aluno1.setNomeEscola("Jdev");
		
		/*Criação da disciplina*/
		Disciplina disciplina1 = new Disciplina();
		disciplina1.setDisciplina("Curso Java");
		disciplina1.setNota(notasJava);
		
		aluno1.getDisciplinas().add(disciplina1);
		
		/*Criação da disciplina2*/
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Lógica de Programação");
		disciplina2.setNota(notasLogica);
		
		aluno1.getDisciplinas().add(disciplina2);
		
		/*Criação do aluno*/
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Pedro");
		aluno2.setNomeEscola("Treinamento");
		
		/*Criação da disciplina*/
		Disciplina disciplina3 = new Disciplina();
		disciplina3.setDisciplina("html");
		disciplina3.setNota(notasHtml);
		
		aluno2.getDisciplinas().add(disciplina3);
		
		/*Criação da disciplina2*/
		Disciplina disciplina4 = new Disciplina();
		disciplina4.setDisciplina("css");
		disciplina4.setNota(notasCss);
		
		aluno2.getDisciplinas().add(disciplina4);
		
		//---------------------------------------------------------
		
		Aluno[] arrayAlunos = new Aluno[2];
		
		arrayAlunos[0] = aluno1;
		arrayAlunos[1] = aluno2;
		
		for(int pos = 0; pos < arrayAlunos.length; pos ++) {
			
			System.out.println("Nome do aluno é: " + arrayAlunos[pos].getNome());
			
			for(Disciplina d : arrayAlunos[pos].getDisciplinas()) {
				System.out.println("Nome da disciplina é: " + d.getDisciplina());
				
				for(int posnota = 0; posnota < d.getNota().length; posnota++) {
					System.out.println("A nota número " + posnota + " é igual: " + d.getNota()[posnota]);
				}
			}
		}
	}
}
