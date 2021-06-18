package Parte05.P5PG41;

import Parte05.P5PG41.OperacaoMatematica;

public class Resto extends OperacaoMatematica {
    @Override
    public double calcular(double x, double y) {
        return x % y;
    }
}
