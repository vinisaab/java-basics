/**
 * Exercicios
 */
public class Exercicios {
    public static void main(String[] args) {
        //um();
        //dois();
        //tres();
        //quatro();
        //cinco();
        //seis();
        //sete();
        oito();
        
    }

    public static void um() {
        for (int i = 150; i <= 300; i++) {
            System.out.println(i);
        }
    }

    public static void dois() {
        int a = 0;

        for (int i = 0; i <= 1000; i++) {
            a = a + i;
        }

        System.out.println(a);
    }

    public static void tres() {
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void quatro() {
        int fatorial = 1;
        for (int i = 1; i <= 10; i++) {
            
            fatorial *= i;
            System.out.println("Fatorial de " + i + " É igual a " + fatorial);
        }
    }
    public static void cinco() {
        long fatorial = 1;
        for (int i = 1; i <= 20; i++) {
            
            fatorial = (fatorial *= i) -1;
            System.out.println("Fatorial de " + i + " É igual a " + fatorial);
        }
    }

    public static void seis() {
        int fib = 0;
        int ant = 0;
        
        for (int i = 0; i < 1000; i++) {
            
            if (i == 1) {
                fib = 1;
                ant = 0;
            } else {
                fib += ant;
                ant = fib - ant;
            }
            
            System.out.println(fib);
            if (fib > 100) {
                break;
            }            
        }        
    }

    public static void sete() {
        int x = 40;

        while (1 < 2) {
            if (x % 2 == 0){
                x = x/2;
            } else {
                x = 3 * x + 1;
            }
            System.out.println(x);

            if (x == 1) {
                break;
            }
        }
    }  
    
    public static void oito() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {   
                
                System.out.print(i * j);
                System.out.print(' ');
            }
            System.out.print("\n");
        }
    }
    
}