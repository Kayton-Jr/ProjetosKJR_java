package Lista3;

import java.util.Scanner;

public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario f1 = new Funcionario();

		Scanner input = new Scanner(System.in);

		System.out.println("Digite o nome: ");
		
		String tempNome = input.nextLine();
		f1.setNome(tempNome);
		
		
		System.out.println("Digite o RG: ");
		
		int tempRg = input.nextInt();
		f1.setRg(tempRg);
		
		
		System.out.println("Digite o departamento: ");
		
		String tempDepartamento = input.next();
		f1.setDepto (tempDepartamento);
		
		
		System.out.println("Digite o salario: ");
		
		double tempSalario = input.nextDouble();
		f1.setSal (tempSalario);
		

		int diaTemp, mesTemp, anoTemp;

		System.out.println("Informe a data de admissão (dd mm aaaa): ");

		diaTemp = input.nextInt();
		mesTemp = input.nextInt();
		anoTemp = input.nextInt();

		Data dataAtual = new Data(diaTemp, mesTemp, anoTemp);
		
		
		String tempDataAtual = dataAtual.getData();
		f1.setData("Data de admissão: "+tempDataAtual+"\n");
		
		System.out.println("\n *** Antes do aumento ***\n");
		
		System.out.println("Ganho Anual: "+f1.calculaGanhoAnual());
		f1.imprimirFuncionario();

		System.out.println("\n *** Depois do aumento ***\n");
		
		f1.recebeAumento(20);
		
		System.out.print("Ganho Anual: ");
		f1.imprimirFuncionario();
		
	}
}
