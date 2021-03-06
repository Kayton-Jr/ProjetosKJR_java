package Lista3;

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
	 //M�todo sacar
	 public void sacar(double valor) {
		 if(valor + limite < saldo)
			 System.out.println("Saldo insuficiente ("+saldo+")");
	     saldo = saldo - valor;
	 }

	 //M�todo depositar
	 public void depositar(double valor) {
	     saldo = saldo + valor;
	 }

	 //m�todo imprimir o dono da conta
	 public void imprimirDono() {
	     System.out.println("Dono: " + nome);
	 }

	 //m�todo obter o saldo da conta
	 public double getSaldo() {
	     return saldo;
	 }
	 public void setSaldo(double valor) {
		 saldo = valor;
	 }

	 //m�todo obter o tipo da conta
	 public int getTipo() {
	     return tipo;
	 }
	 public double getLimite() {
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
	 }
	 public void transferencia(Conta ret, Conta rec, double qtd, Scanner input){
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