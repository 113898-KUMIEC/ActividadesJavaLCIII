import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el precio del articulo: ");
        double precio = leer.nextInt();

        double total = precio * 1.21;

        System.out.println("El precio final es: " + total);
    }
}