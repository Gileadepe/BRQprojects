package Parte05.P5PG43;

public class DVD extends Midia {
    private int nFaixas;

    public DVD(int codigo, double preco, String nome, int nFaixas) {
        super(codigo, preco, nome);
        this.nFaixas = nFaixas;
    }

    public DVD() {
    }

    public int getnFaixas() {

        return nFaixas;
    }

    public void setnFaixas(int nFaixas) {

        this.nFaixas = nFaixas;
    }

    public String getTipo(){
        String dvd = "DVD";
        return dvd;
    }

    public String getDetalhes(){

        return "\n Tipo de Mídia: "+getTipo()+
                super.getDetalhes()+ "\n Número de Faixas: "+ this.nFaixas;
    }


    public void printDados(){
        System.out.println(this.getDetalhes());
    }
}
