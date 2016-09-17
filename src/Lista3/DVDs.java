package Lista3;


public class DVDs extends Produto{
	
	private float duracao;
	
	public DVDs(float dur, String nome){
		super();
		super.setNomeProd(nome);
		this.duracao = dur;
	}

	public float getDuracao() {
		return duracao;
	}

	public void setDuracao(float duracao) {
		this.duracao = duracao;
	}
	
	@Override
	public String toString() {
		return "\nNome do livro: "+ super.getNomeProd() +
				"\nNome do autor: "+getDuracao()+"\n"; 
	}
	
	public void imprimir() {
		System.out.println(toString());
	}
}