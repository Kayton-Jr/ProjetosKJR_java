package Lista9;


public class TesteException2{
	
	public static void main(String[] args){
		
		double nq=-2;
		
		try{
			if(nq<=0)
				throw new ValorInvalidoException2();
		}
		catch(ValorInvalidoException2 e){
			System.out.println(e.getMessage());
		}
	}
}

