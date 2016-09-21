package Lista3;


public class CD extends Produto{
	
	private int numFaixas;
	
	public CD(int numFaixas, String nome, String numCod){
		super();
		super.setNomeProd(nome);
		this.numFaixas = numFaixas;
		super.setCodBarras(numCod);
	}

	public int getNumFaixas() {
		return numFaixas;
	}

	public void setNumFaixas(int numFaixas) {
		this.numFaixas = numFaixas;
	}
	
	@Override
	public String toString() {
		return "\nNome do CD: "+ super.getNomeProd() +
				"\nNumero de faixas do CD: "+getNumFaixas()+"\n"
						+ "Codigo de barras: "+super.getCodBarras()+"\n"; 
	}
	
	public void imprimir() {
		System.out.println(toString());
	}
}