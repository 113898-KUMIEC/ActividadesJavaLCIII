package clases;


public class Persona {
    
    public String nombre;
    public int edad;
    
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    public Persona(){
        nombre= "";
        edad = 0;
    }
    
    public void mostrarDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
    
    
}
