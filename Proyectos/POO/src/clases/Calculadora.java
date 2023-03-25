
package clases;

public  class Calculadora {
    
    public static final double PI = 3.1416;
    public static final int  a = 1;
    
    public static int sumar(int a, int b){
        return a + b;
    }
    
    public static double sumar(double a, double b){
        return a + b;
    }
    
    //Sobrecarga de metodos
    public int resta(int a, int b){
        return a - b;
    }
    public double resta(double a, double b){
        return a - b;
    }
}
