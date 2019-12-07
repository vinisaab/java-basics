import java.util.Scanner;

import sun.jvm.hotspot.utilities.CPPExpressions.CastExpr;
import sun.tools.tree.CastExpression;

/**
 * operacoes
 */
public class operacoes {


    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("Digite o valor 1");
        String valor1 = sc1.nextLine();
        
        System.out.println("Digite o valor 2");
        String valor2 = sc2.nextLine();
        
        System.out.println("Soma: " + (Double.parseDouble(valor1) + Double.parseDouble(valor2)));
        System.out.println("Sub: "  + (Double.parseDouble(valor1) - Double.parseDouble(valor2)));
        System.out.println("Div: "  + (Double.parseDouble(valor1) / Double.parseDouble(valor2)));
        System.out.println("Mult: " + (Double.parseDouble(valor1) * Double.parseDouble(valor2)));       

    }
}