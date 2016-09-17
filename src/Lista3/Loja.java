package Lista3;

import java.util.ArrayList;

public class Loja{
	
	public static void main(String[] args){
		
		ArrayList<Produto> todosProd = new ArrayList<Produto>();
		int i =0;
		
		Livros livro1 = new Livros("Casal Deitel", "Java - Como programar");
		todosProd.add(livro1);
		Livros livro2 = new Livros("Nao sei, so lembro o nome do livro :/", "Programando em java para leigos");
		todosProd.add(livro2);
		
		
		CDs cd1 = new CDs(22, "Linkin Park - Meteora");
		todosProd.add(cd1);
		CDs cd2 = new CDs(13, "Three Days Grace - Human Race");
		todosProd.add(cd2);
		
		DVDs dvd1 = new DVDs(((float)2.5), "Velozes e Furiosos 7");
		todosProd.add(dvd1);

		while(i<5){
			if(todosProd.get(i) instanceof Livros){
				Livros l = (Livros) todosProd.get(i);
				l.toString();
			}
			else if(todosProd.get(i) instanceof CDs){
				CDs c = (CDs) todosProd.get(i);
				c.toString();
			}
			else if(todosProd.get(i) instanceof DVDs){
				DVDs d = (DVDs) todosProd.get(i);
				d.toString();
			}
			else
				System.out.println("Produto nao cadastrado!");
			i++;
		}
		System.out.println(todosProd.toString());
	}
}