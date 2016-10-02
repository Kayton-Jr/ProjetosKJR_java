package Lista4;

public class Mulher extends PessoaIMC{

	public Mulher(String nome, int idade, String cpf, double altura, String dtNasc, double peso) {
		super(nome, idade, cpf, altura, dtNasc, peso);
	}

	@Override
	public double calculaIMC() {//peso em kg e altura em m
		return super.peso/(Math.pow(super.altura, 2));
	}

	@Override
	public String resultIMC() {
		if(calculaIMC() <= 19)
			return "Abaixo do peso ideal";
		else if(calculaIMC() <= 19 && calculaIMC() > 25.8)
			return "Peso ideal";
		else 
			return "Acima do peso ideal";
	}
}