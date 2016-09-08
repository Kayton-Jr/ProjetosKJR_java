package Lista1;

import java.util.Scanner;

public class Exerc6{
	
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);

		System.out.println("Digite o N-esimo termo da serie 1, 4, 9, 16...\n");
		int a = input.nextInt();
		
		int c=1;
		int soma=0,mult=0;
		
		while(c<=a){
			imprimiSerie(serie(a,c), a);
			soma = somaPares(serie(a,c),a);
			mult = multImpares(serie(a,c),a);
			c++;
		}
		System.out.println("A soma dos pares eh: "+soma);
		System.out.println("A multiplicaçao dos impares eh: "+mult);
	}
	static int serie(int param, int pos){
		int[] ser = new int[param];
		int n=1;
		while(n<=param){
			ser[n] = n*n;
			n++;
		}
		return ser[pos];
	}
	static int somaPares(int serie, int param){
		int b=1;
		int seriePares=0;
		if(serie%2==0){
			seriePares+=seriePares;
			seriePares = serie;
		}
		return seriePares;
	}
	static int multImpares(int serie, int param){
		int b=1;
		int serieImpares=0;
		if(!(serie%2==0)){
			serieImpares+=serieImpares;
			serieImpares = serie;
		}
		return serieImpares;
	}
	static void imprimiSerie(int serie, int param){
		int b=1;
		if(b==param)
			System.out.print(serie+".");
			
		System.out.print(serie+",");
		b++;
	}
}
