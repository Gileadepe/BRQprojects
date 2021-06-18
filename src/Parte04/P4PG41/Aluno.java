package Parte04.P4PG41;

import java.util.Date;

public class Aluno extends Pessoa {
    private String matricula;

    public Aluno(String nome, String cpf, Date dataNascimento, String matricula) {
        super(nome, cpf, dataNascimento);
        this.matricula = matricula;
    }

    public Aluno() {

    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double tirarCopias(int qtde){
        double copia = 0;
        return copia = qtde * 0.07;
    }
}
