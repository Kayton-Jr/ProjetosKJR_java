package Lista4;

public class Circulo extends FormaGeometrica{
	
	public Circulo(double raio) {
		super(raio);
	}

	@Override
	public double calArea() {
		return 0;
	}

	@Override
	public double calPerim() {// msm coisa q a circunferencia
		return 2*super.getPi()*super.getLado();
	}

}
