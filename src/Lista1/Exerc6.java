package Lista1;

import java.util.Scanner;

public class Exerc6{
	
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);

		System.out.println("Digite o N-esimo termo da serie 1, 4, 9, 16...");
		int a = input.nextInt();
		
		int c=0;
		int soma=0,mult=0;
		
		while(c<=a-1){
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
		int n=0;
		while(n<=param-1){
			if(n==0)
				ser[0]=1;
			else
				ser[n] = (n+1)*(n+1);
			n++;
		}
		return ser[pos];
	}
	static int somaPares(int serie, int param){
		int seriePares=0;
		if(serie%2==0){
			seriePares+=seriePares;
			seriePares = serie;
		}
		return seriePares;
	}
	static int multImpares(int serie, int param){
		int serieImpares=0;
		if(!(serie%2==0)){
			serieImpares*=serieImpares;
			serieImpares = serie;
		}
		return serieImpares;
	}
	static void imprimiSerie(int serie, int param){
		int b=0;
		if(b==param-1)
			System.out.print(serie+".\n");
			
		System.out.print(serie+",");
		b++;
	}
}
