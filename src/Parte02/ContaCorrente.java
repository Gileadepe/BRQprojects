package Parte02;

public class ContaCorrente {
    private int numCC;
    private double saldoCC;

    public ContaCorrente(int numCC, double saldoCC) {
        this.numCC = numCC;
        this.saldoCC = saldoCC;
    }

    public ContaCorrente() {
    }

    public int getNumCC() {
        return numCC;
    }

    public void setNumCC(int numCC) {
        this.numCC = numCC;
    }

    public double getSaldoCC() {
        return saldoCC;
    }

    public void setSaldoCC(double saldoCC) {
        this.saldoCC = saldoCC;
    }

    public void depositar(double valor){
        saldoCC = saldoCC + valor;
    }

    public void sacar(double valor){
        saldoCC = saldoCC - valor;
    }
}
