package lista12_DP;


public class ContaEspecial extends Conta{
	
	private double limite;
	private Log log;
	
	public ContaEspecial(int num, int tipoParam, String nomeParam, double saldo, double limite){
		super(num, tipoParam, nomeParam, saldo, limite);
		this.limite = super.getLimite();
		this.log = Log.getInstance();
		log.retornaLog("Conta especial criada");
	}

	
	public double getLimite(){
		log.retornaLog("Consulta de limite realizada");
		return limite;
	}
	
	public void setLimite(double limite){
		this.limite = limite;
	}
	
	@Override
	public void sacar(double valor){
		if(valor + limite < super.getSaldo()){
			super.sacar(valor);
			super.setSaldo(super.getSaldo() - valor);
		}
		else{			
			if(valor > super.getSaldo()){
				limite = limite - (valor - super.getSaldo());//o limite diminui conforme vai usando ele
				super.setSaldo(super.getSaldo() - valor);
				log.retornaLog("Saque realizado");
			}
		}
	}
	
	@Override
	public void imprimirDados(){
		super.imprimirDados();
		//System.out.println("O limite da Conta Especial eh: "+limite);
	}
}
