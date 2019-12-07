import org.graalvm.compiler.nodes.NodeView.Default;

/**
 * Fibonacci
 */
public class Fibonacci {

    public  int calculaFib(int n) {  
        if (n == 0)  
           return 0;  
        else if (n == 1)  
           return 1;  
        else	
           return calculaFib(n-1) + calculaFib(n-2);  
    }

    public int umaLinha(int n) { return (n == 0) ? 0 : (n == 1) ? 1 : umaLinha(n-1) + umaLinha(n-2);}
}
