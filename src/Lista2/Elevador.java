package Lista2;

public class Elevador {
	
	private int andarAtual, totalAndar, capac, pessPres;
	
	public Elevador(int capac, int totalAndar){
		this.capac = capac;
		this.totalAndar = totalAndar;//nao considera o terreo
		this.andarAtual = 0;//terreo
		this.pessPres = 0;
	}
	
	public void entrar(int qtd){
		int entraram=0;
			
		while(this.capac-this.pessPres>qtd && qtd>0){
			this.pessPres++;
			qtd--;
			entraram++;
		}
		if(0==entraram){
			System.out.println("Elevador lotado!");
		}	
		else{
			entraram = entraram - qtd;
			System.out.println("Entraram "+entraram+" pessoas e ficaram "+qtd+" de fora");
			System.out.println("O elevador tem "+this.pessPres+" pessoas presentes");
		}
	}
	
	public void sair(int qtd) {
		int sairam=0;
		while(this.pessPres>0 && qtd>0){
			this.pessPres--;
			qtd--;
			sairam++;
		}
		if(this.pessPres==0){
			System.out.println("Elevador vazio");
		}
		else{
			sairam = sairam - qtd;
			System.out.println("Sairam "+sairam+" pessoas");
			System.out.println("Tem "+this.pessPres+" pessoas no elevador");
		}
	}
	
	public void subir(){//sobe somente um andar
		
		if(andarAtual==this.totalAndar)
			System.out.println("O elevador ja se encontra no ultimo andar!");
		
		else{
			this.andarAtual++;
			System.out.println("O elevador se econtra "+this.andarAtual+" andar");
		}
	}
	
	public void descer() {//desce somente um andar
		
		if(this.andarAtual==0)
			System.out.println("O elevador ja se encontra no terreo!");
		else{
			this.andarAtual--;
			if(this.andarAtual==0)
				System.out.println("O elevador se encontra no terreo");
			else
				System.out.println("O elevador se econtra "+this.andarAtual+" andar");
		}
	}

	public int getAndarAtual() {
		return andarAtual;
	}

	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}

	public int getTotalAndar() {
		return totalAndar;
	}

	public void setTotalAndar(int totalAndar) {
		this.totalAndar = totalAndar;
	}

	public int getCapac() {
		return capac;
	}

	public void setCapac(int capac) {
		this.capac = capac;
	}

	public int getPessPres() {
		return pessPres;
	}

	public void setPessPres(int pessPres) {
		this.pessPres = pessPres;
	}

}
