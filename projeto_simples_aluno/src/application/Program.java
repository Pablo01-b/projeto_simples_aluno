package application;

import javax.swing.JOptionPane;

import projeto.classes.Aluno;

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
		
		String disciplina1 = JOptionPane.showInputDialog("Disciplina 1?");
		String note1 = JOptionPane.showInputDialog("Nota 1");
		
		String disciplina2 = JOptionPane.showInputDialog("Disciplina 2?");
		String note2 = JOptionPane.showInputDialog("Nota 2");
		
		String disciplina3 = JOptionPane.showInputDialog("Disciplina 3?");
		String note3 = JOptionPane.showInputDialog("Nota 3");
		
		String disciplina4 = JOptionPane.showInputDialog("Disciplina 4?");
		String note4 = JOptionPane.showInputDialog("Nota 4");
		
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
		
		aluno1.setDisciplina1(disciplina1);
		aluno1.setNota1(Double.parseDouble(note1));
		aluno1.setDisciplina2(disciplina2);
		aluno1.setNota2(Double.parseDouble(note2));
		aluno1.setDisciplina3(disciplina3);
		aluno1.setNota3(Double.parseDouble(note3));
		aluno1.setDisciplina4(disciplina4);
		aluno1.setNota4(Double.parseDouble(note4));
		
		System.out.println(aluno1.toString());
		System.out.println("Média do aluno = " + aluno1.getMediaNota());
		System.out.println(aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"); 
		System.out.println("Resultado = " + aluno1.getAlunoAprovado2());
		
	}

}
