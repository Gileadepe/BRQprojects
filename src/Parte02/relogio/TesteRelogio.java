package Parte02.relogio;

import Parte02.relogio.Relogio;

public class TesteRelogio {
    public static void main(String[] args) {
        Relogio c1 = new Relogio(12,00,00);
        Relogio c2 = new Relogio();

        c2.setHora(5);
        c2.setMin(30);
        c2.setSeg(50);
        System.out.println(c1.exibeHorario());
        System.out.println(c2.exibeHorario());
        System.out.println(c1.adiantar(60000));
        System.out.println(c1.atrasar(30000));
        System.out.println(c2.adiantar(80000));
        System.out.println(c2.atrasar(3000));

    }
}
