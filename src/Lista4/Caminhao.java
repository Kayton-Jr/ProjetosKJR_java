package Lista4;

public class Caminhao extends Veiculo{
	
	private float cargaMax;//toneladas
	private int alturaMax;
	private int comprimento;
	
	public Caminhao(){
		super("", 0, 0, 0, 0);
		this.cargaMax = 0;
		this.alturaMax = 0;
		this.comprimento = 0;
	}
	
	public Caminhao(String modelo, float velAtual, double peso, int velocMax, double preco, 
			float cargaM, int altM, int comp){
		super(modelo, velAtual, peso, velocMax, preco);
		this.cargaMax = cargaM;
		this.alturaMax = altM;
		this.comprimento = comp;
	}

	public float getCargaMax() {
		return cargaMax;
	}

	public void setCargaMax(float cargaMax) {
		this.cargaMax = cargaMax;
	}

	public int getAlturaMax() {
		return alturaMax;
	}

	public void setAlturaMax(int alturaMax) {
		this.alturaMax = alturaMax;
	}

	public int getComprimento() {
		return comprimento;
	}

	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
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
	
	public String toString(Motor motor){
		return "Dados do Caminhao"
				+ "\nModelo: "+super.getModelo()
				+"\nVelocidade max: "+super.getVelocMax()
				+"\nPeso: "+super.getPeso()
				+"\nPreco: "+super.getPreco()
				+"\nCarga max: "+getCargaMax()
				+"\nAltura max: "+getAlturaMax()
				+"\nComprimento: "+getComprimento()
				+"\nNumero de cilindros do motor"+motor.getNumCililindro()
				+"\nPotencia do motor"+motor.getPotencia();
	}

	
}
