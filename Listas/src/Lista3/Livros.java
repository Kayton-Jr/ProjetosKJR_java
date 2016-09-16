package Lista3;


public class Livros extends Produto{
	
	private String autor;
	
	public Livros(String autor, String nome){
		super();
		super.setNomeProd(nome);
		this.autor = autor;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	@Override
	public String toString() {
		return "\nNome do livro: "+ super.getNomeProd() +
				"\nNome do autor: "+getAutor()+"\n"; 
	}
	
	public void imprimir() {
		System.out.println(toString());
	}
	
}
