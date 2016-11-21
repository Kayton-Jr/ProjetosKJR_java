package Lista11;

public class AcessaVetor implements Runnable{
	
	private int id;
	private int x;
	private GerenciaVetor vet;
	
	public AcessaVetor(GerenciaVetor vet, int id, int x){
		this.vet = vet;
		this.id=id;
		this.x=x;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		if(id==1){
			vet.adcionar(x);
		}
		else if(id==2){
			vet.remover(x);
		}
	}

}
