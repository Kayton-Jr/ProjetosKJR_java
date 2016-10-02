package Lista4;

public abstract class Automovel extends Veiculo{
	
	public Automovel(String modelo, float velAtual, double peso, int velocMax, double preco){
		super(modelo, velAtual, peso, velocMax, preco);
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
	
	@Override
	public String toString(){
		return "Dados do Automovel \n"
				+ "Modelo: "+super.getModelo()
		+"\nVelocidade max: "+super.getVelocMax()
		+"\nPeso: "+super.getPeso()
		+"\nPreco: "+super.getPreco();
	}

}
