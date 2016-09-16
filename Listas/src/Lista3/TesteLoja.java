package Lista3;

import java.util.ArrayList;
import java.util.List;

public class TesteLoja{
	
	public static void main(String[] args){
		
		ArrayList<Produto> todosProd = new ArrayList<Produto>();
		
		
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

		
		if(todosProd.get(0) instanceof Livros){// fazer um for pegando todos os objs com ifs difetenciando cada um deles
			Livros l = (Livros) todosProd.get(0);
			l.toString();
		}
		
		System.out.println(todosProd.toString());
	}
}
