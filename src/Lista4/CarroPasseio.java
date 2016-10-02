package Lista4;

public class CarroPasseio extends Veiculo{
	
	private String cor;
	
	public CarroPasseio(){
		super("", 0, 0, 0, 0);
		this.cor = "0";
	}
	
	public CarroPasseio(String modelo, float velAtual, double peso, int velocMax, double preco,
			String cor){
		super(modelo, velAtual, peso, velocMax, preco);
		this.cor = cor;
	}
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	@Override
	public float acelerar(float velocidade) {
		super.setVelAtual(super.getVelAtual()+velocidade);
		return super.getVelAtual();
	}

	@Override
	public void parar() {
		super.setVelAtual(0);
	}
	

	public String toString(Motor motor) {
		return "Dados do Carro de Passeio"
				+ "\nModelo: "+super.getModelo()
				+"\nVelocidade max: "+super.getVelocMax()
				+"\nPeso: "+super.getPeso()
				+"\nPreco: "+super.getPreco()
				+"\nCor: "+getCor()
				+"\nNumero de cilindros do motor"+motor.getNumCililindro()
				+"\nPotencia do motor"+motor.getPotencia();
	}


}
