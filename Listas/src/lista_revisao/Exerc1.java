package lista_revisao;

import java.util.Scanner;

public class Exerc1 {
		
	public static void main(String[] args){
		
		int x[] = new int[10];
		int y[] = new int[10];
		int z[] = new int[10];
		
		Scanner input = new Scanner(System.in);
		
		int i=0,j=0;
		
		while(i<10){
			System.out.println("Digite os 10 numeros para serem armazenados no vetor x");
			x[i] = input.nextInt();
			i++;
		}
		while(j<10){
			System.out.println("Digite os 10 numeros para serem armazenados no vetor y");
			y[j] = input.nextInt();
			j++;
		}
		
		diferenca(x,y,z);
		soma(x,y,z);
		produto(x,y,z);

		
	}
	
	static void diferenca(int a[], int b[], int c[]){
		
		for(int i = 0; i<10; i++){
			c[i] = a[i] - b[i];
			System.out.println("A diferença entre x e y eh: "+c[i]);
		}
		//return a;
	}
	
	static void soma(int a[], int[] b, int c[]){
		
		for(int i = 0; i<10; i++){
			c[i] = a[i] + b[i];
			System.out.println("A soma entre x e y eh: "+c[i]);
		}
	//	return a;
	}
	
	static void produto(int a[], int[] b, int c[]){
		
		for(int i = 0; i<10; i++){
			c[i] = a[i] * b[i];
			System.out.println("O produto entre x e y eh: "+c[i]);
		}
		//return a;
	}

}
