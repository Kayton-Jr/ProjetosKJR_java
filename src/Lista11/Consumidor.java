package Lista11;

public class Consumidor implements Runnable{
	
	private int qtd, i=0;
	private Deposito des;
	
	public Consumidor(Deposito des, int qtd){
		this.des = des;
		this.qtd = qtd;
	}

	@Override
	public void run() {
		while(i<qtd){
			i++;
			des.retirar();
		}
	}
}