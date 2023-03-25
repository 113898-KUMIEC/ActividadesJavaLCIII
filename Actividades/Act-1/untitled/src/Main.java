import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        int num1 = leer.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        int num2 = leer.nextInt();

        int Suma = num1 + num2;
        System.out.printf("La suma de %d y %d es: %d \n", num1, num2, Suma);

        int Diferencia = num1 - num2;
        System.out.printf("La diferencia de %d y %d es: %d \n", num1, num2, Diferencia);

        int Producto = num1 * num2;
        System.out.printf("El producto de %d y %d es: %d \n", num1, num2, Producto);

        float Cociente = num1 / num2;
        System.out.printf("El cociente de %d y %d es: %f", num1, num2, Cociente);

    }
}