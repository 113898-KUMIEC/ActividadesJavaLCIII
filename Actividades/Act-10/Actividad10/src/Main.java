import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa un numero positivo: ");
        int n = leer.nextInt();

        Validar(n);
    }

    static void Validar(int n){
        Scanner leer = new Scanner(System.in);
        while (n < 0){
            System.out.println("INGRESA UN NUMERO POSITIVO: ");
            n = leer.nextInt();
        }

        System.out.println("Al fin!!!");
    }
}