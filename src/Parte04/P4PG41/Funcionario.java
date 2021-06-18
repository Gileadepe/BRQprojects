package Parte04.P4PG41;

import java.util.Date;

public class Funcionario extends Pessoa {
    private double salario;
    private Date dataAdmissao;
    private String cargo;

    public Funcionario(String nome, String cpf, Date dataNascimento, double salario, Date dataAdmissao,
                       String cargo) {
        super(nome, cpf, dataNascimento);
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
        this.cargo = cargo;
    }

    public Funcionario(){

    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
