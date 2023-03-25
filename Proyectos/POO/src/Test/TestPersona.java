package Test;

import encapsulamiento.*;

public class TestPersona {
    public static void main(String[] args) {
        Persona p = new Persona("Ezeke", 19, false);
        //p.nombre     no se puede porque esta en privado
        
        String estado = p.toString();
        
        System.out.println(estado);
        
        System.out.println(p.getNombre()); //ahora si porque el metdoo get esta publico esto es para el encapsulamiento
        
        p.setEdad(20);
        System.out.println(p.getEdad());
        
        System.out.println(p);
    }
}
