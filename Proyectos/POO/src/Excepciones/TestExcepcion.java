package Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestExcepcion {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        try{
            
            System.out.println("Ingrese numero 1: ");
            int n1 = leer.nextInt();
            System.out.println("Ingrese numero 2: ");
            int n2 = leer.nextInt();
        
            int resultado = dividir(n1, n2);
        
            System.out.println(resultado);
        }catch(InputMismatchException e){
            System.err.println("Ocurrio un error: ingrese solo numeros enteros");
            e.printStackTrace(System.out);
        }catch(OperadorExcepcion e){
            System.err.println("Ocurrio un error: " + e.getMessage());
            e.printStackTrace(System.out);
        }catch(Exception e){
            e.printStackTrace(System.out);
        }finally{
            System.out.println("Se reviso la division");
        }

        
    }
    //clase 95
    static int dividir(int n, int d){
        if(d == 0){
            throw new OperadorExcepcion("dividir entre 0");
        }
        return n /d;
    }
}
