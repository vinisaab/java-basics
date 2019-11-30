/**
 * Condicionais
 */
public class Condicionais {

    public static void main(String[] args) {
        
        System.out.println("IF");
        _if();
        System.out.println("SWITCH");
        _switch();
        System.out.println("WHILE");
        _while();
        System.out.println("FOR");
        _for();
    }

    public static void _if() {
        int idade = 18;
        boolean amigoDoDono = false;

         if (idade < 18 && amigoDoDono) {
             System.out.println("Chamar o dono");
         } else if (idade < 18 && !amigoDoDono) {
            System.out.println("não Pode Entrar");
         } else {
            System.out.println("pode entrar");
         }
    }

    public static void _switch() {
        
        int teste = 1;

        switch (teste) {
            case 1:
                System.out.println("Teste = 1");
                break;
            case 2:
                System.out.println("Teste = 1");
                break;  
            case 3:
                System.out.println("Teste = 1");
                break;                      
            default:
                System.out.println("valor não localizado");
                break;
        }
    }

    public static void _while() {
        int idade = 15;
        while (idade < 18) {
            System.out.println(idade);
            idade = idade + 1;
        }
    }

    public static void _for() {
        
        for (int i = 1; i < 100; i++) {             
            
            if (i % 19 == 0) {
                 System.out.println("vin diesel por 19");
                 break;
             }

             if (i >= 5 && i <= 10) {
                 continue;
             }    
             System.out.println(i);         
        }
    }
}