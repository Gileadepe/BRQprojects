package Parte04.P4PG42;

public class Chefe extends Funcionario {
    protected double contas;
    protected double gastosExtras;
    protected double adicionalChefia;

    public Chefe(String nome, String rg, double salarioMensal, double contas, double gastosExtras,
                 double adicionalChefia) {
        super(nome, rg, salarioMensal);
        this.contas = contas;
        this.gastosExtras = gastosExtras;
        this.adicionalChefia = adicionalChefia;
    }

    public Chefe(){

    }

    public double getContas() {

        return contas;
    }

    public void setContas(double contas) {

        this.contas = contas;
    }

    public double getGastosExtras() {

        return gastosExtras;
    }

    public void setGastosExtras(double gastosExtras) {

        this.gastosExtras = gastosExtras;
    }

    public double getAdicionalChefia() {

        return adicionalChefia;
    }

    public void setAdicionalChefia(double adicionalChefia) {

        this.adicionalChefia = adicionalChefia;
    }

    public double pagamentoExtra(){
        double pagamento = 0;
        return pagamento = contas + gastosExtras + adicionalChefia;
    }

}
