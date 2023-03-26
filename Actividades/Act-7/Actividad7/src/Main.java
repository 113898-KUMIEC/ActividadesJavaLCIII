import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese cantidad de km realizados: ");
        int km = leer.nextInt();

        if (km <= 200){
            System.out.println("Debe abonar 300 pesos");
        }
        else if (km > 200 && km < 1000) {

            int kmExcedente = km - 200;
            int totalExcedente = kmExcedente * 5;
            int total = totalExcedente + 300;

            System.out.printf("Debe abonar: %d pesos",total);
        }
        else if (km >= 1000) {

            int kmExcedente1000 = km - 999;
            int totalExcedente1000 = kmExcedente1000 * 10;
            int total1000 = totalExcedente1000 + 4295;

            System.out.printf("Debe abonar: %d pesos",total1000);
        }
    }
}