import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresar numero 1: ");
        int num1 = leer.nextInt();

        System.out.println("Ingresar numero 2: ");
        int num2 = leer.nextInt();

        System.out.println("Ingresar numero 3: ");
        int num3 = leer.nextInt();

        System.out.println("Ingresar numero 4: ");
        int num4 = leer.nextInt();

        System.out.println("Ingresar numero 5: ");
        int num5 = leer.nextInt();

        System.out.println("Ingresar numero 6: ");
        int num6 = leer.nextInt();

        System.out.println("Ingresar numero 7: ");
        int num7 = leer.nextInt();

        System.out.println("Ingresar numero 8: ");
        int num8 = leer.nextInt();

        System.out.println("Ingresar numero 9: ");
        int num9 = leer.nextInt();

        System.out.println("Ingresar numero 10: ");
        int num10 = leer.nextInt();

        int suma = num1+num2+num3+num4+num5+num6+num7+num8+num9+num10;

        double promedio = suma / 10;

        System.out.println("La suma de los numeros es: " + suma + "\n");

        System.out.println("El promedio de los numeros es: " + promedio);
    }
}