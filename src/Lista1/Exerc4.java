package Lista1;

import java.util.Scanner;


public class Exerc4{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira um numero inteiro");
		int x = input.nextInt();
		
		System.out.println(sequencia(x));
	}
	static float sequencia(int N){
		float H=1;
		for(float n=2; n<=N; n++){
			H = H - 1/n;			
		}
		return H;
	}
}
