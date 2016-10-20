package Lista9;


public class TesteConta{
	
	public static void main(String[] args){
		
		Conta c1 = new Conta(123, 1, "Klayton", 2000.0, 1000.0);
		try{
			c1.depositar(-2);
		}
		catch(IllegalArgumentException e){
			System.out.println("Valor para deposito invalido!");
		}
	}
}
