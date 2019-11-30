//variaveis
public class variaveis {
    public static void main(String[] args) {
        int idade;
        int idadeNoAnoQueVem;
        idade = 15;
        System.out.println("Idade: " + idade);

        idadeNoAnoQueVem = idade + 1;
        System.out.println("Ano que vem: " + idadeNoAnoQueVem);

        System.out.println("Chama Calculadora");
        calc(args);
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
}