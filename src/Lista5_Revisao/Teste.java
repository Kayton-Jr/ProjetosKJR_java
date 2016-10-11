package Lista5_Revisao;


public class Teste{
	
	public static void main(String[] args){
		
		//Setando uma empresa
		
		Empresa zas = new Empresa();
		zas.setNome("zas");
		zas.setDataNascimento(new Data(23,10,1996));
		zas.setCpfCnpj("000000001");
		
		//Setando  empregado
		Empregado ge = new Empregado();
		ge.setNome("Geovanna");
		ge.setCpfCnpj("9000000");
		ge.setCargo("Estagiario");
		ge.setDataNascimento(new Data(17,01,2000));
		ge.setCodigo(123);
		
		//cadastrando o empregado na empresa
		zas.adcionarEmpregado(ge);
		
		//Setando os clientes
		Cliente mar = new Cliente();
		mar.setTelefone(159753);
		mar.setNome("Marli");
		mar.setEmail("marli.email");
		mar.setDataNascimento(new Data(05,04,1960));
		mar.setCpfCnpj("testeCpfMarli");
		mar.setCodigo(456);
		
		ClienteMais k = new ClienteMais();
		k.setTipo("Diamante");
		k.setTelefone(83046729);
		k.setNome("Klayton");
		k.setEmail("klaytonjunior@hotmail.com");
		k.setDataNascimento(new Data(23,10,1996));
		k.setCpfCnpj("70434872180");
		k.setCodigo(654);
		
		//cadastrando 2 clientes na empresa
		zas.adcionarCliente(mar);
		zas.adcionarCliente(k);
		
		System.out.println(zas.toString());
		
		
		
	}
}
