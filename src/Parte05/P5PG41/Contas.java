package Parte05.P5PG41;

import Parte05.P5PG41.OperacaoMatematica;

public class Contas {

    public static void mostrarCalculo(OperacaoMatematica operacao, double x, double y){
        System.out.println("O resultado é: "+ operacao.calcular(x, y));
    }
}
