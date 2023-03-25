import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresar cantidad de horas trabajadas: ");
        int horas = leer.nextInt();

        System.out.println("Ingresar sueldo por hora: ");
        double sueldo = leer.nextDouble();



        if (horas > 180){
            double totalH = 180 * sueldo;
            int horasPasadas = horas - 180;
            double totalHorasAumento = (horasPasadas * sueldo) * 1.50;
            double totalAumento = totalH + totalHorasAumento;

            System.out.printf("Tiene que cobrar: %f de pesos",totalAumento);
        }else if (horas<=180){
            double total = horas * sueldo;
            System.out.printf("Tiene que cobrar: %f de pesos",total);
        }

    }
}