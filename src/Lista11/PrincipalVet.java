package Lista11;

public class PrincipalVet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GerenciaVetor vet = new GerenciaVetor();
		
		AcessaVetor add = new AcessaVetor(vet,1,7);//adciona
		AcessaVetor rem = new AcessaVetor(vet,2,7);//remove
		
		Thread tadd = new Thread(add);
		Thread trem = new Thread(rem);
		
		tadd.start();
		trem.start();
	}

}
