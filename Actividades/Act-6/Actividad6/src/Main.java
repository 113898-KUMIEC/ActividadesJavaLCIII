import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresar año: ");
        int anio = leer.nextInt();

        if ((anio % 4 == 0) && (anio % 100 != 0) || (anio % 400 == 0)){
            System.out.println("El año es bisiesto");
        }else{
            System.out.println("El año no es bisiesto");
        }

    }
}