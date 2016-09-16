package Lista3;


public class Gerente extends Funcionario{
	
	private int senha;
	private int qtdFuncGerenciados;
	
	public Gerente(int senha, int qtd, String nome, String dpto, String data,
			double sal, int rg){
		super();
		super.setNome(nome);
		super.setDepto(dpto);
		super.setData(data);
		super.setSal(sal);
		super.setRg(rg);
		this.senha = senha;
		this.qtdFuncGerenciados = qtd;
		
	}

	public int getSenha(){
		return senha;
	}

	
	public void setSenha(int senha){
		this.senha = senha;
	}

	
	public int getQtdFuncGerenciados(){
		return qtdFuncGerenciados;
	}

	
	public void setQtdFuncGerenciados(int qtdFuncGerenciados){
		this.qtdFuncGerenciados = qtdFuncGerenciados;
	}
	
	public void imprimir(){
		super.imprimirFuncionario();
		System.out.println("");
	}
}
