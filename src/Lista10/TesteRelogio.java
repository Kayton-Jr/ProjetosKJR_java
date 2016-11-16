package Lista10;

public class TesteRelogio {

	public static void main(String[] args) {
		
		Thread threadRel = new Thread(new Relogio());
		threadRel.start();

	}

}
