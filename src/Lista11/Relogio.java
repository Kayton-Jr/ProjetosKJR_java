package Lista11;

public class Relogio implements Runnable{
	
	private Tempo t;
	private int id;
	
	public Relogio(Tempo t, int id){
		this.id=id;
		this.t=t;		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		if(id==0)
			t.contSeg();
		else if(id==1)
			t.contMin();
		else if(id==2)
			t.contHora();
	}

}
