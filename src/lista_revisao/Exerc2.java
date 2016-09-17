package lista_revisao;

import java.util.Scanner;

public class Exerc2 {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		String nomeArm[] = new String[10]; 
		String nomeB;
		boolean verif=false;
		
		for(int i = 0 ; i < 10 ; i++){
			System.out.println("Digite os 10 nomes para serem armazenados");
			nomeArm[i] = input.nextLine();
		}
		
		System.out.println("Digite um nome para saber se esta ou nao dentro do vetor");
		nomeB = input.nextLine();
		
		for(int i = 0 ; i < 10 ; i++){
			if(nomeB.equals(nomeArm[i])){
				verif = true;
				System.out.println("Nome encontrado!!");
				break;
			}	
		}
		if(!verif)
			System.out.println("Nome nao encontrado!!");

	}

}
