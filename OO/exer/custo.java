import java.util.Scanner;

/**
 * custo
 */
public class custo {

    public static void main(String[] args) {
        double imposto = 0.45;
        double distribuidor = 0.28;
        double custoFinal = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o custo de Fabrica: ");
        double custo = Double.parseDouble(sc.nextLine());

        custoFinal = custo + (custo * imposto);
        custoFinal = custoFinal + (custoFinal * distribuidor);

        System.out.println("Custo ao consumidor: R$" + custoFinal );

    }
}