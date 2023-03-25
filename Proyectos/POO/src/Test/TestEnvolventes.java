
package Test;

public class TestEnvolventes {
    public static void main(String[] args) {
        
        Integer n = 10;//el objeto se usa para numeros simples
        int n2 = 7; //los primitivos para numeros mas complejos
        System.out.println(n + n2 );
        
        String ns = n.toString();
        System.out.println(ns + 5);
        
        n2 = Integer.parseInt(ns); //pasa de string a int
        System.out.println(n2 + n2);
        
    }
}
