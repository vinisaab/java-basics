/**
 * Empresa
 */
public class Empresa {

    Funcionario[] empregados;
    String cnpj;
    int posi = 0;

    public void adiciona(Funcionario f) {
        this.empregados[posi] = f;
        posi++;
    }
}