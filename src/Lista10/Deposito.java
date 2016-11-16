package Lista10;

public class Deposito {

	private int items=0;
	
	public int getItems() {
		return items;
	}

	private final int capacidade=10;
	
	public int retirar() {
		if (items>0) {
			items--;
			System.out.println("Caixa retirada: existem "+items+" caixas");
			return 1;
		}
		return 0;
	}
	
		public int colocar () {
			if (items<capacidade) {
				items++;
				System.out.println("Caixa armazenada: existem "+items+" caixas");
				return 1;
			}
			return 0;
		}
}