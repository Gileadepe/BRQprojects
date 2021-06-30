package Parte03.cosseno;

public class TesteCosseno {
    public static void main(String[] args) {
        Cosseno c1 = new Cosseno();
        c1.calculaParcelas();
        System.out.println("Parcelas: ");
        c1.somaParcelas();
        System.out.println("Valor do cosseno aproximado: ");
        System.out.println(c1.getCosseno());
    }
}
