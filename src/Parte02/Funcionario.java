package Parte02;

public class Funcionario {
    private int codFunc;
    private String nomeFunc;
    private double salarioMensal;

    public Funcionario(int codFunc, String nomeFunc, double salarioMensal) {
        this.codFunc = codFunc;
        this.nomeFunc = nomeFunc;
        this.salarioMensal = salarioMensal;
    }

    public Funcionario() {
    }

    public int getCodFunc() {
        return codFunc;
    }

    public void setCodFunc(int codFunc) {
        this.codFunc = codFunc;
    }

    public String getNomeFunc() {
        return nomeFunc;
    }

    public void setNomeFunc(String nomeFunc) {
        this.nomeFunc = nomeFunc;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    public double getSalarioAnual(){
        double salarioAnual = salarioMensal *12;

        System.out.println("O salario Anual do funcionário é R$ "+salarioAnual);

         return salarioMensal * 12;
    }

    public void setAumento(double aumento){
        double valorComAumento = salarioMensal *(aumento/100);

        System.out.println("O valor do salario com aumento é R$ "+valorComAumento);

    }
}
