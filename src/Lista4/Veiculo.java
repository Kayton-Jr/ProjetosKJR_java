package Lista4;

public abstract class Veiculo{
	
	private String modelo;
	private float velAtual;
	private double peso;
	private int velocMax;//Km/h
	private double preco;
	
	public Veiculo(String modelo, float velAtual, double peso, int velocMax, double preco){
		this.modelo = modelo;
		this.velAtual = velAtual;
		this.peso = peso;
		this.velocMax = velocMax;
		this.preco = preco;
		
	}
	
	public abstract float acelerar(float velocidade);
	
	public abstract void parar();

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public float getVelAtual() {
		return velAtual;
	}

	public void setVelAtual(float velAtual) {
		this.velAtual = velAtual;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getVelocMax() {
		return velocMax;
	}

	public void setVelocMax(int velocMax) {
		this.velocMax = velocMax;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	@Override
	public String toString(){
		return "Dados do veiculo\n"
				+"Modelo: "+getModelo()
				+"\nVelocidade max: "+getVelocMax()
				+"\nPeso: "+getPeso()
				+"\nPreco: "+getPreco();
	}

}
