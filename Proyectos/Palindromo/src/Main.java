import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una palabra: ");
        String cadena = leer.nextLine();
        
        if(esPalindromo(cadena)){
            System.out.println("=====================");
            System.out.println("La palabra es palindromo");
            System.out.println("=====================");
        }else{
            System.out.println("=====================");
            System.out.println("No es palindromo");
            System.out.println("=====================");
        }
    }
    
    static boolean esPalindromo(String cadena){
        
        cadena = cadena.replace(" ", ""); //le saco los espacios a la palabra
        cadena = cadena.toLowerCase(); //hacemos todo en minuscula
        
        StringBuilder cadenaInvertida = new StringBuilder();
        
        for(int i = cadena.length()-1; i>= 0; i--){
            cadenaInvertida.append(cadena.charAt(i));
        }
        
        return cadena.equals(cadenaInvertida.toString());
    }
}
