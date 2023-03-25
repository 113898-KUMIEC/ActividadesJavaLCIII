import java.util.Scanner;

public class Esvocal {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una letra: ");
        char c = leer.next().charAt(0);
        
        if(c == 'a' || c == 'A'){
            System.out.printf("%s es vocal\n", c);
        }else if(c == 'e' || c == 'E'){
            System.out.printf("%s es vocal\n", c);
        }else if(c == 'i' || c == 'I'){
            System.out.printf("%s es vocal\n", c);
        }else if(c == 'o' || c == 'O'){
            System.out.printf("%s es vocal\n", c);
        }else if(c == 'u' || c == 'U'){
            System.out.printf("%s es vocal\n", c);
        }else{
            System.out.println("No es una vocal");
        }
    }
}
