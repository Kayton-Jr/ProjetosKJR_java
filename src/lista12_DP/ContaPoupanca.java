package lista12_DP;

public class ContaPoupanca extends Conta{
	
	private int diaRend;
	private double txRend;//valor em decimal
	private Log log;
	
	
	public ContaPoupanca(int num, int tipoParam,	String nomeParam, double saldo, double limite, double txRend, int diaRend){
		super(num, tipoParam, nomeParam, saldo, limite);
		this.txRend = txRend;
		this.diaRend = diaRend;
		this.log = Log.getInstance();
		log.retornaLog("Conta poupanca criada");
	}
	
	public void calcularNovoSaldo(){
		super.setSaldo(super.getSaldo() + super.getSaldo()*txRend);
	}
	
	public void setDiaRend(int dia){
		this.diaRend = dia;		
	}
	
	@Override
	public void imprimirDados(){
		super.imprimirDados();
		System.out.println("O dia de rendimento eh: "+diaRend);
		System.out.println("A taxa de rendimento eh: "+txRend);
	}

}
