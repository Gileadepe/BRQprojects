package Parte03.estatistica;

import Parte03.estatistica.Estatistica;

import java.util.Scanner;

public class TesteEstatistica {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        double [] valores = {5,2,6,1,4};
        Estatistica e = new Estatistica();

        Estatistica.imprimeValores(valores);
        e.ordena(valores);
        System.out.println("Vetor em ordem Crescente: ");
        Estatistica.imprimeValores(valores);
        e.media(valores);
        System.out.println("Média: "+ e.media(valores));
        e.moda(valores);
        System.out.println("Moda: "+ e.moda(valores));
        e.mediana(valores);
        System.out.println("Mediana: "+ e.mediana(valores));
        e.variancia(valores);
        System.out.println("Variancia: "+ e.variancia(valores));
        e.desvioPadrao(valores);
        System.out.println("Desvio Padrão: "+ e.desvioPadrao(valores));

        s.close();
    }
}
