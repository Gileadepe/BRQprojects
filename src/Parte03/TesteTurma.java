package Parte03;

import java.util.Scanner;

public class TesteTurma {
    public static void main(String[] args) {
        Turma t = new Turma();

        Scanner s = new Scanner(System.in);

        System.out.println("Digite o id da turma: ");
        int id = s.nextInt();

        System.out.println("Digite a quantidade de Alunos: ");
        int qtde = s.nextInt();

        double n[] = new double[qtde];

        for (int i = 0; i<n.length; i++){
            System.out.println("Digita a "+ (i+1) +" ª nota da turma");
            n[i] = s.nextInt();
        }
        t.mediaTurma(n);

        System.out.println("Id da Turma: "+ id);
        System.out.println("Média da Truma: "+t.mediaTurma(n));

        s.close();
    }
}
