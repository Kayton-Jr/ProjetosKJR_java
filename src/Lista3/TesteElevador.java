package Lista3;

public class TesteElevador {
	
	public static void main(String[] args){
		
		Elevador Juliana = new Elevador(10,19);
		
		Juliana.subir();
		Juliana.setPessPres(2);
		Juliana.entrar(6);
		Juliana.descer();
		Juliana.sair(6);
	}

}
