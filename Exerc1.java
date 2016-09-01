package Lista1;

import java.util.Scanner;

public class Exerc1{
	
	private static Scanner	input;
	public static void main(String[] args){
		
		int a, b, c;
		input = new Scanner(System.in);
		
		System.out.println("Insira o primeiro numero: ");
		a = input.nextInt();
		
		System.out.println("Insira o segundo numero: ");
		b = input.nextInt();

		System.out.println("Insira o terceiro numero: ");
		c = input.nextInt();
		
		System.out.println("A media desses numeros eh: "+(a+b+c)/3);
		
		System.out.println("O produto desses numeros eh: "+a*b*c);
		
		imprimiMaior(a,b,c);
		
		imprimiMenor(a,b,c);
		
	}
	 static void imprimiMaior(int a, int b, int c){
		 int maior=0;
		 
		 if(a > b){
			 if(a > c){
				 maior = a;
			 }else{
				 maior = c;
			 }
		 }else if(b > a){
			 if(b > c){
				 maior = b;				 
			 }else{
				 maior = c;
			 }
		 }
		 System.out.println("O maior numero eh: "+maior);
	 }
	 static void imprimiMenor(int a, int b, int c){
		 int menor=0;
		 
		 if(a < b){
			 if(a < c){
				 menor = a;
			 }else{
				 menor = c;
			 }
		 }else if(b < a){
			 if(b < c){
				 menor = b;				 
			 }else{
				 menor = c;
			 }
		 }
		 System.out.println("O menor numero eh: "+menor);
	 }
}
