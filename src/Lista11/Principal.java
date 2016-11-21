package Lista11;

public class Principal{

	public static void main(String[] args) {
		Deposito dep = new Deposito();
		Produtor p = new Produtor(dep, 2);
		Consumidor c = new Consumidor(dep, 1);
		//iniciar thread 1 que irá colocar itens
		Thread coloca = new Thread(p);
		coloca.start();
		//iniciar thread 2 que irá retirar itens
		Thread retira = new Thread(c);
		retira.start();
		
		
		
		
		
		System.out.println("Fim da execucao de Principal::main()");
	}
}