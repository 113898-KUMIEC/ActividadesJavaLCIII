
import java.util.Scanner;
public class Main {
    public static void main(String [] args){
        
        String nombre;
        int a, b, c;
        
        nombre = "Ezeke";
        a = 1;
        b = 2;
        c = 10;
        int edad = 19;
        int resultado = a+b+c;
        
        System.out.println(nombre); //sout + tab
        System.out.println("Suma: " + resultado );
        
        //nueva forma de definir variables
        var primerNombre = "Eze ";
        var NuevaEdad = 15;
        var Nombreyedad = primerNombre + NuevaEdad;
        System.out.println(Nombreyedad);
        
        //-------------------------------------------
        //clase 21- Entrada de datos (importo la clase import java.util.Scanner; arriba de todo)
        
        Scanner leer = new Scanner(System.in); //creo el objeto de la clase scanner
        
        //System.out.print("Ingrese su Nombre: ");
        //String nombreScanner = leer.nextLine(); //esto es como para poner el nombre xd
        
        //System.out.print("Ingrese su edad: ");
        
        //int edadScanner = leer.nextInt();
        
        //System.out.println("Nombre "+ nombreScanner + " Edad: " + edadScanner);
        //System.out.printf("Nombre %s Edad %d", nombreScanner, edadScanner);
        
        //Clase 26- Condicion if 
        System.out.println("true or false");
        boolean vof = leer.nextBoolean();
        if(vof){
            System.out.println("Se cumple la condicion");
        }
        else
        {
            System.out.println("No se cumple la condicion");
        }
        
        System.out.println("Ingrese un numero: ");
        int n = leer.nextInt();
        
        if (n%2 == 0){
            System.out.println("Es par");
        }
        else{
            System.out.println("Es impar");
        }
        System.out.println(8%2);
        
        //clase 32- bucle for
        
        int num = 8;
        for(int i = 0; i<=10; i++){
            System.out.printf("%d x %d = %d", num, i,(num * i));
        }
        
        //clase 33- break y continue
        for(int i = 0; i<=10; i++){
            System.out.println("Valor de i: " + i);
            if(i == 5 ){ //cuando i llega a 5 el bucle se corta
                System.out.println("Detener blucle for");
                //break;
                continue;//salta a la siguiente ejecucion
            }
            System.out.println("No me ejecutare en 5"); //cuando llega a 5 no va a aparecer este mensaje
            
        }
        
        //clase 34- matriz o array
        
        //String nombres[];
        
        //nombres = new String[3];
        
        //nombres[0] = "Riquelme";
        //nombres[1] = "Palermo";
        //nombres[2] = "Maradona";
        
        //System.out.println(nombres[2]); //muestra "Maradona"
        
        
        //nombres[1] = "Oscar cordoba"; //actualizo el nombre en el puesto 1
        
        //System.out.println(nombres);//muestra la memoria del array
        
        //System.out.println(nombres.length); //nos muestra cuantos datos tiene almacenados
        
        int[] array1 = {1,2,3,4,5}; //otra forma de definir un array
        
        System.out.println(array1[0]); //nos devuelve el 1
        
        int[] array2 = new int[5]; //otra forma de definir un array
        
        //clase 35 - foreach
        
        String[] nombres = {"Riquelme", "Maradona", "Palermo", "Langoni", "Oscar cordoba"};
        
        int c1 = 0;
        
        while(c1 < nombres.length){ //nos muestra todos los nombres
            System.out.println(nombres[c1]);
            c++;
        }
        
        for(int i = 0; i < nombres.length; i++){ //muestra lomismo q el anterior
            System.out.println(nombres[i]);
        }
        
        for(String dato:nombres){ //este seria el foreach
            System.out.println(dato);
        }
        
        //clase 36 matriz multidimencional
        
        int[][] x = new int[2][3];
        
        x[0][0] = 1;
        x[0][1] = 2;
        x[0][2] = 3;
        
        x[1][0] = 4;
        x[1][1] = 5;
        x[1][2] = 6;
        
        for(int[] matrizInterna:x ){//me muestra todos los datos
            for(int dato:matrizInterna){
                System.out.println(dato);
            }
        }
        
        int[][] x1 = { //definir una matriz ya con asignaccion
            {1,2,3},
            {4,5,6},
            {7,8},
        };
        
        int[][][] x2 = { //array tridimencional
        {
            {1,2,3},
            {4,5,6},
        },
        {
            {-1,-2,-3},
            {-4,-5,-6},
        },
        };
        for(int[][] matriz2D:x2 ){ //mostrar los datos del array tridimencional
            for(int[] matriz1D:matriz2D){
                for(int dato:matriz1D){
                    System.out.println(dato);
                }
            }
        }
        
        
    }
}
