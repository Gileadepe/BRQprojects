package Parte04.P4PG42;

public class Funcionario {
    protected String nome;
    protected String rg;
    protected double salarioMensal;

    public Funcionario(String nome, String rg, double salarioMensal) {
        this.nome = nome;
        this.rg = rg;
        this.salarioMensal = salarioMensal;
    }

    public Funcionario() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    public final double pagamento(){

        return salarioMensal = salarioMensal * 0.85;
    }

    public double aumento(double valor){

        return salarioMensal + valor;
    }


}
