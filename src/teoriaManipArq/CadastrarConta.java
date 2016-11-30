package teoriaManipArq;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

import javax.swing.JOptionPane;

public class CadastrarConta {
	
	public CadastrarConta(){
		
	}
	
	public void cadastrar(Conta conta){
		
		File arq = new File("C:\\texto.txt");
		
		OutputStream os;
		try {
			os = new FileOutputStream(arq);
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		JOptionPane.showMessageDialog(null, "Informe os dados para cadastrar a conta");
		
		new Conta(Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o numero da conta")),
				Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o tipo da conta")),
				JOptionPane.showInputDialog(null, "Informe o nome do proprietario da conta"),
				Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o saldo da conta")),
				Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o limite da conta")));
	}

}
