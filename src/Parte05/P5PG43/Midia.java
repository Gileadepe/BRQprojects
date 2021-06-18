package Parte05.P5PG43;

public class Midia {
    protected int codigo;
    protected double preco;
    protected String nome;

    public Midia(int codigo, double preco, String nome) {
        this.codigo = codigo;
        this.preco = preco;
        this.nome = nome;
    }

    public Midia() {
    }

    public int getCodigo() {

        return codigo;
    }

    public void setCodigo(int codigo) {

        this.codigo = codigo;
    }

    public double getPreco() {

        return preco;
    }

    public void setPreco(double preco) {

        this.preco = preco;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getTipo(){
        String midia = null;

        return midia;
    }

    public String getDetalhes(){


        return "\n Cógigo: "+this.codigo+
                "\n Preço: "+ this.preco+
                "\n Nome: "+this.nome;
    }

    public void printDados(){

        System.out.println(this.getDetalhes());
    }

}
