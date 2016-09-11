package Lista2;

public class Conta {
	
	//Atributos
	int num, tipo;
	String nome;
	double saldo, limite;

	 //construtor personalizado
	 public Conta(int num, int tipoParam, String nomeParam) {
	     nome = nomeParam;
	     this.num = num;
	     tipo = tipoParam;
	 }

	 //Construtor personalizado com um par�metro
	 public Conta(int num) {
	     this.num = num;
	     tipo = 3;
	 }
	 //M�todo sacar
	 void sacar(int valor) {
	     saldo = saldo - valor;
	 }

	 //M�todo depositar
	 void depositar(int valor) {
	     saldo = saldo + valor;
	 }

	 //m�todo imprimir o dono da conta
	 void imprimirDono() {
	     System.out.println("Dono: " + nome);
	 }

	 //m�todo obter o saldo da conta
	 double obterSaldo() {
	     return saldo;
	 }

	 //m�todo obter o tipo da conta
	 int obterTipo() {
	     return tipo;
	 }
}