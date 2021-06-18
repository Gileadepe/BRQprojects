package Parte05.P5PG43;

public class TesteMidia {
    public static void main(String[] args) {
        Midia cd = new CD(123, 15.90, "Raça Negra", 15);

        Midia dvd = new DVD(124, 25.50, "Leonardo Gonçalves - Prinicipio", 20);

        cd.printDados();
        dvd.printDados();
    }
}
