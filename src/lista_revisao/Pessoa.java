package lista_revisao;

public class Pessoa {
	
	private String nome, cpf, altura, classeEleitoral;
	private int idade;

	
	public Pessoa(String nome, int idade, String cpf, String altura){
		this.nome = nome;
		setIdade(idade);
		this.cpf = cpf;
		this.altura = altura;
		setClasseEleitoral();
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		if(idade < 0){
			System.out.println("Idade invalida, setado 0");
			this.idade = 0;
		}
		else
		this.idade = idade;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAltura() {
		return altura;
	}
	public void setAltura(String altura) {
		this.altura = altura;
	}
	public String getClasseEleitoral() {
		return classeEleitoral;
	}
	private void setClasseEleitoral() {
		if(idade<16)
			classeEleitoral = "Nao eleitor";
		else if(idade<18 || idade>65)
			classeEleitoral = "Eleitor facultativo";
		else //if(idade>=18 && idade <=65)
			classeEleitoral = "Eleitor obrigatorio";
	}
	void imprimirDados() {
		System.out.println("Nome: "+nome);
		System.out.println("Idade: "+idade);
		System.out.println("Altura: "+altura);
		System.out.println("CPF: "+cpf);
		System.out.println("Classe eleitoral: "+classeEleitoral);
	}
}
