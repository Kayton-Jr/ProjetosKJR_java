package Lista3;

public class Data{
	
	private int dia, mes, ano;
	
	public Data(int tDia, int tMes, int tAno){
		
		this.mes = verifMes(tMes);
		this.ano = tAno;
		this.dia = verifDia(tDia);
		
	}
	private int verifMes(int testeMes){
		
		if(testeMes > 0 && testeMes <= 12)
			return testeMes;
		else{
			System.out.println("Mes invalido ("+testeMes+"), \nSelecionado 1");
			return 1;
		}
		
	}
	private int verifDia(int testeDia){
		
		int[] diaPorMes = 
			{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		if(testeDia > 0 && testeDia <= diaPorMes[this.mes])//verifica se o dia esta no intervalo do mes
			return testeDia;
		
		if(this.mes == 2 && testeDia == 29 && (this.ano % 400 == 0 ||//verifica ano bissexto 
				(this.ano % 4 == 0 && this.ano % 100 != 0 )))
			return testeDia;
		
		System.out.println("Dia do mes invalido ("+testeDia+"), \nSelecionado 1");
		return 1;
	}
	public String getData(){
		return String.format("%d/%d/%d", this.dia, this.mes, this.ano);
	}
}
