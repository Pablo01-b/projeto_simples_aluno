package application;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import projeto.classes.Aluno;
import projeto.classes.Disciplina;
import projeto.constantes.StatusAluno;

public class Program {

	public static void main(String[] args) {
		
		String login = JOptionPane.showInputDialog("Informe o login:");
		String senha = JOptionPane.showInputDialog("Informe a senha:");
		
		if(login.equalsIgnoreCase("admin") && 
		   senha.equalsIgnoreCase("admin")) {	
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		/*é uma lista que dentro dela temos uma chave que identifica uma sequencia de valores também*/
		HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();
		
		
		for(int qtd = 1; qtd <= 3; qtd++) {
			
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + " ?");
		/*String idade = JOptionPane.showInputDialog("Idade");
		String dataNascimento = JOptionPane.showInputDialog("Data de nascimento");
		String rg = JOptionPane.showInputDialog("Qual é o RG?");
		String cpf = JOptionPane.showInputDialog("Qual é o CPF?");
		String mae = JOptionPane.showInputDialog("Nome da Mãe");
		String pai = JOptionPane.showInputDialog("Nome do Pai");
		String matricula = JOptionPane.showInputDialog("Data de Matricula");
		String serie = JOptionPane.showInputDialog("Qual a serie matriculado?");
		String escola = JOptionPane.showInputDialog("Nome da escola");*/

		Aluno aluno1 = new Aluno();

		aluno1.setNome(nome);
		/*aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);
		aluno1.setDataMatricula(matricula);
		aluno1.setSerieMatriculado(serie);
		aluno1.setNomeEscola(escola);*/

		for (int pos = 1; pos <= 1; pos++ ) {
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
		
		alunos.add(aluno1);
		}
		
		maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
		maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
		
		for (Aluno aluno : alunos) {/*Separei em listas*/
			
			if(aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
				maps.get(StatusAluno.APROVADO).add(aluno);
			}else if(aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
				maps.get(StatusAluno.RECUPERACAO).add(aluno);
			}else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.REPROVADO)){
				maps.get(StatusAluno.REPROVADO).add(aluno); /*Reprovado*/
			}
			
		}
		
		System.out.println("--------------------Lista de Aprovados--------------------");
		for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
			System.out.println("Nome do Aluno(a): " + aluno.getNome());
			System.out.println(aluno.getDisciplinas());
			System.out.println("Resultado = " + aluno.getAlunoAprovado2() + " com média de = " + aluno.getMediaNota());
		}
		
		System.out.println("--------------------Lista de Recuperação--------------------");
		for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
			System.out.println("Nome do Aluno(a): " + aluno.getNome());
			System.out.println(aluno.getDisciplinas());
			System.out.println("Resultado = " + aluno.getAlunoAprovado2() + " com média de = " + aluno.getMediaNota());
		}
		
		System.out.println("--------------------Lista de Reprovados--------------------");
		for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
			System.out.println("Nome do Aluno(a): " + aluno.getNome());
			System.out.println(aluno.getDisciplinas());
			System.out.println("Resultado = " + aluno.getAlunoAprovado2() + " com média de = " + aluno.getMediaNota());
		}
	}

	}
}
