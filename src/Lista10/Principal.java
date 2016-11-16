package Lista10;

public class Principal{

	public static void main(String[] args) {
		Deposito dep = new Deposito();
		Produtor p = new Produtor(dep, 2);
		Consumidor c = new Consumidor(dep, 1);
		//iniciar thread 1 que irá colocar itens
		//Thread coloca = new Thread(p);
		//coloca.start();
		//iniciar thread 2 que irá retirar itens
		//Thread retira = new Thread(c);
		//retira.start();
		
		T1 t1 = new T1(dep,1);
		t1.start();
		T2 t2 = new T2(dep,2);
		Thread t2t = new Thread(t2);
		t2t.start();
		
		
		
		System.out.println("Fim da execucao de Principal::main()");
	}
}