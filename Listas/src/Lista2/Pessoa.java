package Lista2;

public class Pessoa {
	
	//private int idade, cpf;
	private String nome, idade, cpf, altura;
	//private float altura;
	
	public Pessoa(String nome, String idade, String cpf, String altura){
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.altura = altura;
	}
	
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
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
	void imprimirDados() {
		System.out.println("Nome: "+nome);
		System.out.println("Idade: "+idade);
		System.out.println("Altura: "+altura);
		System.out.println("CPF: "+cpf);
	}
}
