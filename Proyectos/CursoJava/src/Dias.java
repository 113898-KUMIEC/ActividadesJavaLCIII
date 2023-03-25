
import java.util.Scanner;

public class Dias {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero de la semana: ");
        
        int dia = leer.nextInt();
        
        String nombreDia = null;
        
        switch(dia){
            case 1:
                nombreDia = "Lunes";
                break;
            case 2:
                nombreDia = "Martes";
                break;
            case 3:
                nombreDia = "Miercoles";
                break;
            case 4:
                nombreDia = "Jueves";
                break;
            case 5:
                nombreDia = "Viernes";
                break;
            case 6:
                nombreDia = "Sabado";
                break;
            case 7:
                nombreDia = "Domingo";
                break;    
            default:
                System.out.println("El numero ingresado es inccorrecto");
        }
        
        System.out.println("El dia es: " + nombreDia);
    }
}
