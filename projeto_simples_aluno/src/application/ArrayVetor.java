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
		Disciplina disciplina1 = new Disciplina();
		disciplina1.setDisciplina("Curso Java");
		disciplina1.setNota(notas);
		
		aluno.getDisciplinas().add(disciplina1);
		
		/*Criação da disciplina2*/
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Lógica de Programação");
		disciplina2.setNota(notasLogica);
		
		aluno.getDisciplinas().add(disciplina2);
		
		System.out.println("Nome do aluno = " + aluno.getNome() + " inscrito no curso: " + aluno.getNomeEscola());
		System.out.println("--------------- Disciplina do aluno ---------------");
		for(Disciplina d : aluno.getDisciplinas()) {
			
			System.out.println("Disciplina: " + d.getDisciplina());
			System.out.println("As notas da disciplina são: ");
			
			double notaMax = 0.0;
			for(int pos = 0; pos < d.getNota().length; pos ++) {
				System.out.println("Nota " + pos + " é igual: " + d.getNota()[pos]);
				
				if(pos == 0) {
					notaMax = d.getNota()[pos];
				}else {
					if(d.getNota()[pos] > notaMax) {
						notaMax = d.getNota()[pos];
					}
				}
			}
			System.out.println("A maior nota da Disciplina de " + d.getDisciplina() + " e de valor: " + notaMax);
		}
	}

}
