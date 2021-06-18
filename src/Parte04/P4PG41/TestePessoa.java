package Parte04.P4PG41;

import Parte04.P4PG41.Pessoa;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestePessoa {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat ft = new SimpleDateFormat("dd.MM.YYYY");

        Aluno a1 = new Aluno("Gileade Cavalcante", "123.456.789-00", ft.parse("10.10.1995"),
                "9871234");
        Professor p = new Professor("José Maria", "789.543.621-12",ft.parse("30.01.1961"),
                3500.00, "Matemática");
        Funcionario f = new Funcionario("Maria do Carmo", "563.231.751-94", ft.parse("01.02.1968"),
                2000.00, ft.parse("03.05.2010"), "Eletricista");

        System.out.println("Aluno: "+a1.getNome()+ " Matricula: "+a1.getMatricula()+ " Valor das cópias R$ "+
                a1.tirarCopias(25));

        System.out.println("Professor: "+p.getNome()+ " Disciplina: "+p.getDisciplina()+ " Valor das cópias R$ "
        +p.tirarCopias(80));

        System.out.println("Funcionario: "+f.getNome()+ " Data de Admissão: "+f.getDataAdmissao()+ " Cargo: "
        +f.getCargo());


    }
}
