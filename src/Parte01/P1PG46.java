package Parte01;

public class P1PG46 {
    public static void main(String[] args) {
        double d = 5.22; // Cotação do dólar
        double q1=10; // Qtde de moedas de 1 dolar
        double q2=30; // Qtde de moedas de 50 cents de dolar
        double q3=10; // Qtde de moedas de 25 cents de dolar
        double q4=10; // Qtde de moedas de 10 cents de dolar
        double q5=2; // Qtde de moedas de 5 cents de dolar
        double q6=10; // Qtde de moedas de 1 cents de dolar

        double r =(q1+0.5*q2+0.25*q3+0.1*q4+0.05*q5+0.01*q6)*d;

        System.out.println("O total das moedas deu R$: "+r+" reais");
    }
}
