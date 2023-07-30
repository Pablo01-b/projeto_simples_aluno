package application;

import javax.swing.JOptionPane;

import projeto.classes.Aluno;
import projeto.classes.Disciplina;

public class Program {

	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("Nome do aluno");
		String idade = JOptionPane.showInputDialog("Idade");
		String dataNascimento = JOptionPane.showInputDialog("Data de nascimento");
		String rg = JOptionPane.showInputDialog("Qual é o RG?");
		String cpf = JOptionPane.showInputDialog("Qual é o CPF?");
		String mae = JOptionPane.showInputDialog("Nome da Mãe");
		String pai = JOptionPane.showInputDialog("Nome do Pai");
		String matricula = JOptionPane.showInputDialog("Data de Matricula");
		String serie = JOptionPane.showInputDialog("Qual a serie matriculado?");
		String escola = JOptionPane.showInputDialog("Nome da escola");

		Aluno aluno1 = new Aluno();

		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);
		aluno1.setDataMatricula(matricula);
		aluno1.setSerieMatriculado(serie);
		aluno1.setNomeEscola(escola);

		Disciplina disciplina01 = new Disciplina();
		disciplina01.setDisciplina("Banco de Dados");
		disciplina01.setNota(90);
		aluno1.getDisciplinas().add(disciplina01);
		
		Disciplina disciplina02 = new Disciplina();
		disciplina02.setDisciplina("Matemática Aplicada a Computação");
		disciplina02.setNota(80);
		aluno1.getDisciplinas().add(disciplina02);
		
		Disciplina disciplina03 = new Disciplina();
		disciplina03.setDisciplina("Algotimos e Lógica de Programação");
		disciplina03.setNota(97);
		aluno1.getDisciplinas().add(disciplina03);
		
		Disciplina disciplina04 = new Disciplina();
		disciplina04.setDisciplina("Java Web");
		disciplina04.setNota(70);
		aluno1.getDisciplinas().add(disciplina04);
		

		System.out.println(aluno1.toString());
		System.out.println("Média do aluno = " + aluno1.getMediaNota());
		System.out.println(aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado");
		System.out.println(aluno1.getAlunoAprovado2());

	}

}
