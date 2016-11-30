package lista12_DP;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Log {
	
	private String acao;
	private Date data = new Date();
	private String date;
	private static final Log instance = new Log();

	private Log(){
		SimpleDateFormat conv = new SimpleDateFormat("dd/MM/yyyy"+"-"+"HH:mm:ss");
		date = conv.format(data.getTime());
		
	}
	
	public static Log getInstance(){
		return instance;
	}
	
	public void retornaLog(String texto){
		System.out.println(date);
		System.out.println(texto);
	}
}
