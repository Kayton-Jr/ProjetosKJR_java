package lista12_DP;

public class Dica {
	
	private double temp;
	private Temperatura temperatura;
	private Clima clima;
	
	public Dica(double temp){
		this.temp = temp;
		
		this.temperatura = new Temperatura(temp);
		this.clima = new Clima(temp);
	}
	
	public void obterDica(){
		
		temp = temperatura.convTemp();
		
		if(temp<25)
			System.out.println(clima.verifTemp() + "\n"
					+ "Seria bacana usar um casaco");
		else if(temp<=30 && temp>=25)
			System.out.println(clima.verifTemp() + "\n"
					+ "Uma oportunidade boa para usar aquela sua blusa de manga longa");
		else				
			System.out.println(clima.verifTemp() + "\n"
					+ "Aconcelho fortementa a usar regatas e shorts");
	}

}
