public class Funciones {
    public static void main(String[] args) {
        
        saludar("Ezeke");
        
        System.out.println(sumar(10,20)); //se usa el mismo nombre de la funcion pero es para datos distintos
        System.out.println(sumar(4.5, 10.5));
        System.out.println(sumar(1,2,3,4,5,6,7));
        
        var nombre = "Maradona";
        saludar(nombre);
        
        var saludarmarado = saludarRetorno(nombre); //tengo que poner el resultado en otra variable para despues mostrarla econ el cout
        System.out.println(saludarmarado);
        
        System.out.println(saludarRetorno(nombre)); //otra forma de mostrarlo
        
        cuentaRegresiva(10);
        
        System.out.println(factorial(5));
    }
    
    static void saludar(String nombre){//funcion
        System.out.println("Hola " + nombre + ", como andas");
    }
    
    static int sumar(int a, int b){ //sobrcarga de funciones
        return a + b;
    }
    
    static double sumar(double a, double b){ // sobre carga de funciones
        return a + b;
    }
    
    static int sumar(int... numeros){ //suma de numeros indefinidos
        int suma = 0;
        for(int num:numeros){
            suma += num;
        }
        return suma;
    }
    
    static String saludarRetorno(String nombre){
        return "El nombre es: " + nombre;
    }
    
    static void cuentaRegresiva(int numero){

        if(numero> 0){
            System.out.println("el numero es: "+ numero);
            numero --;
            cuentaRegresiva(numero);
        }else{
            System.out.println("LLego hasta 0");
        }
    }
    
    static int factorial(int numero){//se multiplica todos los numero hasta 0|| por ejemplo 5x4x3x2x1 = 120
        
        if(numero>1){
            numero = numero * factorial(numero - 1);
        }
        return numero;
    }
    
}
