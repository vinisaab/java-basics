/**
 * Conta
 */
public class Conta {

    int numero;
    String dono;
    double saldo;
    double limite;
    double salario;
    Cliente titular;

    boolean saca (double quantidade) {
        
        if (saldo > quantidade) {
            double novoSaldo = this.saldo - quantidade;
            this.saldo = novoSaldo;
            System.out.println("só gerei um boletinho de: " + quantidade);
            return true;
        } else {
            return false;
        }


    }

    void deposita (double quantidade) {
        this.saldo += quantidade;
    }

    double verSaldo (){
        return this.saldo;
    }

    void transfere (Conta destino, double valor) {
        this.saldo = this.saldo - valor;
        destino.saldo = destino.saldo + valor;
    }
}