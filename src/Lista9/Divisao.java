package Lista9;

import javax.swing.JOptionPane;


public class Divisao{
	
	public Divisao() {
		
	}
	
	public double divisao(int num, int den) {
		if(den==0){
			JOptionPane.showMessageDialog(null, "O denominador não pode ser 0", "Erro", 0);
			return 0.0;
		}
		else
			return (float) num/den;
	}
	
	public static void main(String[] args){
		
		Divisao div = new Divisao();
		
		String resultado = String.format("%.2f", div.divisao(2, 10));
				  
		JOptionPane.showMessageDialog(null, resultado);
		
	}
}
