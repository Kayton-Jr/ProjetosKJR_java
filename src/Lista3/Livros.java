package Lista3;


public class Livros extends Produto{
	
	private String autor;
	
	public Livros(String autor, String nome, String numCod){
		super();
		super.setNomeProd(nome);
		this.autor = autor;
		super.setCodBarras(numCod);
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
				"\nNome do autor: "+getAutor()+"\n"
				+ "Codigo de barras: "+super.getCodBarras()+"\n";  
	}
	
	public void imprimir() {
		System.out.println(toString());
	}
	
}