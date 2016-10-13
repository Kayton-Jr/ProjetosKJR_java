package Lista5_Revisao;

import java.util.ArrayList;


public class Empresa extends Pessoa{
	
	private ArrayList<Cliente> clientes =  new ArrayList<Cliente>();
	private ArrayList<Empregado> empregados = new ArrayList<Empregado>();
	
	public Empresa() {
		super();
	}
	
	
	public String getClientes(){
		return clientes.toString();
	}

	
	public void adcionarCliente(Cliente cliente){
		this.clientes.add(cliente);
	}

	
	public String getEmpregados(){
		return empregados.toString();
	}
	
	public int getEmpregadosCod(int i) {
		return empregados.get(i).getCodigo();
	}
	
	public int getQtdEmpregados() {
		return empregados.size();
	}

	
	public void adcionarEmpregado(Empregado empregados){
		this.empregados.add(empregados);
	}
	
	
	@Override
	public String toString() {
		return "Dados da Empresa"
				+ "\nNome: "+super.getNome()
				+ "\nCNPJ: "+super.getCpfCnpj()
				+ "\nData de Abertura: "+super.getDataNascimento()
				+ "\nEmpregados: \n"+getEmpregados()
				+ "\nClientes: "+getClientes();
	}
}
