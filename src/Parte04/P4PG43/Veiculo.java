package Parte04.P4PG43;

public class Veiculo {
    private int velocidade = 0;
    private int velocidadeMax = 100;

    public Veiculo(int velocidade, int velocidadeMax) {
        this.velocidade = velocidade;
        this.velocidadeMax = velocidadeMax;
    }

    public Veiculo() {
    }

    public int getVelocidade() {

        return velocidade;
    }

    public void setVelocidade(
            int velocidade) {

        this.velocidade = velocidade;
    }

    public int getVelocidadeMax() {

        return velocidadeMax;
    }

    public void setVelocidadeMax(int velocidadeMax) {

        this.velocidadeMax = velocidadeMax;
    }

    public void acelera (int incremento) throws VelocidadeAcimaException{

        if (velocidade + incremento > velocidadeMax){
         throw new VelocidadeAcimaException();
        }
        else {
            velocidade += incremento;
        }
    }

    public void desacelara(int decremento) throws VelocidadeAbaixoException{

        if (velocidade - decremento < 0){
        throw new VelocidadeAbaixoException();
        }
        else {
            velocidade -= decremento;
        }
    }
}
