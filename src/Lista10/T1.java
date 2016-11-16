package Lista10;

public class T1 extends Thread{
	
	private Deposito dep;
	private int qtd,i = 0;

	public T1(Deposito dep, int qtd){
		this.dep = dep;
		this.qtd = qtd;	
	}
	
	public void run (){
		while(i<1000){
			dep.colocar();
			i++;
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
