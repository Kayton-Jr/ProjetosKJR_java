package lista12_DP;



public class TesteConta{
	
	public static void main(String[] args){
		
		Conta conta = new Conta(12, 1, "Klayton", 1500.00, 1200.00);
		ContaPoupanca contaPoup = new ContaPoupanca(123, 2, "KlaytonP", 1400.00, 0, 0.05, 25);
		ContaEspecial contaEsp = new ContaEspecial(1234, 3, "KlaytonE", 800.00, 600);
		
		System.out.println("***** Valor do saldo inicial *****");
		conta.imprimirDados();
		conta.sacar(300);
		System.out.println("***** Valor do saldo apos sacar *****");
		conta.imprimirDados();
		
		conta.depositar(500);
		System.out.println("***** Valor do saldo apos depositar *****");
		conta.imprimirDados();
		
		System.out.println("***** Valor inicial do saldo da conta poupanca *****");
		contaPoup.imprimirDados();
		
		contaPoup.calcularNovoSaldo();
		System.out.println("***** Valor do saldo da conta poupanca apos o rendimento *****");
		contaPoup.imprimirDados();
		
		System.out.println("***** Dados conta normal *****");
		conta.imprimirDados();
		
		System.out.println("***** Dados conta poupanca *****");
		contaPoup.imprimirDados();
		
		System.out.println("***** Dados conta especial *****");
		contaEsp.imprimirDados();

		
	}
	
}
