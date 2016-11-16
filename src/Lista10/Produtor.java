package Lista10;

public class Produtor implements Runnable {
	
	private int qtd, i=0;
	private Deposito des;
	
	public Produtor(Deposito des, int qtd){
		this.des = des;
		this.qtd = qtd;
	}

	@Override
	public void run() {
		while(i<=qtd){
		des.colocar();
		}
	}
}
