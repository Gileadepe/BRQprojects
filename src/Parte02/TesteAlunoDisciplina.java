package Parte02;

public class TesteAlunoDisciplina {
    public static void main(String[] args) {
        AlunoDisciplina ad1 = new AlunoDisciplina(12, 5, 8.5,6.2);
        AlunoDisciplina ad2 = new AlunoDisciplina();

        ad2.setIdAluno(21);
        ad2.setIdDisciplina(6);
        ad2.setNotaB1(7.5);
        ad2.setNotaB2(6.5);

        System.out.println("Media Aritmetica do Aluno 1: "+ad1.mediaAritmetica()+
                          " Media Ponderada do Aluno 1 : "+ad1.mediaPonderada());

        System.out.println("Media Aritmetica do Aluno 2: "+ad2.mediaAritmetica()+
                          " Media Ponderada do Aluno 2 : "+ad2.mediaPonderada());



    }
}
