import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese precio del primer articulo: ");
        double precio1 = leer.nextDouble();

        System.out.println("Ingrese cantidad vendida del primer articulo: ");
        double cantidad1 = leer.nextDouble();

        System.out.println("Ingrese precio del segundo articulo: ");
        double precio2 = leer.nextDouble();

        System.out.println("Ingrese cantidad vendida del segundo articulo: ");
        double cantidad2 = leer.nextDouble();

        System.out.println("Ingrese precio del tercer articulo: ");
        double precio3 = leer.nextDouble();

        System.out.println("Ingrese cantidad vendida del tercer articulo: ");
        double cantidad3 = leer.nextDouble();

        double total = (precio1 * cantidad1) + (precio2 * cantidad2) + (precio3 * cantidad3);

        System.out.println("El total de la factura es: " + total);
    }
}