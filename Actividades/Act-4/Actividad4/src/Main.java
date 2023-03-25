import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresar nombre de la primer persona: ");
        String nombre1 = leer.nextLine();

        System.out.println("Ingresar nombre de la segunda persona: ");
        String nombre2 = leer.nextLine();

        System.out.printf("Ingresar altura en cm de %s: ", nombre1);
        int altura1 = leer.nextInt();

        System.out.printf("Ingresar altura en cm de %s: ", nombre2);
        int altura2 = leer.nextInt();

        if(altura1>altura2){
            System.out.printf("%s es mas alta, mide: %d cm. En cambio %s mide solo %d",nombre1,altura1, nombre2, altura2);
        } else if (altura2>altura1) {
            System.out.printf("%s es mas alta, mide: %d cm. En cambio %s mide solo %d",nombre2,altura2, nombre1, altura1);
        }
    }
}