package Lista5_Revisao;


public class Empregado extends Pessoa{
	
	private int codigo;
	private String cargo;
	
	public Empregado() {
		super();
	}

	
	public int getCodigo(){
		return codigo;
	}

	
	public void setCodigo(int codigo){
		this.codigo = codigo;
	}

	
	public String getCargo(){
		return cargo;
	}

	
	public void setCargo(String cargo){
		this.cargo = cargo;
	}
	
	@Override
	public String toString() {
		return "Dados do Empregado"
				+ "\nNome: "+super.getNome()
				+ "\nCPF: "+super.getCpfCnpj()
				+ "\nData de Nascimento: "+super.getDataNascimento()
				+ "\nCargo: "+getCargo()
				+ "\nCodigo: "+getCodigo();
	}
}
