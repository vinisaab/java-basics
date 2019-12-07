import java.util.Scanner;

/**
 * media
 */
public class media {

    public static void main(String[] args) {
        double media = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("informe o nome do aluno: ");
        String nome = sc.nextLine();

        System.out.println("Insira a nota 1: ");
        double nota1 = Double.parseDouble(sc.nextLine());

        System.out.println("Insira a nota 2: ");
        double nota2 = Double.parseDouble(sc.nextLine());

        System.out.println("Insira a nota 3: ");
        double nota3 = Double.parseDouble(sc.nextLine());

        System.out.println("A media do aluno: " + nome + " é: " + ((nota1 + nota2 + nota3) / 3));
    }
}