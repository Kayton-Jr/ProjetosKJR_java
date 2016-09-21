package Lista3;


public class Produto{
	
	private String nomeProd;
	private float precoProd;
	private String CodBarras;
	
	public Produto(){
		
	}
	
	public String getCodBarras(){
		return CodBarras;
	}
	public void setCodBarras(String codBarras){
		CodBarras = codBarras;
	}

	public String getNomeProd() {
		return nomeProd;
	}
	public void setNomeProd(String nomeProd) {
		this.nomeProd = nomeProd;
	}
	public float getPrecoProd() {
		return precoProd;
	}
	public void setPrecoProd(float precoProd) {
		this.precoProd = precoProd;
	}
	public boolean verifCodBar(String cod1, String cod2){
		if(cod1.equals(cod2)){
			System.out.println("Produtos com o mesmo Codigo de barras");
			return true;
		}
		else
			return false;
		
	}
}