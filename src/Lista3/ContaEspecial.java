package Lista3;


public class ContaEspecial extends Conta{
	
	private double limite;
	
	public ContaEspecial(int num, int tipoParam, String nomeParam, double saldo, double limite){
		super(num, tipoParam, nomeParam, saldo, limite);
		this.limite = super.getLimite();
		
	}

	
	public double getLimite(){
		return limite;
	}
	
	public void setLimite(double limite){
		this.limite = limite;
	}
	
	@Override
	public void sacar(double valor){
		if(valor + limite < super.getSaldo())
			super.sacar(valor);
		else{
			super.setSaldo(super.getSaldo() - valor);
			if(valor > super.getSaldo())
				limite = limite - (valor - super.getSaldo());//o limite diminui conforme vai usando ele
		}
	}
	
	@Override
	public void imprimirDados(){
		super.imprimirDados();
		//System.out.println("O limite da Conta Especial eh: "+limite);
	}
}
