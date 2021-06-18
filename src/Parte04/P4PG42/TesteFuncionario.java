package Parte04.P4PG42;

import Parte04.P4PG42.Funcionario;

public class TesteFuncionario {
    public static void main(String[] args) {

        Funcionario f = new Funcionario("João Carlos", "8.122.208", 1800.00);
        Chefe c = new Chefe("Maria de Fátima", "9.811.530", 2300.00, 300.00, 500.00,
                           800.00);

        System.out.println("Funcionário: "+f.getNome()+ " Salatio: R$ "+f.pagamento()+ " Salario com Aumento: R$ "
                +f.aumento(800.00));
        System.out.println("Chefe: "+c.getNome()+" Salário: "+c.salarioMensal+ " Valor do pagamento extra: R$ "
                +c.pagamentoExtra());
    }
}
