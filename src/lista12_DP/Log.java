package lista12_DP;

import java.util.Date;

public class Log {
	
	private static String acao;
	private Date data = new Date();
	private static long date; 
	private static final Log instance = new Log();
	
	private Log(){
		date = data.getTime();
		
	}
	
	public static Log getInstance(){
		return instance;
	}
	
	public static void retornaLog(){
		System.out.println(date);
		System.out.println();
	}
}
