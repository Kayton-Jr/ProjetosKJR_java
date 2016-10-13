package Lista5_Revisao;

public class Venda{
	
	private String[] nomeP;
	private int[] qtd;
	private float[] valor;
	private Empresa empresa;
	private Empregado funcionario;
	private Cliente cliente;
	private ClienteMais clienteM;
	
	public Venda() {
		
	}
	
	public String[] getNomeP(){
		return nomeP;
	}
	
	public void setNomeP(String[] nomeP){
		this.nomeP = nomeP;
	}
	
	public int[] getQtd(){
		return qtd;
	}
	
	public void setQtd(int[] qtd){
		this.qtd = qtd;
	}
	
	public float[] getValor(){
		return valor;
	}
	
	public void setValor(float[] valor){
		this.valor = valor;
	}
	
	public Empresa getEmpresa(){
		return empresa;
	}
	
	public void setEmpresa(Empresa empresa){
		this.empresa = empresa;
	}
	
	public Empregado getFuncionario(){
		return funcionario;
	}
	
	public void setFuncionario(Empregado funcionario){
		
		boolean achou = false;
		for(int i = 0; i<= empresa.getQtdEmpregados(); i++){
			if(funcionario.getCodigo() == empresa.getEmpregadosCod(i)){
				this.funcionario = funcionario;
				achou = true;
				break;
			}
		}
		if(!achou){
			System.out.println("Funcionario invalido!\n Setando funcionario padrao");
			this.funcionario = new Empregado();
			funcionario.setCargo("Padrao");
			funcionario.setCodigo(0000);
			funcionario.setCpfCnpj("0000000");
			funcionario.setNome("Padrao");
			funcionario.setDataNascimento(new Data(0,0,0000));
		}
	}

	
	public Object getCliente(){
		
		if(cliente instanceof ClienteMais)
			return (ClienteMais) this.clienteM;
		else 
			return (Cliente) this.cliente;
	}

	
	public void setCliente(Object cliente){
		
		if(cliente instanceof ClienteMais)
			this.clienteM = (ClienteMais) cliente;
		else 
			this.cliente = (Cliente) cliente;
	}
	
	public void carrinho(String[] nomeP, int[] qtd, float[] valor) {
		//Produto 1 ---- nomeP[0]="coisa1", qtd[0]=2, valor[0]=qtd[0]1.5
		this.nomeP = nomeP;
		this.qtd = qtd;
		this.valor = valor;
	}
	
	public double compra() {
		double valorT=0;
		
		for(int i = 0; i<=qtd.length; i++){
			valorT = valor[i]*qtd[i];
		}
		
		if(getCliente() instanceof ClienteMais){
			if(this.clienteM.getTipo().equals("Ouro"))
				valorT = valorT*0.9;
			else
				valorT = valorT*0.8;
		}
		
		return valorT;
	}
	
}
