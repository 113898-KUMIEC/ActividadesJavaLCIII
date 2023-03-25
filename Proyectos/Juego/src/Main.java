
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        EXTERNA:
        while(true){
            System.out.println("Juego de no se que");
            System.out.println("1. Facil \n"
                    + "2. medio\n"
                    + "3. dificil \n"
                    + "4. Salir");
            System.out.print("Ingrese una opcion: ");
            Scanner leer = new Scanner(System.in);
            
            char opcion = leer.next().charAt(0);
            
            
            switch(opcion){
                case '1':
                    jugar(10);
                    break;
                case '2':
                    jugar(7);
                    break;
                case '3':
                    jugar(4);
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
    
    static void jugar(int vidas){
        
        int numeroRandom = (int)(Math.random()*101);
        int numeroElegido = -1;
        
        Scanner leer = new Scanner(System.in);
        
        while(numeroElegido != numeroRandom){
            System.out.print("Ingrese un numero entre 1 y 100: ");
            
           numeroElegido = leer.nextInt();
           
           if(numeroRandom < numeroElegido){
               System.out.println("\n El numero es mas chico \n");
               vidas--;
           }
           else if(numeroRandom > numeroElegido){
               System.out.println("\n El numero es mas grande \n");
               vidas--;
           }
           
           if(vidas == 0){
               System.out.println(" No quedan mas vidas, el numero random era: " + numeroRandom);
               break;
           }
            System.out.println("----------------------");
            System.out.printf("| Te quedan %d vidas |", vidas);
            System.out.println("---------------------");
        }
        if(numeroRandom == numeroElegido){
            System.out.println("Felicidades ganaste!!");
        }
    }
}
