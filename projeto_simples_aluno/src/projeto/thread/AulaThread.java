package projeto.thread;

import javax.swing.JOptionPane;

public class AulaThread {

	public static void main(String[] args) throws InterruptedException {
		
		/*Thread processando em paralelo do envio de email*/
		Thread threadEmail = new Thread(thread1);
		threadEmail.start();
		
		/*Thread processando em paralelo do envio de nota Fiscal*/
		Thread threadNFCE = new Thread(thread2);
		threadNFCE.start();
		
		
		/*Código do sistema do usuário continua o fluxo de trabalho*/
		System.out.println("CHEGOU AO FIM DO CÓDIGO DE TESTE DE THREAD");
		/*Supondo fluxo do sistema, exemplo: cadastro de vendas, uma emissão de nota fiscal, algo do tipo*/
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuário");
	}
	
	private static Runnable thread2 = new Runnable() {
		
		@Override
		public void run() {
			
			/*Código da rotina*/
			
			/*Código da rotina que eu quero executar em processamento paralelo*/
			for(int pos = 0; pos < 10; pos++) {
				
				/*Quero executar esse envio com um tempo de parada, ou com um tempo determinado*/
				System.out.println("Executando alguma rotina, por exemplo envio de nota fiscal");
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}/*Dá um tempo*/
				
			}
			/*Fim do codigo em paralelo*/
			
		}
	};
	
	private static Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
			
			/*Código da rotina*/
			
			/*Código da rotina que eu quero executar em processamento paralelo*/
			for(int pos = 0; pos < 10; pos++) {
				
				/*Quero executar esse envio com um tempo de parada, ou com um tempo determinado*/
				System.out.println("Executando alguma rotina, por exemplo envio de e-mail");
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}/*Dá um tempo*/
				
			}
			/*Fim do codigo em paralelo*/
			
		}
	};
	
}
