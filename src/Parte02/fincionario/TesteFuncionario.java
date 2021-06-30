package Parte02.fincionario;

import Parte02.fincionario.Funcionario;

public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario f01 =  new Funcionario();
        Funcionario f02 = new Funcionario(1105, "José Carlos da Silva", 6500.00);
        f01.setCodFunc(1200);
        f01.setNomeFunc("Maria Antônia Guimarães");
        f01.setSalarioMensal(8600.00);

        System.out.println(f01.getCodFunc()+ " t/t"+ f01.getNomeFunc()+ " t/t" +f01.getSalarioMensal() );

        System.out.println(f02.getCodFunc()+ " t/t"+ f02.getNomeFunc()+ " t/t" +f02.getSalarioMensal() );

        f01.setAumento(15.0);
        f02.setAumento(15.0);

        System.out.println(f01.getCodFunc()+"t/t"+f01.getSalarioAnual());
        System.out.println(f02.getCodFunc()+"t/t"+f01.getSalarioAnual());




    }
}
