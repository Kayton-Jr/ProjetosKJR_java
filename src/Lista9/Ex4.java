package Lista9;


public class Ex4{

	public static void main(String[] args){
		
		String[] a = {"ABC", "123", "0", ""};
		
		for(int i=0; i<=4; i++){
			try{
				String s = a[i];
				System.out.println("\ts "+s);
				int n = Integer.parseInt(s);
				System.out.println("\ts: "+n);
				int m = 1234/n;
				System.out.println("\tm: "+m);
				System.out.println("Adeus");
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Tamanho do vetor excedido");
			}
			catch(NumberFormatException e){
				System.out.println("Conversao de String para inteiro invalida");
			}
			catch(ArithmeticException e){
				System.out.println("Nao é possivel realizar uma divisao com o denominador sendo 0");
			}
		}
	}
}
