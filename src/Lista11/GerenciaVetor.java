package Lista11;

public class GerenciaVetor {
	
	private int vetor[] = {0,0,0,0,0,0,0,0,0,0};
	private int comp[] = {0,0,0,0,0,0,0,0,0,0};
	private int i;
	private boolean fadd=true, frem=false;
	
	public synchronized void adcionar(int x) {
		if(fadd){
			for(i=0; i<10;i++){
				if(vetor[i]==0){
					vetor[i]=x;
					frem=true;
					break;
				}
			}
			int a=0;
			System.out.println("Numeros dentro do vetor apos add");
			while(a<10){
				System.out.println(vetor[a]);
				a++;
			}
			System.out.println("-----------------");
		}
		if(i==10){
			fadd=true;
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		notifyAll();
	}
	
	public synchronized void remover(int x) {
		if(frem){
			for(i=0; i<10; i++){
				if(vetor[i]==x){
					vetor[i]=0;
					fadd=true;
					break;
				}
			}
			int a=0;
			System.out.println("Numeros dentro do vetor apos rem");
			while(a<10){
				System.out.println(vetor[a]);
				a++;
			}
			System.out.println("-----------------");
		}
		if(vetor==comp){
			frem=false;
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		notifyAll();
	}
}
