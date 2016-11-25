package lista12_DP;

public class Temperatura {
	
	private double temp;
	
	public Temperatura(double temp){
		this.temp = temp;
	}

	public double convTemp() {
		this.temp = ((temp-32)*10)/18;//Farenheit p/ Celsius
		return temp;
	}
	
}
