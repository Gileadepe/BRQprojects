package Parte05.P5PG43;

public class CD extends Midia {
    int nMusicas;

    public CD(int codigo, double preco, String nome, int nMusicas) {
        super(codigo, preco, nome);
        this.nMusicas = nMusicas;
    }

    public CD() {
    }

    public int getnMusicas() {

        return nMusicas;
    }

    public void setnMusicas(int nMusicas) {

        this.nMusicas = nMusicas;
    }

    public String getTipo(){
        String cd = "CD";
        return cd;
    }

    public String getDetalhes(){

        return "\n Tipo de Mídia: "+getTipo()+
                super.getDetalhes()+"\n NR de Músicas: "+this.nMusicas;
    }


    public void printDados(){
        System.out.println(this.getDetalhes());
    }
}
