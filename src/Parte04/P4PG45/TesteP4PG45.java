package Parte04.P4PG45;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteP4PG45 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int inteiro;
        System.out.println("Digite um inteiro: ");
        try {
            inteiro = s.nextInt();
            System.out.println("Você digitou: "+inteiro);
        }catch (InputMismatchException e){
            System.out.println("Não é um inteiro númerico!");
        }finally {
            s.close();
        }

    }
}
