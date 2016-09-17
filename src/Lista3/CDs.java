package Lista3;


public class CDs extends Produto{
	
	private int numFaixas;
	
	public CDs(int numFaixas, String nome){
		super();
		super.setNomeProd(nome);
		this.numFaixas = numFaixas;		
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
				"\nNumero de faixas do CD: "+getNumFaixas()+"\n"; 
	}
	
	public void imprimir() {
		System.out.println(toString());
	}
}