package Parte04.P4PG44;

public abstract class P4E04 {

    public static void metodoA() throws Exception{
        System.out.println("Iniciando método A!");

        try {P4E04.metodoB();

        }catch (Exception e){
            System.out.println("Excessão capturada pelo método A!");
        }finally {
            System.out.println("Método A finalizado!");
        }
    }

    public static void metodoB() throws Exception{
        System.out.println("Iniciando método B!");

        try {P4E04.metodoC();

        }finally {
            System.out.println("Método B finalizado!");
        }

    }

    public static void metodoC() throws Exception{
        System.out.println("Iniciando método C!");

        try {P4E04.metodoD();

        }finally {
            System.out.println("Método C finalizado!");
        }

    }

    public static void metodoD() throws Exception{
        System.out.println("Iniciando método D!");

        try {
            throw new Exception();
        }finally {
            System.out.println("Método D finalizado");
        }

    }
}
