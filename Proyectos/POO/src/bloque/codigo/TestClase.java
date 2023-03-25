package bloque.codigo;

public class TestClase {
    public static void main(String[] args) {
        
        Persona p = new Persona();
        System.out.println(p);//se ejecuta el bloque estatico ya que es la primera vez
        
        Persona p2 = new Persona();
        System.out.println(p2);//no se ejecuta el bloque estatico
    }
    
}
