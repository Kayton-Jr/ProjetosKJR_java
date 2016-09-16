package Lista1;

public class Exerc5{
		
	public static void main(String[] args){
				
		System.out.println("Este programa ira exibir a somatoria dos 10 primeiros termos\n"
				+"dessa sequencia 1/2 + 2/4 + 3/6 ...");
		
		System.out.println(exibeSeq());
	}
	static float exibeSeq(){
		float a, b=4; 
		float soma=(float) 0.5;
		for(a=2; a<=10; a++){
			soma += a/b;
			b+=2;
		}
		return soma;
	}
}
