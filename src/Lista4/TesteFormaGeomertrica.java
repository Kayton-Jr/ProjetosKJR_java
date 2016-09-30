package Lista4;

import java.util.Scanner;

public class TesteFormaGeomertrica {
	
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Fera, digita os lado dum quadrilatero bolado ai,\n"
				+ "tem que ser tudo igual se n da pau viu");
		
		Quadrilatero qd = new Quadrilatero(input.nextDouble(), input.nextDouble(), input.nextDouble(), input.nextDouble());
		
		System.out.println("O perimetro do teu quadrilatero eh: "+qd.calPerim()+"u");
		
		if(qd.calArea() == 0)
			System.out.println("Desculpa cara, disse q só funcionaria se fosse todos os lados iguais");
		else
			System.out.println("A area do teu quadrilatero eh: "+qd.calArea()+"u.a");
		
		System.out.println("\n\n");
		System.out.println("Agora digita os lados de um triangulo qualquer");
		
		Triangulo tri = new Triangulo(input.nextDouble(), input.nextDouble(), input.nextDouble());
		
		if(!tri.existe())
			System.out.println("Esses lados digitados nao formam um triangulo");
		else{
			System.out.println("O perimetro do teu triangulo eh: "+tri.calPerim()+"u");
			System.out.println("A area do teu triangulo eh: "+tri.calArea()+"u.a");
		}
			
	}

}
