package application;


public class ArrayVetor {

	public static void main(String[] args) {
		
						   
		String[] valores = new String[4];
		
		valores[0] = "Pablo";
		valores[1] = "90";
		valores[2] = "Curso de Java";
		valores[3] = "contato@gmail.com.br";
		
		for(int pos = 0; pos < valores.length; pos++) {
			System.out.println("Valor na posição " + pos + " é igual a: " + valores[pos]);
		}
	}
	
}
