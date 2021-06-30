package Parte02.tringuloCirculo;

public class Circulo {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public Circulo() {
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getArea(){

        return Math.PI*Math.pow(raio,2);
    }

    public double getPerimetro(){

        return 2*Math.PI*raio;
    }
}
