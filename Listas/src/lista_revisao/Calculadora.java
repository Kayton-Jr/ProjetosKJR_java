package lista_revisao;

public class Calculadora {
	
	private double x,y,z;
			
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = (double)x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public double soma(){
		return this.z = this.x + this.y;
	}
	
	public double subtracao(){
		return this.z = this.x - this.y;
	}
	
	public double multiplicacao(){
		return this.z = this.x * this.y;
	}
	
	public double divisao(){
		return this.z = (double)this.x/this.y;
	}
	
	public void imprimiResult(){
		System.out.println("O resultado da operacao eh: "+this.z);
	}

}
