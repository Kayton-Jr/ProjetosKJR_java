package Lista4;

public class Motor {
	
	private int numClilindro;
	private int potencia;
	
	public Motor(){
		this.numClilindro = 0;
		this.potencia = 0;
	}
	
	public Motor(int numC, int pot){
		this.numClilindro = numC;
		this.potencia = pot;		
	}

	public int getNumCililindro() {
		return numClilindro;
	}

	public void setNumCililindro(int numClilindro) {
		this.numClilindro = numClilindro;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	

}
