package lista_revisao;

import java.util.Scanner;

public class TestePessoa {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		Pessoa p1 = new Pessoa("Klayton", -1, "704-348-721-80", "1,66m");
		
		p1.imprimirDados();
	}

}
