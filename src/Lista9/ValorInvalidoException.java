package Lista9;


public class ValorInvalidoException extends RuntimeException{
	
	private String message = "Valor invalido";
	
	public ValorInvalidoException(){
		super("Valor inserido invalido");
	}
	
	@Override
	public String getMessage(){
		return message;
	}
}
