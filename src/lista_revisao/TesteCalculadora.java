package lista_revisao;

import java.util.Scanner;

public class TesteCalculadora {
	
	public static void main(String[] args){
	
		Calculadora calc = new Calculadora();
		Scanner input = new Scanner(System.in);
		String tipoOp;
		
		do{
			System.out.println("Digite a operação desejada + ou - ou / ou * ou reset ou sair");
			tipoOp = input.nextLine();
			
			if(calc.getX()==0.0){
				System.out.println("Digite o primeiro valor");
				calc.setX(input.nextDouble());
			}
			switch (tipoOp) {
			case "+":
				System.out.println("Digite o segundo valor");
				calc.setY(input.nextDouble());
				calc.soma();
				calc.imprimiResult();
				break;
			case "-":
				System.out.println("Digite o segundo valor");
				calc.setY(input.nextDouble());
				calc.subtracao();
				calc.imprimiResult();
				break;
			case "/":
				System.out.println("Digite o segundo valor");
				calc.setY(input.nextDouble());
				calc.divisao();
				calc.imprimiResult();
				break;
			case "*":
				System.out.println("Digite o segundo valor");
				calc.setY(input.nextDouble());
				calc.multiplicacao();
				calc.imprimiResult();
				break;
			case "reset":
				System.out.println("Variaveis resetadas para 0");
				calc.setX(0);
				calc.setY(0);
				calc.setZ(0);
				break;
			default:
				System.out.println("Esta operacao nao eh valida");
				break;
			}
			
			
		} while(!(tipoOp.equals("sair")));

	}
}