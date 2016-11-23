package Lista11;

public class TesteSinal {
	
	public static void main(String[] args) {
		
		Sinal sinal = new Sinal();
		
		Semaforo verde = new Semaforo(sinal,1);
		Semaforo amarelo = new Semaforo(sinal,2);
		Semaforo vermelho = new Semaforo(sinal,3);
		
		Thread tVerde = new Thread(verde);
		Thread tAmarelo = new Thread(amarelo);
		Thread tVermelho = new Thread(vermelho);
		
		tVerde.start();
		tAmarelo.start();
		tVermelho.start();
		
	}

}
