/**
 * Programa
 */
public class Programa {

    public static void main(String[] args) {
        Conta minhaConta = new Conta();        

        minhaConta.dono = "Master Devastator";
        minhaConta.saldo = 666.0;
        
        if (minhaConta.saca(100)){
            System.out.println("Consegui sacar");
        } else {
            System.out.println("Não consegui");
        }
        minhaConta.deposita(100);

        System.out.println("Saldo atual: " + minhaConta.verSaldo());


        Conta c1 = new Conta();
        c1.deposita(100);

        System.out.println("Saldo atual: " + c1.verSaldo());

        minhaConta.transfere(c1, 200);
        System.out.println("Saldo atual: " + c1.verSaldo());
        System.out.println("Saldo atual: " + minhaConta.verSaldo());

    }
}
