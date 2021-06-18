package Parte02;

public class Calculadora {
    private double memoria =  0;

    public Calculadora(double memoria) {
        this.memoria = memoria;
    }

    public Calculadora() {
    }

    public double getMemoria() {
        return memoria;
    }

    public void setMemoria(double memoria) {
        this.memoria = memoria;
    }

    public double somar(double valor){
        memoria = valor + memoria;
        return memoria;
    }

    public double subtrair(double valor){
        memoria = memoria - valor;
        return memoria;
    }

    public double multiplicar(double valor){
        memoria = memoria * valor;
        return memoria;
    }

    public double dividir(double valor){
        memoria = memoria / valor;
        return memoria;
    }

    public double exibeMemoria(){

        return memoria;
    }

}
