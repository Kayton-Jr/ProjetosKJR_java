package lista12_DP;

import java.util.Scanner;

public class Conta {
	
	//Atributos
	private int num, tipo;
	private String nome;
	private double saldo, limite;
	private Log log;

	 //construtor personalizado
	 public Conta(int num, int tipoParam, String nomeParam, double saldo, double limite) {
	     this.nome = nomeParam;
	     this.num = num;
	     this.tipo = tipoParam;
	     this.saldo = saldo;
	     this.limite = limite;
	     this.log = Log.getInstance();
	     log.retornaLog("Conta criada");
	 }
	 //Método sacar
	 public void sacar(double valor) {
		 if(valor + limite < saldo){
			 System.out.println("Saldo insuficiente ("+saldo+")");
			 saldo = saldo - valor;
			 log.retornaLog("Saque realizado");	     
		 }
	 }

	 //Método depositar
	 public void depositar(double valor) {
	     saldo = saldo + valor;
	     log.retornaLog("Deposito realizado");
	 }

	 //método imprimir o dono da conta
	 public void imprimirDono() {
	     System.out.println("Dono: " + nome);
	     log.retornaLog("Impressao realizada");
	 }

	 //método obter o saldo da conta
	 public double getSaldo() {
		 log.retornaLog("Consulta de saldo realizada");
	     return saldo;
	 }
	 public void setSaldo(double valor) {
		 saldo = valor;
	 }

	 //método obter o tipo da conta
	 public int getTipo() {
	     return tipo;
	 }
	 public double getLimite() {
		 log.retornaLog("Consulta de limite realizada");
		 return limite;
	 }
	 public String getNome() {
		 return nome;
	 }
	 public void imprimirDados(){
		 System.out.println("Nome: "+nome);
		 System.out.println("Tipo da conta: "+tipo);
		 System.out.println("Numero da conta: "+num);
		 System.out.println("Saldo: "+saldo);
		 System.out.println("Limite: "+limite);
		 log.retornaLog("Impressao de dados realizada");
	 }
	 public void transferencia(Conta ret, Conta rec, double qtd, Scanner input){
		 if(ret.getSaldo() + ret.getLimite() < qtd){
			 System.out.println("Saldo insuficiente ("+ret.getSaldo()+")");
			 log.retornaLog("Tentativa de transferencia realizada");
		 }
		 else {
			 System.out.println("Deseja transferir "+qtd+" de "+ret.getNome()+" para ");
			 rec.imprimirDados();
			 System.out.println("S ou N ?");
			 
			 String sOUn = input.nextLine();
			 
			 if(sOUn.equals("S") || sOUn.equals("s")){
				 ret.setSaldo(ret.getSaldo() - qtd);
				 rec.setSaldo(rec.getSaldo() + qtd);
				 log.retornaLog("Transferencia realizada");
			 }
			 else
				 log.retornaLog("Transferencia negada");
		 }
	 }
}