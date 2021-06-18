package Parte04.P4PG43;

public class TesteVeiculo {
    public static void main(String[] args) {

        Veiculo v = new Veiculo();

        try {
            v.acelera(120);

        }catch (VelocidadeAcimaException e){
            e = new VelocidadeAcimaException();
            System.out.println(e.getMessage());
        }

    }
}
