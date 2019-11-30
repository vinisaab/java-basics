import java.util.function.Function;

//variaveis
public class Variaveis {
    public static void main(String[] args) {
        int idade;
        int idadeNoAnoQueVem;
        idade = 15;
        System.out.println("Idade: " + idade);

        idadeNoAnoQueVem = idade + 1;
        System.out.println("Ano que vem: " + idadeNoAnoQueVem);

        System.out.println("Chama Calculadora");
        calc(args);

        System.out.println("Chama Conversão");
        converte();
    }

    public static void calc(String[] args) {
        int quatro = 2 + 2;
        int tres = 5 - 2;
        int oito = 4 * 2;
        int dezesseis = 64/4;
        int um = 5 % 2;

        System.out.println(quatro);
        System.out.println(tres);
        System.out.println(oito);
        System.out.println(dezesseis);
        System.out.println(um);

    }

    public static void converte() {
        double d3 = 3.14;
        // ERRO - int i = d3;
        int i = (int) d3;

        System.out.println("teste conversão double - int: " + i);
    }
}