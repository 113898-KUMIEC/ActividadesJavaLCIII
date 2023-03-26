import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresar tiempo en segundos del ganador:");
        int tiempoGanador = leer.nextInt();

        int cantidad = calcularCuantosDisputan(tiempoGanador);

        System.out.println("la cantidad de corredores clasificados son: " + cantidad);

    }

    static int calcularCuantosDisputan(int tiempoGanador){
        int contador = 1;
        int corredor = 0;
        Scanner leer = new Scanner(System.in);

        double maxTiempo = tiempoGanador * 1.15;

        while (contador != 10){
            System.out.println("Ingresar tiempo del corredor: " + contador);
            int c = leer.nextInt();

            if (c < maxTiempo){
                corredor++;
            }

            contador++;
        }

        return corredor;
    }
}