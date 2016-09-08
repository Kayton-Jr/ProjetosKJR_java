package Lista1;
import java.util.Scanner;

public class Exerc3{
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int[] i = new int[5];
		int a = 0;
		while(a<5){
			System.out.println("Insira um numero");
			i[a] = input.nextInt();
			a++;
		}
		verif(i);	
	}
	static void verif(int[] b){
		int neg=0,pos=0,zero=0;
		
		for(int x = 0; x<5 ;x++){
			if(b[x]<0)
				neg++;
			else if(b[x]>0)
				pos++;
			else
				zero++;
		}
		System.out.println("Foram inseridos "+neg+" numero(s) negativo(s)");
		System.out.println("Foram inseridos "+pos+" numero(s) positivo(0)");
		System.out.println("Foram inseridos "+zero+" numero(s) zero(s)");

	}
}
