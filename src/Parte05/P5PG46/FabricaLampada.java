package Parte05.P5PG46;

public class FabricaLampada {

    public static void imprime(){
        System.out.println("Fabrica de Lâmpada!");
    }

    public Lampada construir(int tipo){
        if (tipo==0)
            return new Incadescente();
          return new Fluorescente();
    }


    public class Incadescente implements Lampada{

        @Override
        public void ligar() {
            System.out.println("Lampada incadescente Ligada!");

        }

        @Override
        public void desligar() {
            System.out.println("Lampada incadescente desligada!");

        }
    }

    public class Fluorescente implements Lampada{

        @Override
        public void ligar() {
            System.out.println("Lampada Fluorescente Ligada!");

        }

        @Override
        public void desligar() {
            System.out.println("Lampada Fluorescente desligada!");

        }
    }
}
