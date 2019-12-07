import jdk.nashorn.internal.runtime.doubleconv.DoubleConversion;
import java.util.Scanner;

/**
 * dolar
 */
public class dolar {

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("Digite a cotação");
        String valor1 = sc1.nextLine();
        
        System.out.println("Digite quantidade de dolar");
        String valor2 = sc2.nextLine();    
        
        System.out.println("Quantidade em Real: R$" + (Double.parseDouble(valor2) / Double.parseDouble(valor1)));
    }
}