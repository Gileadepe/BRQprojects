package Parte01;

public class P1PG48 {
    public static void main(String[] args) {
        int hora = 17;
        int minuto = 30;
        int segundos = 30;

        int segundosPass = (hora*3600) + (minuto*60) + segundos;
        int segundosFal = 86400 -((hora*3600) + (minuto*60) + segundos);

        System.out.println("Segundos que se passaram desde as 0 hrs: "+segundosPass+" segundos");
        System.out.println("Segundos que faltam para as 0 hrs: "+segundosFal+" segundos");
    }
}
