package teoriaManipArq;

import java.util.Scanner;

public class Conta {
	
	//Atributos
	private int num, tipo;
	private String nome;
	private double saldo, limite;

	 //construtor personalizado
	 public Conta(int num, int tipoParam, String nomeParam, double saldo, double limite) {
	     this.nome = nomeParam;
	     this.num = num;
	     this.tipo = tipoParam;
	     this.saldo = saldo;
	     this.limite = limite;
	 }
	 //Método sacar
	 void sacar(int valor) {
		 if(valor + limite < saldo)
			 System.out.println("Saldo insuficiente ("+saldo+")");
	     saldo = saldo - valor;
	 }

	 //Método depositar
	 void depositar(int valor) {
		 if(valor<0)
			 throw new IllegalArgumentException();
		 else
			 saldo = saldo + valor;
	 }

	 //método imprimir o dono da conta
	 void imprimirDono() {
	     System.out.println("Dono: " + nome);
	 }

	 //método obter o saldo da conta
	 double getSaldo() {
	     return saldo;
	 }
	 void setSaldo(double valor) {
		 saldo = valor;
	 }

	 //método obter o tipo da conta
	 int getTipo() {
	     return tipo;
	 }
	 double getLimite() {
		 return limite;
	 }
	 String getNome() {
		 return nome;
	 }
	 void imprimirDados(){
		 System.out.println("Nome: "+nome);
		 System.out.println("Tipo da conta: "+tipo);
		 System.out.println("Numero da conta: "+num);
		 System.out.println("Saldo: "+saldo);
		 System.out.println("Limite: "+limite);
	 }
	 void transferencia(Conta ret, Conta rec, double qtd, Scanner input){
		 if(ret.getSaldo() + ret.getLimite() < qtd)
			 System.out.println("Saldo insuficiente ("+ret.getSaldo()+")");
		 else {
			 System.out.println("Deseja transferir "+qtd+" de "+ret.getNome()+" para ");
			 rec.imprimirDados();
			 System.out.println("S ou N ?");
			 
			 String sOUn = input.nextLine();
			 
			 if(sOUn.equals("S") || sOUn.equals("s")){
				 ret.setSaldo(ret.getSaldo() - qtd);
				 rec.setSaldo(rec.getSaldo() + qtd);
			 }
		 }
	 }
}