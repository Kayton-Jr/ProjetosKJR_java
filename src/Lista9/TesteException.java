package Lista9;


public class TesteException{

	public static void main(String[] args){
		
		double nq=-2;
		
		try{
			if(nq<=0)
				throw new ValorInvalidoException();
		}
		catch(ValorInvalidoException e){
			System.out.println(e.getMessage());
		}
	}
}
