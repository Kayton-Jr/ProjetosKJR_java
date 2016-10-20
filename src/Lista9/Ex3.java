package Lista9;

import javax.swing.JOptionPane;


public class Ex3{
	
	public static void main(String[] args){
		
		String a[] = new String[5];
		
		for(int i=0; i<=5; i++){
			try{
				a[i] = String.valueOf(i);
				JOptionPane.showMessageDialog(null, "Numero armazenado: "+a[i]);
			}
			catch(ArrayIndexOutOfBoundsException e){
				JOptionPane.showMessageDialog(null, "Tamano do vetor excedido");
			}
		}
	}
}
