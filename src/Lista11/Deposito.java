package Lista11;

public class Deposito {

	private int items=0;
	
	public int getItems() {
		return items;
	}

	private final int capacidade=10;
	
	public synchronized int retirar() {
		if (items>0) {
			items--;
			System.out.println("Caixa retirada: existem "+items+" caixas");
			notify();
			return 1;
		}
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	
	public synchronized int colocar () {
		if (items<capacidade) {
			items++;
			System.out.println("Caixa armazenada: existem "+items+" caixas");
			notify();
			return 1;
		}
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
}