package Lista4;

public class Quadrilatero extends FormaGeometrica{/**Acesse esse site para fazer a implementacao correta da classe
 													http://objetoseducacionais2.mec.gov.br/bitstream/handle/mec/10396/geo0402.htm */
//por motivo de forcas maiores esse programa somente calculara a area de quadrilateros contendo todos os lados iguais	
	private double lado2, lado3, lado4;
	
	public Quadrilatero(double l1, double l2, double l3, double l4){
		super(l1);
		this.lado2 = l2;
		this.lado3 = l3;
		this.lado4 = l4;
	}
	
	@Override
	public double calArea() {
		if(super.getLado() == this.lado2 && this.lado2 == this.lado3 && this.lado3 == this.lado4)
			return super.getLado()*super.getLado();//caso de todos os lados iguais
		else 
			return 0;
	}
	
	@Override
	public double calPerim() {
		return super.getLado()+this.lado2+this.lado3+this.lado4;
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

	public double getLado4() {
		return lado4;
	}

	public void setLado4(double lado4) {
		this.lado4 = lado4;
	}

}
