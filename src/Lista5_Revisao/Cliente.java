package Lista5_Revisao;


public class Cliente extends Pessoa{
	
	private int codigo, telefone;
	private String email;
	
	public Cliente() {
		super();
	}

	
	public int getCodigo(){
		return codigo;
	}

	
	public void setCodigo(int codigo){
		this.codigo = codigo;
	}

	
	public int getTelefone(){
		return telefone;
	}

	
	public void setTelefone(int telefone){
		this.telefone = telefone;
	}

	
	public String getEmail(){
		return email;
	}

	
	public void setEmail(String email){
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Dados do Cliente"
				+ "\nNome: "+super.getNome()
				+ "\nCPF: "+super.getCpfCnpj()
				+ "\nData de Nascimento: "+super.getDataNascimento()
				+ "\nTelefone: "+getTelefone()
				+ "\nCodigo: "+getCodigo();
	}
}
