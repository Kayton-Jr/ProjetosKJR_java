package Lista3;

import java.util.ArrayList;

public class Loja{
	
	public static void main(String[] args){
		
		ArrayList<Produto> todosProd = new ArrayList<Produto>();
		int i =0;
		boolean igual = true;
		int j = 0;
		int comp1=0, comp2=0;
		
		Livro livro1 = new Livro("Casal Deitel", "Java - Como programar", "12345");
		todosProd.add(livro1);
		Livro livro2 = new Livro("Nao sei, so lembro o nome do livro :/", "Programando em java para leigos","123456");
		todosProd.add(livro2);
		
		
		CD cd1 = new CD(22, "Linkin Park - Meteora","1234567");
		todosProd.add(cd1);
		CD cd2 = new CD(13, "Three Days Grace - Human Race","12345678");
		todosProd.add(cd2);
		
		DVD dvd1 = new DVD(((float)2.5), "Velozes e Furiosos 7","1234567");
		todosProd.add(dvd1);

		while(i<5){
			if(todosProd.get(i) instanceof Livro){
				Livro l = (Livro) todosProd.get(i);
				l.toString();
			}
			else if(todosProd.get(i) instanceof CD){
				CD c = (CD) todosProd.get(i);
				c.toString();
			}
			else if(todosProd.get(i) instanceof DVD){
				DVD d = (DVD) todosProd.get(i);
				d.toString();
			}
			else
				System.out.println("Produto nao cadastrado!");
			i++;
		}
		i=0;
		while(i<todosProd.size()){
			if(i!=j){
				if(i!=comp2 || j!=comp1){
					if(todosProd.get(i).verifCodBar(todosProd.get(i).getCodBarras(), todosProd.get(j).getCodBarras())){
						System.out.println(todosProd.get(i).getNomeProd()+"\n"
								+ todosProd.get(j).getNomeProd()+"\n\n");
					comp1=i;
					comp2=j;
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