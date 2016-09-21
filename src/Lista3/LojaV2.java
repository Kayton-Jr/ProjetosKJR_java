package Lista3;

import java.util.Scanner;

public class LojaV2 {
	
	public static void main(String[] args){
		
		CD[] cds = new CD[5];
		Livro[] livros = new Livro[5];
		DVD[] dvds = new DVD[5];
		
		Scanner input = new Scanner(System.in);
		
		int opcao, i=0, a=0, b=0, c=0;
		
		opcao = input.nextInt();
		
		while(i<5){
			switch(opcao){
				case 1:
					CD cd1 = new CD(input.nextInt(), input.nextLine(), input.nextLine());
					cds[a] = cd1;
					a++;
					break;
				case 2:
					Livro livro1 = new Livro(input.nextLine(), input.nextLine(), input.nextLine());
					livros[b] = livro1;
					b++;
					break;
				case 3:
					DVD dvd1 = new DVD(input.nextInt(), input.nextLine(), input.nextLine());
					dvds[c] = dvd1;
					c++;
					break;
				default:
					System.out.println("Opcao de produto invalida!!!");
			}
			i++;
		}
	}

}
