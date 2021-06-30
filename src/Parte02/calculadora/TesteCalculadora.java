package Parte02.calculadora;

import Parte02.calculadora.Calculadora;

public class TesteCalculadora {
    public static void main(String[] args) {
        Calculadora c1 = new Calculadora(50);
        Calculadora c2 = new Calculadora();
        c1.somar(5);
        c1.subtrair(40);
        c1.multiplicar(2);
        c1.dividir(4);
        System.out.println(c1.exibeMemoria());

        System.out.println(c2.somar(4)+ " / "+
                           c2.subtrair(1)+" / "
                           +c2.multiplicar(3)+
                           " / "+c2.dividir(3)+ " / "
                               +c2.exibeMemoria());



    }
}
