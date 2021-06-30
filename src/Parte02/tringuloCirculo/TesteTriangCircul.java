package Parte02.tringuloCirculo;

import Parte02.tringuloCirculo.Circulo;
import Parte02.tringuloCirculo.Triangulo;

public class TesteTriangCircul {
    public static void main(String[] args) {
        Circulo c1 = new Circulo();
        Circulo c2 = new Circulo(5.0);

        Triangulo t1 = new Triangulo();
        Triangulo t2 = new Triangulo(3.0,4.0);
        c1.setRaio(8.0);
        t1.setBase(4.0);
        t1.setAltura(5.0);

        System.out.println("Circulo 1 - raio = "+c1.getRaio()+
                                      " area = "+c1.getArea()+
                                 " perimetro = "+c1.getPerimetro());

        System.out.println("Circulo 2 - raio = "+c2.getRaio()+
                                      " area = "+c2.getArea()+
                                 " perimetro = "+c2.getPerimetro());

        System.out.println("Triângulo 1 - base = "+t1.getBase()+
                                        " area = "+t1.getAltura()+
                                   " perimetro = "+t1.getPerimetro());

        System.out.println("Triângulo 2 - base = "+t2.getBase()+
                                        " area = "+t2.getAltura()+
                                   " perimetro = "+t2.getPerimetro());

    }
}
