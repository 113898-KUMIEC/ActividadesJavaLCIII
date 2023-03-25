import java.util.Scanner;

public class Sumar {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese numero 1: ");
        var n1 = leer.nextInt();
        System.out.println("Ingrese numero 2: ");
        var n2 = leer.nextInt();
        
        var r = n1 + n2;
        
        System.out.printf("El valor %d + %d = %d", n1, n2, r);
    }
}
