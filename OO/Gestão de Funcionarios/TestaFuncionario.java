/**
 * TestaFuncionario
 */
public class TestaFuncionario {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        Data data = new Data();

        data.dia = "01";
        data.mes = "02";
        data.ano = "03";

        funcionario.nome = "Vini";
        funcionario.departamento = "Limpeza";
        funcionario.dataEntrada = data;
        funcionario.rg = "123123123";
        funcionario.salario = 300;

        System.out.println("valor antes do aumento: " + funcionario.salario);
        funcionario.bonifica(100);

        System.out.println("valor depois do aumento: " + funcionario.salario);

        System.out.println("Ganhos anuais: " + funcionario.calculaGanhoAnual());

        //funcionario.demite();

        funcionario.mostra();

    }
}