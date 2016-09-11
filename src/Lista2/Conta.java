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

	 //Construtor personalizado com um parâmetro
	 public Conta(int num) {
	     this.num = num;
	     tipo = 3;
	 }
	 //Método sacar
	 void sacar(int valor) {
	     saldo = saldo - valor;
	 }

	 //Método depositar
	 void depositar(int valor) {
	     saldo = saldo + valor;
	 }

	 //método imprimir o dono da conta
	 void imprimirDono() {
	     System.out.println("Dono: " + nome);
	 }

	 //método obter o saldo da conta
	 double obterSaldo() {
	     return saldo;
	 }

	 //método obter o tipo da conta
	 int obterTipo() {
	     return tipo;
	 }
}