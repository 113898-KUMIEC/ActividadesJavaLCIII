
package herencia;

import java.util.Objects;

public class Persona {
    
    protected String nombre;
    protected int edad ;
    protected char genero;
    protected String direccion;

    public Persona() {
        
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona(String nombre, int edad, char genero, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.direccion = direccion;
    }
    
    public String obtenerDetalle(){
        return "Nombre : %s, Edad: %d ".formatted(this.nombre,this.edad);
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getGenero() {
        return this.genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() { //generado con stringbuilder (apretar click derecho, generar codigo, tostring, generar con stringbuilder)
        StringBuilder sb = new StringBuilder(); //stringbuilder es como un lugar donde escribir texto
        sb.append("Persona{");
        sb.append("nombre=").append(this.nombre);
        sb.append(", edad=").append(this.edad);
        sb.append(", genero=").append(this.genero);
        sb.append(", direccion=").append(this.direccion);
        sb.append('}');
        return sb.toString(); //retorna el objeto creado sb
    }

    @Override
    public int hashCode() {//realiza una operacion y devuelve un numero unico de ese objeto
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.nombre);
        hash = 11 * hash + this.edad;
        hash = 11 * hash + this.genero;
        hash = 11 * hash + Objects.hashCode(this.direccion);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (this.edad != other.edad) {
            return false;
        }
        if (this.genero != other.genero) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.direccion, other.direccion);
    }

    
    
    
    
}
