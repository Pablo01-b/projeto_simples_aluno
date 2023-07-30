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

		for (int pos = 1; pos <= 4; pos++ ) {
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina "+ pos + " ?");
			String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " + pos + " ?");
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
			
			aluno1.getDisciplinas().add(disciplina);
		}
		
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina ?");
		
		if(escolha == 0) {/*Opção SIM é ZERO*/	
			
			int continuarRemover = 0;
			int posicao = 1;
			
			while (continuarRemover == 0) {
			String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3, ou 4 ?");
			aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
			posicao ++;
			continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");
			}
		}
		
		System.out.println(aluno1); /*Descrição do objeto na memoria*/
		System.out.println("Média do aluno = " + aluno1.getMediaNota());
		System.out.println(aluno1.getAlunoAprovado2());

	}

}
