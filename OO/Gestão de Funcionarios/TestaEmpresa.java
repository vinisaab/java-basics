/**
 * TestaEmpresa
 */
public class TestaEmpresa {

    public static void main(String[] args) {
        Empresa emp = new Empresa();
        Funcionario[] func = new Funcionario[10];
        Funcionario fu =  new Funcionario();

        emp.posi = 0;
        emp.cnpj = "alalalala";
        emp.empregados = func;
        fu.nome = "vini";

        System.out.println(emp.empregados);
        emp.adiciona(fu);
        emp.adiciona(fu);
        emp.adiciona(fu);
        emp.adiciona(fu);


        System.out.println(emp.empregados[0].nome);
        System.out.println(emp.empregados[1].nome);
        System.out.println(emp.empregados[2].nome);
        System.out.println(emp.empregados[3].nome);
    }
}