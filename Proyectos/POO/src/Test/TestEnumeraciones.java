
package Test;

import enumeraciones.*;

public class TestEnumeraciones {
    public static void main(String[] args) {
        System.out.println(Dias.LUNES);
        System.out.println(Dias.DOMINGO);
        
        System.out.println(Continentes.AMERICA); //muestra el nombre
        System.out.println(Continentes.AMERICA.getPaises()); //muestra cuantos paises tiene 
        
        Continentes c = Continentes.AMERICA;
        System.out.println(c.getPaises()); //acceder de forma mas directa
    
        
    }
}
