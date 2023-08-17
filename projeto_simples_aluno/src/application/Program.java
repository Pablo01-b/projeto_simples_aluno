package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import projeto.classes.Aluno;
import projeto.classes.Diretor;
import projeto.classes.Disciplina;
import projeto.classesauxiliares.FuncaoAutenticacao;
import projeto.constantes.StatusAluno;
import projeto.excecao.ExcecaoProcessarNota;

public class Program {

	public static void main(String[] args) {
		
		
		try {
			lerArquivo();
		
		String login = JOptionPane.showInputDialog("Informe o login:");
		String senha = JOptionPane.showInputDialog("Informe a senha:");
		
		
		if(new FuncaoAutenticacao(new Diretor(login, senha)).autenticar()) {/*Vou travar o contrato para autorizar somente quem realmente tem o contrato 100% legitmo*/
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		/*é uma lista que dentro dela temos uma chave que identifica uma sequencia de valores também*/
		HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();
		
		
		for(int qtd = 1; qtd <= 1; qtd++) {
			
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + " ?");
		String idade = JOptionPane.showInputDialog("Idade");
		
		/*String dataNascimento = JOptionPane.showInputDialog("Data de nascimento");
		String rg = JOptionPane.showInputDialog("Qual é o RG?");
		String cpf = JOptionPane.showInputDialog("Qual é o CPF?");
		String mae = JOptionPane.showInputDialog("Nome da Mãe");
		String pai = JOptionPane.showInputDialog("Nome do Pai");
		String matricula = JOptionPane.showInputDialog("Data de matricula");
		String serie = JOptionPane.showInputDialog("Qual a serie matriculado?");
		String escola = JOptionPane.showInputDialog("Nome da escola");*/

		Aluno aluno1 = new Aluno();

		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		
		/*aluno1.setDataNascimento(dataNascimento);
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
			System.out.println("Idade: " + aluno.getIdade());
			/*System.out.println("Data de nascimento: " + aluno.getDataNascimento());
			System.out.println("RG: " + aluno.getRegistroGeral());
			System.out.println("CPF: " + aluno.getNumeroCpf());
			System.out.println("Nome da mãe: " + aluno.getNomeMae());
			System.out.println("Nome do pai: " + aluno.getNomePai());
			System.out.println("Data de matrícula: " + aluno.getDataMatricula());
			System.out.println("Serie matriculado: " + aluno.getSerieMatriculado());
			System.out.println("Nome da escola: " + aluno.getNomeEscola());*/
			System.out.println(aluno.getDisciplinas());
			System.out.println("Resultado = " + aluno.getAlunoAprovado2() + " com média de = " + aluno.getMediaNota());
		}
		
		System.out.println("--------------------Lista de Recuperação--------------------");
		for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
			System.out.println("Nome do Aluno(a): " + aluno.getNome());
			System.out.println("Idade: " + aluno.getIdade());
			/*System.out.println("Data de nascimento: " + aluno.getDataNascimento());
			System.out.println("RG: " + aluno.getRegistroGeral());
			System.out.println("CPF: " + aluno.getNumeroCpf());
			System.out.println("Nome da mãe: " + aluno.getNomeMae());
			System.out.println("Nome do pai: " + aluno.getNomePai());
			System.out.println("Data de matrícula: " + aluno.getDataMatricula());
			System.out.println("Serie matriculado: " + aluno.getSerieMatriculado());
			System.out.println("Nome da escola: " + aluno.getNomeEscola());*/
			System.out.println(aluno.getDisciplinas());
			System.out.println("Resultado = " + aluno.getAlunoAprovado2() + " com média de = " + aluno.getMediaNota());
		}
		
		System.out.println("--------------------Lista de Reprovados--------------------");
		for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
			System.out.println("Nome do Aluno(a): " + aluno.getNome());
			System.out.println("Idade: " + aluno.getIdade());
			/*System.out.println("Data de nascimento: " + aluno.getDataNascimento());
			System.out.println("RG: " + aluno.getRegistroGeral());
			System.out.println("CPF: " + aluno.getNumeroCpf());
			System.out.println("Nome da mãe: " + aluno.getNomeMae());
			System.out.println("Nome do pai: " + aluno.getNomePai());
			System.out.println("Data de matrícula: " + aluno.getDataMatricula());
			System.out.println("Serie matriculado: " + aluno.getSerieMatriculado());
			System.out.println("Nome da escola: " + aluno.getNomeEscola());*/
			System.out.println(aluno.getDisciplinas());
			System.out.println("Resultado = " + aluno.getAlunoAprovado2() + " com média de = " + aluno.getMediaNota());
		}
	}else {
		JOptionPane.showMessageDialog(null, "Acesso não permitido");
	}

		//aqui
		}catch (NumberFormatException e) {
			
			StringBuilder saida = new StringBuilder();
			
			/*Imprime erro no console Java*/
			e.printStackTrace(); 
		
			System.out.println(" Mensagem: " + e.getMessage());
			
			for(int i = 0; i <= e.getStackTrace().length; i++) {
				
				saida.append("\n Classe de erro " + e.getStackTrace()[i].getClassName());
				saida.append("\n Método de erro " + e.getStackTrace()[i].getMethodName());
				saida.append("\n Linha de erro " + e.getStackTrace()[i].getLineNumber());
				saida.append("\n Linha de erro " + e.getStackTrace()[i].getClass().getName());
			}
			
			JOptionPane.showMessageDialog(null, "Erro de conversão de numero " + saida.toString());
			
		}catch (NullPointerException e) {
			JOptionPane.showMessageDialog(null, "Opaa um null pointer exeption: " + e.getClass());
		
		}catch (ExcecaoProcessarNota e)/*Captura todas as exceções que não prevemos*/ {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Erro da exceção customizada: " + e.getClass().getName());
		}finally {/*Sempre é executado ocorrendo erros ou não*/
			/*Finally sempre é usado quando precisa executar um processo acontecendo erro ou não*/
			JOptionPane.showMessageDialog(null, "Obrigado por aprender Java comigo");
		}
	}
	
	public static void lerArquivo() throws ExcecaoProcessarNota{
		try {
		File fil = new File("c//lines.txt");
		Scanner sc = new Scanner(fil);
		}catch (FileNotFoundException e) {
			throw new ExcecaoProcessarNota(e.getMessage());
		}
	}
}




