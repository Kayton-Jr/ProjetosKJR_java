package Lista5_Revisao;


public class Pessoa{
	
	private String nome, cpf;
	private Data dataNascimento;
	
	public Pessoa() {
		
	}
	
	
	public String getNome(){
		return nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getCpfCnpj(){
		return cpf;
	}
	
	public void setCpfCnpj(String cpf){
		this.cpf = cpf;
	}
	
	public String getDataNascimento(){
		return dataNascimento.getData();
	}
	
	public void setDataNascimento(Data dataNascimento){
		this.dataNascimento = dataNascimento;
	}
}
