import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero: ");
        int numero = leer.nextInt();
        
        if(esPrimo(numero)){
            System.out.println("=====================");
            System.out.println("El valor es primo");
            System.out.println("=====================");
        }else{
            System.out.println("=====================");
            System.out.println("El valor no es primo");
            System.out.println("=====================");
        }
        
    }
    
    /**
     * <h2>Funcion esPrimo</h2>
     * Descripcion: detecta si un numero es primo o no
     * @param numero Recibe un numero entero
     * @return Retorna un valor booleano indicando si el numero indicado es primo o no
     */
    
    static boolean esPrimo(int numero){
        
        int contador = 0;
        
        int[] numeros = new int[numero];
        
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = i+1;
        }
        
        for(int i : numeros){ //si el numero se puede divir entre 1 y entre si mismo quiere decir que es primo
            if(i == 1 || i == numero){
                continue;
            }
            if(numero % i == 0){ //si el numero cumple esta condicion quiere decir que no es primo por lo que el contador aumenta a 1
                contador++;
            }
        }
        
        return contador == 0; 
    }
}
