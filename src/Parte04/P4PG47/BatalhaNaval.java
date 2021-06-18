package Parte04.P4PG47;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class BatalhaNaval {

    public static Random r = new Random(new Date().getTime());

    public static void main(String[] args) {
        ArrayList paraguay = new ArrayList();
        ArrayList brasil = new ArrayList();

        paraguay.add(new PortaAvioes(1500,"Assuncion",1000, 500,10));
        paraguay.add(new Cruzador(50,"Caboto",500, 200, 20));
        paraguay.add(new Cruzador(50,"Cabeza de Vaca",300, 150, 10));
        paraguay.add(new NavioMercante(10,"Cisplatina",1000,50));
        paraguay.add(new NavioMercante(10,"Prata",500,10));
        paraguay.add(new Navio(200,"Virgem Maria"));
        paraguay.add(new NavioDeGuerra(200,"Guarany",500,300));

        brasil.add(new PortaAvioes(1000,"Curitiba",1500, 800,20));
        brasil.add(new Cruzador(60,"Pedro II",250, 250, 15));
        brasil.add(new Cruzador(70,"Tamandaré",350, 350, 30));
        brasil.add(new NavioMercante(10,"Bahia",1500,1000));
        brasil.add(new NavioMercante(10,"maranhão",500,50));
        brasil.add(new Navio(300,"Nossa Senhora da Conceição"));
        brasil.add(new NavioDeGuerra(200,"Recife",800,200));

        System.out.println("Frota Brasileira");
        imprimeFrota(brasil);
        System.out.println("Frota Paraguaia");
        imprimeFrota(paraguay);

        BatalhaDoRiachuelo(brasil,paraguay);


    }

    public static void BatalhaDoRiachuelo(ArrayList a, ArrayList b) {
        int cont = 0;
        double blindagem;

        while (a.size() > 0 && b.size() > 0) {

            if(!temNavioDeGuerra(a) && !temNavioDeGuerra(b)) {
                System.out.println("A guerra empatou!");
                break;
            }

            cont ++;

            Navio na = (Navio) a.get(r.nextInt(a.size()));
            Navio nb = (Navio) b.get(r.nextInt(b.size()));

            if(na instanceof NavioMercante && nb instanceof NavioMercante) {
                System.out.println(cont+") dois navios mercantes");
                continue;
            }

            if(na instanceof NavioMercante && nb instanceof NavioDeGuerra) {
                System.out.println(cont+") afundou navio mercante time a");
                a.remove(na);
                continue;
            }

            if(nb instanceof NavioMercante && na instanceof NavioDeGuerra) {
                System.out.println(cont+") afundou navio mercante time b");
                b.remove(nb);
                continue;
            }

            if(na instanceof NavioDeGuerra && nb instanceof NavioDeGuerra) {
                System.out.println(cont+") batalha de 2 Navios de Guerra");
                NavioDeGuerra ga = (NavioDeGuerra) na;
                NavioDeGuerra gb = (NavioDeGuerra) nb;
                blindagem = ga.getBlindagem()-gb.getAtaque();
                ga.setBlindagem(blindagem);
                blindagem = gb.getBlindagem()-ga.getAtaque();
                gb.setBlindagem(blindagem);
                if(ga.getBlindagem() < 0) {
                    System.out.println(cont+") Navio de Guerra time A afundou");
                    a.remove(na);
                }
                if(gb.getBlindagem() < 0) {
                    System.out.println(cont+") Navio de Guerra time B afundou");
                    b.remove(nb);
                }
                continue;
            }

            if(na instanceof Navio && nb instanceof NavioMercante ||
                    nb instanceof Navio && na instanceof NavioMercante	) {
                System.out.println(cont+") Navio x Navio Mercante - nada ocorre");
                continue;
            }

            if(na instanceof Navio && nb instanceof Navio) {
                System.out.println(cont+") Navio x Navio - nada ocorre");
                continue;
            }
        }
        if(a.size() == 0)
            System.out.println("O time B ganhou");
        if(b.size() == 0)
            System.out.println("O time A ganhou");
    }

    public static boolean temNavioDeGuerra(ArrayList al) {
        boolean tem = false;
        for(int i=0; i<al.size();i++) {
            Navio n = (Navio) al.get(i);
            if(n instanceof NavioDeGuerra) {
                tem = true;
                break;
            }
        }
        return tem;
    }

    public static void imprimeFrota(ArrayList al) {
        for(int i=0; i<al.size();i++) {
            System.out.println("---------------------");
            Navio n = (Navio) al.get(i);
            if(n instanceof NavioMercante) {
                ((NavioMercante) n).carregamento(50);
                continue;
            }

            if(n instanceof PortaAvioes) {
                ((PortaAvioes) n).exibirArmas();
                continue;
            }

            if(n instanceof Cruzador) {
                ((Cruzador) n).exibirArmas();
                continue;
            }

            if(n instanceof Navio) {
                n.exibirInfoGeral();
                continue;
            }

            if(n instanceof NavioDeGuerra) {
                ((NavioDeGuerra) n).exibirArmas();
                continue;
            }
        }

    }
}
