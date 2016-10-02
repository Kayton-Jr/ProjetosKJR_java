package Lista4;

public class Pessoa {
	
	private String nome, cpf;
	private int idade;
	private String dtNasc;
	
	public Pessoa(String nome, int idade, String cpf, String dtNasc){
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		setDtNasc(dtNasc);
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getDtNasc() {
		return dtNasc;
	}
	public void setDtNasc(String dtNasc) {
		dtNasc.trim();
		if(dtNasc.substring(2,3).equals("/") &&
				dtNasc.substring(4,5).equals("/"))
			this.dtNasc = dtNasc;
		else
			this.dtNasc = dtNasc.substring(1,2)+"/"+dtNasc.substring(3,4)+"/"+dtNasc.substring(4);
	}

	@Override
	public String toString(){
		return "Dados da Pessoa"
				+ "\nNome: "+getNome()
				+"\nCPF: "+getCpf()
				+"\nIdade: "+getIdade();
	}

}
