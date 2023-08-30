package projeto.thread;

public class AulaThread {

	public static void main(String[] args) throws InterruptedException {
		
		for(int pos = 0; pos < 10; pos++) {
			
			/*Quero executar esse envio com um tempo de parada, ou com um tempo determinado*/
			System.out.println("Executando alguma rotina, por exemplo envio de e-mail");
			
			Thread.sleep(1000);/*Dá um tempo*/
		}
		
		System.out.println("CHEGOU AO FIM DO CÓDIGO DE TESTE DE THREAD");
	}
}
