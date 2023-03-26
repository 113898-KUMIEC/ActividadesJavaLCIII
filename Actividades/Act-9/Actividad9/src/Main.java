import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Cuantos numeros desea ingresar?");
        int n = leer.nextInt();

        cantidadNumeros(n);
    }

    static void cantidadNumeros(int n){
        int contador = 0;
        int contadorMayorCinco = 0;
        Scanner leer = new Scanner(System.in);
        while (n != contador){
            contador ++;
            System.out.printf("Ingrese numero %d: ",contador);
            int nc = leer.nextInt();

            if (nc > 5){
                contadorMayorCinco++;
            }
        }

        System.out.println("La cantidad de numeros mayores a 5 son: " + contadorMayorCinco);
    }
}