package Lista5_Revisao;


public class ClienteMais extends Cliente{
	
	private float taxaDesc;
	private String tipo;
	
	public ClienteMais() {
		super();
	}

	
	public float getTaxaDesc(){
		return taxaDesc;
	}
	
	
	public String getTipo(){
		return tipo;
	}

	
	public void setTipo(String tipo){
		if(tipo.equals("Ouro") || tipo.equals("Diamante")){
			this.tipo = tipo;
			this.taxaDesc = (float) 0.1;
		}
		else{
			System.out.println("Tipo invalido! \n Setando para ouro");
			this.tipo = "Ouro";
			this.taxaDesc = (float) 0.2;
		}
	}
	
	@Override
	public String toString() {
		return "Dados do Cliente Mais"
				+ "\nNome: "+super.getNome()
				+ "\nCPF: "+super.getCpfCnpj()
				+ "\nTipo: "+getTipo()
				+ "\nData de Nascimento: "+super.getDataNascimento()
				+ "\nTelefone: "+getTelefone()
				+ "\nCodigo: "+getCodigo();
	}
}
