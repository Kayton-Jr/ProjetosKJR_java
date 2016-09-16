package Lista3;

public class ContaPoupan�a extends Conta{
	
	private int diaRend;
	private double txRend;//valor em decimal
	
	
	public ContaPoupan�a(int num, int tipoParam,	String nomeParam, double saldo, double limite, double txRend, int diaRend){
		super(num, tipoParam, nomeParam, saldo, limite);
		this.txRend = txRend;
		this.diaRend = diaRend;
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
