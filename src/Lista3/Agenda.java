package Lista3;

public class Agenda {
	
	private String[] nomes;
	private String[] cpfs;
	
	private Pessoa[] pessoas;
	private int i = 0, totalPessoas;
	
	public Agenda() {
		totalPessoas = 250;
		pessoas = new Pessoa[totalPessoas];
	}
	public Agenda(int qtd) {
		totalPessoas = qtd;
		pessoas = new Pessoa[totalPessoas];
	}
	public void armazenarPessoa(Pessoa pessoa) {
		if(i < totalPessoas){
			pessoas[i] = pessoa;
			i++;
		}else
			System.out.println("Espaço insuficiente!!"); 		
	}
	public void removerPessoa(Pessoa pessoa) {
		 int posRem = buscarPessoa(pessoa);
		 
		 if(posRem != -1){
			 pessoas[posRem] = new Pessoa("", "", "", "");
		 }
		 else
			 System.out.println("Pesso não encontrada");
	}
	public int buscarPessoa(Pessoa pessoa) { 
		String cpfArm;
		
		for(int a = 0; a < i; a++){
			cpfArm=pessoas[a].getCpf();
			
			if(cpfArm.equals(pessoa.getCpf())){
				return a;
			}
		}
		return -1;
	}
	public Pessoa buscarPessoa(String cpf){
		String cpfArm;
		
		for(int a = 0; a < i; a++){
			cpfArm=pessoas[a].getCpf();
			
			if(cpfArm.equals(cpf)){
				return pessoas[a];
			}
		}
		return null;
	}
	public void imprimirPessoa(String cpf) {
		Pessoa a = buscarPessoa(cpf);
		
		a.imprimirDados();
	}
	public void imprimirAgenda() {
		
		for(int a=0; a<i; a++){
			if(!pessoas[a].getNome().equals("")){
				pessoas[a].imprimirDados();
				System.out.println("************");
			}
		}
	}
}	