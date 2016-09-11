package Lista2;

import java.util.Scanner;

public class SistemaBancario {
	    
	public static void main(String[] args){
		
	    /*
	    * Cria um objeto do tipo Scanner para realizar leitura
	    * Scanner ==> classe
	    * input ==> objeto
	    * new Scanner ==> instanciando um novo objeto
	    * Scanner(System.in) ==> chamando o construtor personalizado da classe Scanner passando como parâmetro System.in 
	    * System.in ==> informa que o objeto que criamos será utilizado para ler dados de entrada (InputStream)
	    */
	    Scanner input = new Scanner(System.in);
	    
	    //Criando os objetos c1 e c2 do tipo Conta
	    Conta c1 = new Conta(1, 1, "Paulo", 2500, 500);
	    Conta c2 = new Conta(2, 1, "Klayton", 1500, 500);
	    
	    System.out.println("****Antes da transferencia*****");
	    c1.imprimirDados();
	    System.out.println("\n\n");
	    c2.imprimirDados();

	    System.out.println("\n\n\n");	    

	    c1.transferencia(c1, c2, 300, input);
	    
	    System.out.println("****Depois da transferencia*****");
	    c1.imprimirDados();
	    c2.imprimirDados();
    }
}