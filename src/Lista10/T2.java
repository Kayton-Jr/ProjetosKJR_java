package Lista10;

public class T2 implements Runnable{
	
	private int qtd, i=0;
	private Deposito des;
	
	public T2(Deposito des, int qtd){
		this.des = des;
		this.qtd = qtd;
	}

	@Override
	public void run() {
		while(i<=1000){
			des.retirar();
			i++;
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
