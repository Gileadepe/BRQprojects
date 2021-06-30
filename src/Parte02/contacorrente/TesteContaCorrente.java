package Parte02.contacorrente;

import Parte02.contacorrente.ContaCorrente;

public class TesteContaCorrente {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        cc.depositar(1500);
        cc.sacar(200);
        cc.sacar(500);
        System.out.println("Saldo : "+cc.getSaldoCC());
    }
}
