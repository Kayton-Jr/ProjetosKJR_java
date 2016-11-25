package lista12_DP;

public class Clima {
	
	private double temp;
	
	public Clima(double temp){
		this.temp = temp;
	}
	
	public String verifTemp(){
		if(temp<77)
			return "Dia frio";
			
		else if(temp<=86 && temp>=77)
			return "Dia fresco";
		
		else
			return "Dia quente";
		
	}

}
