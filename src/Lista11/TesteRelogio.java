package Lista11;

public class TesteRelogio {
	
	public static void main(String[] args) {
		
		Tempo t = new Tempo();
		Relogio seg = new Relogio(t,0);
		Relogio min = new Relogio(t,1);
		Relogio hora = new Relogio(t,2);
		
		Thread tseg = new Thread(seg);
		Thread tmin = new Thread(min);
		Thread thora = new Thread(hora);
		
		tseg.start();
		tmin.start();
		thora.start();
		
	}

}
