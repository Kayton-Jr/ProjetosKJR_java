package Lista4;

public abstract class PessoaIMC extends Pessoa{
	
	protected double peso, altura;
	

	public PessoaIMC(String nome, int idade, String cpf, double altura, String dtNasc, double peso) {
		super(nome, idade, cpf, dtNasc);
		this.peso = peso;
		this.altura = altura;
	}
	
	public abstract double calculaIMC();
	
	public abstract String resultIMC();

	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	@Override
	public String toString(){
		return "Dados da pessoa"
				+ "\nNome: "+super.getNome()
				+"\nCPF: "+super.getCpf()
				+"\nIdade: "+super.getIdade()
				+"\nData de nascimento: "+super.getDtNasc()
				+"\nPeso: "+getPeso()
				+"\nAltura: "+getAltura();
	}
}
