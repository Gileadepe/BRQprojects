package Parte03;

import java.util.Arrays;
import java.util.Scanner;

public class P3PG51 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Até que número você deseja saber a sequência? ");
        int x = sc.nextInt();

        boolean[] vetor = new boolean[x];

        Arrays.fill(vetor, true);

        for (int i = 0; i<x; i++){
            int cont = 0;
           for (int k = 1; k<=i; k++){
               if (i % k == 0) ++cont;
           }
        if (cont > 2){
            vetor[i] = false;
        }

        }

        for (int i = 0; i<x; i++){
            System.out.println("Posição "+ i +": "+ vetor[i]);
        }

        sc.close();

    }
}
