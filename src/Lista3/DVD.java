package Lista3;


public class DVD extends Produto{
	
	private float duracao;
	
	public DVD(float dur, String nome, String numCod){
		super();
		super.setNomeProd(nome);
		this.duracao = dur;
		super.setCodBarras(numCod);
	}

	public float getDuracao() {
		return duracao;
	}

	public void setDuracao(float duracao) {
		this.duracao = duracao;
	}
	
	@Override
	public String toString() {
		return "\nNome do DVD: "+ super.getNomeProd() +
				"\nDuracao do DVD: "+getDuracao()+"\n"
				+ "Codigo de barras: "+super.getCodBarras()+"\n";  
	}
	
	public void imprimir() {
		System.out.println(toString());
	}
}