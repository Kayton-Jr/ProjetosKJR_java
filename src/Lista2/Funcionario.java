package Lista2;

public class Funcionario {
    
    private String nome, depto; 
    private double sal;
    private int rg;
    private Data dtadm;
    
    void recebeAumento(int porcentagem){
        sal = sal + (sal * porcentagem/100);
    }
    
    double calculaGanhoAnual(){
        return (sal * 12);
    }
    
    void imprimirFuncionario(){
        System.out.println("Nome: " +nome);
        System.out.println("Depto: " +depto);
        System.out.println("Salario: " +sal);
        System.out.println("RG: " +rg);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepto() {
        return depto;
    }

    public void setDepto(String depto) {
        this.depto = depto;
    }

    public Data getDtadm() {
		return dtadm;
	}

	public void setDtadm(Data dtadm) {
		this.dtadm = dtadm;
	}

	public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }
    
}
