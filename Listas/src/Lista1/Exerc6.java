package Lista1;

import java.util.Scanner;

public class Exerc6{
	
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);

		System.out.println("Digite o N-esimo termo da serie 1, 4, 9, 16...");
		int nEsimo = input.nextInt();
		
		int serie[] = serie(nEsimo);
		int soma = somaSerPares(serie, nEsimo);
		int mult = multSerImpares(serie, nEsimo);
		imprimi(serie, soma, mult, nEsimo);
	}
	static int[] serie(int n){
		int[] serie = new int[n];
		int a=0;
		while(a<n){
			serie[a]=(a+1)*(a+1);
			a++;
		}
		return serie;
	}
	static int somaSerPares(int[] serie, int n){
		int a=0;
		int soma=0;
		while(a<n){
			if(serie[a]%2==0){
				soma = soma + serie[a];
			}
			a++;
		}
		return soma;
	}
	static int multSerImpares(int[] serie, int n){
		int a=0;
		int mult=1;
		while(a<n){
			if(!(serie[a]%2==0)){
				mult = mult * serie[a];
			}
			a++;
		}
		return mult;
	}
	static void imprimi(int[] serie, int soma, int mult, int n){
		int a=0;
		System.out.print("Esta eh a serie ");
		while(a<n){
			if(serie[a]==serie[n-1])
				System.out.print(serie[a]);
			else
				System.out.print(serie[a]+", ");
			a++;
		}
		System.out.println("\nA soma dos pares eh: "+soma);
		System.out.println("A multiplicaçao dos impares eh: "+mult);
	}
}
