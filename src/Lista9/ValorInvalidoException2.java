package Lista9;


public class ValorInvalidoException2 extends Exception{
	
	private String message = "Valor invalido/2";
	
	public ValorInvalidoException2(){
		super("Valor inserido invalido/2");
	}
	
	@Override
	public String getMessage(){
		return message;
	}
}
