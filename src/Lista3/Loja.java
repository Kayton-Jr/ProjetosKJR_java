package Lista3;

import java.util.ArrayList;

public class Loja{
	
	public static void main(String[] args){
		
		ArrayList<Produto> todosProd = new ArrayList<Produto>();
		int i =0;
		boolean igual = true;
		int j = 0;
		int comp1=1, comp2=0;
		
		Livros livro1 = new Livros("Casal Deitel", "Java - Como programar", "12345");
		todosProd.add(livro1);
		Livros livro2 = new Livros("Nao sei, so lembro o nome do livro :/", "Programando em java para leigos","123456");
		todosProd.add(livro2);
		
		
		CDs cd1 = new CDs(22, "Linkin Park - Meteora","1234567");
		todosProd.add(cd1);
		CDs cd2 = new CDs(13, "Three Days Grace - Human Race","12345678");
		todosProd.add(cd2);
		
		DVDs dvd1 = new DVDs(((float)2.5), "Velozes e Furiosos 7","1234567");
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
		i=0;
		while(i<todosProd.size()){
			if(i!=j){
				if(comp1!=comp2){
					if(todosProd.get(i).verifCodBar(todosProd.get(i).getCodBarras(), todosProd.get(j).getCodBarras())){
						System.out.println(todosProd.get(i).getNomeProd()+"\n"
								+ todosProd.get(j).getNomeProd()+"\n\n");
					i=comp1;
					j=comp2;
					}
				}
			}
			j++;
			if(j==todosProd.size()){
				i++;
				j=0;
			}
		}
		
		System.out.println(todosProd.toString());
	}
}