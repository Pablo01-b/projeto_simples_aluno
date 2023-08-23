package application;

public class ArrayVetor {

	public static void main(String[] args) {
		
		/*Array pode ser de todos os tipos de dados e objetos também*/
		
		/*Array sempre deve ter a quantidade de posições definidas*/
		double[] notas = new double[4];
		
		/*Atribuir valor nas posições do array*/
		notas[0] = 9.8;
		notas[1] = 5.5;
		notas[2] = 7.7;
		notas[3] = 9.5;
		
		for(int pos = 0; pos < 4; pos++) {
			System.out.println("Nota " + (pos + 1) + " é = " + notas[pos]);
		}
	}
	
}
