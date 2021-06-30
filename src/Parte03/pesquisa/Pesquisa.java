package Parte03.pesquisa;

public class Pesquisa {
    private static int sequencia;
    private int numPesquisa;
    private char sexo;
    private char resposta;

    public Pesquisa(char sexo, char resposta) {
        this.numPesquisa = ++sequencia;
        this.sexo = sexo;
        this.resposta = resposta;
    }

    public Pesquisa() {
    }


    public int getNumPesquisa() {

        return numPesquisa;
    }

    public void setNumPesquisa(int numPesquisa) {

        this.numPesquisa = numPesquisa;
    }

    public char getSexo() {

        return sexo;
    }

    public void setSexo(char sexo) {

        this.sexo = sexo;
    }

    public char getResposta() {

        return resposta;
    }

    public void setResposta(char resposta) {

        this.resposta = resposta;
    }

    public void imprimePesquisa(){
        System.out.println("Pesquisa: "+this.numPesquisa);
        System.out.println("Sexo: "+this.sexo);
        System.out.println("Resposta: "+this.resposta);
    }
}
