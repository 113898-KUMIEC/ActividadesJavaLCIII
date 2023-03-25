package Test;

import herencia.*;
import java.util.Date;

public class TestHerencia {
    public static void main(String[] args) {
        
        Persona p = new Persona("Ezeke");
        
        System.out.println(p.obtenerDetalle());
        
        imprimer(p);//funcion que recibe como parametro un objeto (persona, empleado, cliente)
        //----------------------------------------
        Empleado e = new Empleado(5000, "Ezeke");
        
        System.out.println(e.obtenerDetalle());
        
        imprimer(e);//funcion que recibe como parametro un objeto (persona, empleado, cliente)
        //----------------------------------------
        var fecha = new Date();
        
        Clientes c = new Clientes(fecha, true, "Ezeke", 25, 'M', "la granja");
       
        System.out.println(c.obtenerDetalle());
        imprimer(c);//funcion que recibe como parametro un objeto (persona, empleado, cliente)
        
        determinarTipo(c);
        
        String nombre = "Ezeke";
        determinarTipo(nombre); 
        
        //conversion de Objetos
        //conversion Downcasting (se conviert un objeto de la clase padre a un objeto de la clase hija)
        Persona p1 = new Empleado(3000, "Ezeke");
        Empleado e1 = (Empleado) p1; //convierto p1 de persona a empleado
        System.out.println(e1.obtenerDetalle());
        
        //conversion Upcasting (convertir el objeto de la clase hija a el de la clase padre)
        
        Persona p2 = e1;
        System.out.println(p2.obtenerDetalle()); 
        
        Persona p3 = new Persona("Maradona", 62, 'M', "La granja");
        Persona p4 = new Persona("Maradona", 62, 'M', "La granja");
        
        System.out.println(p3.equals(p4)); //el equal se tiene que poner en en Personas (metodo)
        
        System.out.println(p3.hashCode());//devuelve el numero hashcode
        System.out.println(p4.hashCode());
        
        if(p3.hashCode() == p4.hashCode()){
            System.out.println("Son iguales");
        }else{
            System.out.println("No son iguales");
        }
        
    }
    
    public static void imprimer(Persona p){
        System.out.println(p.obtenerDetalle());
    }
    
    public static void determinarTipo(Object objeto){
        
        if(objeto instanceof Empleado){
            System.out.println("Es de tipo Empleado");
        }else if (objeto instanceof Clientes){
            System.out.println("Es de tipo Cliente");
        }else if(objeto instanceof Persona){
            System.out.println("Es de tipo Persona");
        }else if(objeto instanceof Object){
            System.out.println("Es de tipo object");
        }
    }
}
