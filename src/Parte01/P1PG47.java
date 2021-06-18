package Parte01;

public class P1PG47 {
    public static void main(String[] args) {
        double temperCelsius = 30;

        double tempFah = temperCelsius*1.8+32;

        double tempKel = temperCelsius+273.15;

        double tempReu = temperCelsius*1.8+32+459.67;

        double tempRan = temperCelsius*0.8;

        System.out.println("Temperatura em Celsius: "+temperCelsius);
        System.out.println("Temperatura em Fahrenheit: "+tempFah);
        System.out.println("Temperatura em Kelvin: "+tempKel);
        System.out.println("Temperatura em Reaumur: "+tempReu);
        System.out.println("Temperatura em Rankine: "+tempRan);
    }
}
