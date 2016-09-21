package Lista4;

public class Triangulo extends FormaGeometrica{
	
	private double lado2, lado3;
	
	public Triangulo(double l1, double l2, double l3){
		super(l1);
		this.lado2 = l2;
		this.lado3 = l3;		
	}

	@Override
	public double calArea() {
		double area = Math.sqrt(calPerim() * (calPerim()/2-super.getLado()) * (calPerim()/2-this.lado2)
				* (calPerim()/2-this.lado3));
		return area;
	}

	@Override
	public double calPerim() {
		double perim = (this.lado2+this.lado3+super.getLado());
		return perim;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	public double getLado3() {
		return lado3;
	}

	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}
	
	

}
