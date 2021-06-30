package Parte03.pessoa;

public class Pessoa {
    private int idPessoa;
    private String nome;
    private double altura;

    public Pessoa(int idPessoa, String nome, double altura) {
        this.idPessoa = idPessoa;
        this.nome = nome;
        this.altura = altura;
    }

    public Pessoa() {
    }

    public int getIdPessoa() {

        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {

        this.idPessoa = idPessoa;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {

        this.altura = altura;
    }

    public static double mediaAltura(Pessoa [] pe) {
        double soma = 0;
        for(int i =0; i<pe.length; i++){
            soma += pe[i].getAltura();
        }
        return soma/pe.length;
    }
}
