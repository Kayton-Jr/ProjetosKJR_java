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
	    Conta c1 = new Conta(1, 1, "Paulo");
	    Conta c2 = new Conta(2);
	    
	    // Imprimindo o tipo da conta c1 e o tipo da conta c2
	    System.out.println(c1.obterTipo());
	    System.out.println(c2.obterTipo());
    }    
}