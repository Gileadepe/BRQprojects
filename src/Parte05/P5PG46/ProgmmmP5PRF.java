package Parte05.P5PG46;

import Parte05.P5PG46.FabricaLampada;
import Parte05.P5PG46.Lampada;

import java.util.Scanner;

public class ProgmmmP5PRF {
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Tipo de Lâmpada....(0/1): ");
        int tipo = Integer.parseInt(s.nextLine());

        FabricaLampada fl = new FabricaLampada();
        Lampada la = fl.construir(tipo);
        la.ligar();
        la.desligar();
        FabricaLampada.imprime();
    }
}
