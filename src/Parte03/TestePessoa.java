package Parte03;

public class TestePessoa {

    public static void main(String[] args) {

            Pessoa [] pe = new Pessoa[4];
            pe[0] = new Pessoa(1,"Carlos Gustavo",1.75);
            pe[1] = new Pessoa(2,"Jade Duarte",1.55);
            pe[2] = new Pessoa(3,"Ivson Joedes",1.70);
            pe[3] = new Pessoa(4,"Geaze Cavalcante",1.91);

            System.out.printf("A altura média das Pessoas é: %.2f%n", Pessoa.mediaAltura(pe));


        }

    }

