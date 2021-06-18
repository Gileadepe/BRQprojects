package Parte05.P5PG41;

import Parte05.P5PG41.*;

public class Calculadora {
    public static void main(String[] args) {
        Contas.mostrarCalculo(new Soma(),5, 5);

        Contas.mostrarCalculo(new Subtracao(),25,20);

        Contas.mostrarCalculo(new Multiplicacao(),8,9);

        Contas.mostrarCalculo(new Divisao(),49,7);

        Contas.mostrarCalculo(new Resto(),58,9);
    }
}
