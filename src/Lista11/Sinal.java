package Lista11;

public class Sinal {

	private final String verde="verde";//duracao: 30s
	private final String amarelo="amarelo";//duracao: 5s
	private final String vermelho="vermelho";//duracao: 45s
	boolean fVerde=true, fAmarelo=false, fVermelho=false;//startar no vermelho
	private int cont=0;
	
	public synchronized void acendeVerde(){
		while(true){
			if(fVerde){
				System.out.println(verde+cont);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				cont++;
				if(cont==30){
					cont=0;
					fVerde=false;
					fAmarelo=true;
					notifyAll();
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}
	
	public synchronized void acendeAmarelo(){
		while(true){
			if(fAmarelo){
				for(cont=0; cont<5; cont++){
					System.out.println(amarelo+cont);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if(cont==5){
						fAmarelo=false;
						fVermelho=true;
						notifyAll();
					}
				}
			}
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public synchronized void acendeVermelho(){
		while(true){
			if(fVermelho){
				for(cont=0; cont<45; cont++){
					System.out.println(vermelho+cont);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if(cont==45){
						fVermelho=false;
						fVerde=true;
						notifyAll();
					}
				}
			}
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
