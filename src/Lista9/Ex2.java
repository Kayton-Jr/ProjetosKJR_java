package Lista9;

import javax.swing.JOptionPane;


public class Ex2{
	
	public static void main(String[] args){
		
		int x;
		boolean done;
		do{
		
			try{
			
				x = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um inteiro: ", "Input", 3));
				JOptionPane.showMessageDialog(null, "Voce digitou: "+x, "Output", 1);
				done = false;
			
			}catch(NumberFormatException e){
				JOptionPane.showMessageDialog(null, "Este numero nao eh um inteiro", "Erro", 0);
				done = true;
			}	
			
		}while(done);
	}
}
