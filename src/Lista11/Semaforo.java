package Lista11;

public class Semaforo implements Runnable{

	private Sinal sinal;
	private int id;
	
	public Semaforo(Sinal sinal, int id){
		this.sinal = sinal;
		this.id = id;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		if(id==1)
			sinal.acendeVerde();
		else if(id==2)
			sinal.acendeAmarelo();
		else if(id==3)
			sinal.acendeVermelho();
	}
	

}
