package Lista4;

public abstract class FormaGeometrica {
	
	private double lado;
	final double pi = 3.14;
	
	public FormaGeometrica(double l1){
		setLado(l1);
	}
	
	public abstract double calArea();
	
	public abstract double calPerim();
	
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	public double getPi() {
		return pi;
	}
	

}
