package Lista4;

public class Homem extends PessoaIMC{

	public Homem(String nome, int idade, String cpf, double altura, String dtNasc, double peso) {
		super(nome, idade, cpf, altura, dtNasc, peso);
	}

	@Override
	public double calculaIMC() {//peso em kg e altura em m
		return super.peso/(Math.pow(super.altura, 2));
	}

	@Override
	public String resultIMC() {
		if(calculaIMC() <= 20.7)
			return "Abaixo do peso ideal";
		else if(calculaIMC() <= 26.4 && calculaIMC() > 20.7)
			return "Peso ideal";
		else 
			return "Acima do peso ideal";
	}
}
