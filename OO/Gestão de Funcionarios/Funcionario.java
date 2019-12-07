/**
 * Funcionario
 */
public class Funcionario {

    String nome;
    String departamento;
    Data dataEntrada;
    String rg;
    double salario;
    boolean estaNaEmpresa = true;

    void bonifica(double quantidade) {
        this.salario = this.salario + quantidade;
    }

    double calculaGanhoAnual () {
        return this.salario * 12;
    }

    void demite() {
        this.estaNaEmpresa = false;
        System.out.println("Funcionario: " + this.nome + " foi demitido.");
    }

    void mostra () {
        System.out.println("Nome: " + this.nome);
        System.out.println("Depto: " + this.departamento);
        System.out.println("Entrada: " + this.dataEntrada.dia);
        System.out.println("RG: " + this.rg);
        System.out.println("Salário: " + this.salario);
        System.out.println("Está na empresa: " + ((this.estaNaEmpresa) ? "SIM": "NÃO"));
        System.out.println("Ganho Anual: " + calculaGanhoAnual());
    }

}