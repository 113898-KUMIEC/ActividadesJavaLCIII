
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        EXTERNA: //ANOTACION PARA QUE EN EL BREAK VENGA PARA ACA
        while(true){
            System.out.println("CONVERSOR DE MONEDAS");
            System.out.println("1. pesos Argentinos a dolares \n"
                    + "2. Pesos peruanos a dolares \n"
                    + "3. pesos mexicanos a dolares \n"
                    + "4. Salir");
            System.out.print("Ingrese una opcion: ");
            Scanner leer = new Scanner(System.in);
            
            char opcion = leer.next().charAt(0);
            
            
            switch(opcion){
                case '1':
                    convertir(187.97, "Argentino");
                    break;
                case '2':
                    convertir(3.58, "Peruanos");
                    break;
                case '3':
                    convertir(18.89, "Mexicanos");
                    break;
                case '4':
                    System.out.println("Chau");
                    break EXTERNA;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        }
    }
    
    static void convertir(double valorDolar, String pais){
        
        Scanner leer = new Scanner(System.in);
        System.out.printf("Ingrese la cantidad de pesos %s :", pais);
        
        double cantidadMoneda = leer.nextDouble();
        
        double dolares = cantidadMoneda/ valorDolar;
        
        dolares = (double) Math.round(dolares*100d)/100;
        
        System.out.println("--------------------------------");
        System.out.println("| Tienes $"+ dolares + " Dolares |");
        System.out.println("--------------------------------");
        
        
    }
}
