package Lista3;

public class TesteAgenda {

	public static void main(String[] args) {

		Pessoa Klayton = new Pessoa("Klayton", "19", "70434872180", "1,66m");
		Pessoa Geovanna = new Pessoa("Geovanna", "16", "12345678910", "1,60m");
		Pessoa Gustavo = new Pessoa("Gustavo", "18", "10987654321", "1,80m");
		Agenda turma = new Agenda(3);
		
		turma.armazenarPessoa(Klayton);
		turma.armazenarPessoa(Geovanna);
		turma.armazenarPessoa(Gustavo);
		
		turma.imprimirPessoa("70434872180");
		System.out.println("\n\n\n");
		turma.imprimirAgenda();
		System.out.println("\n\n\n");
		turma.removerPessoa(Gustavo);
		System.out.println("\n\n\n");
		turma.imprimirAgenda();
	}

}
