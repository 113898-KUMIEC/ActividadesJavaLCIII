
package bloque.codigo;

public class Persona {
    private final int idPersona;
    private static int contadorPersona;
    
    static { //bloque para inicializar un codigo de atributos estaticos
        System.out.println("Ejecucion bloque estatico");
        ++Persona.contadorPersona;
        //idPersona = 10 NO SE PUEDE LLAMAR YA QUE NO ES ESTATICO
    }
    
    {//atributos no estaticos o bien llamados DINAMICOS
        
        System.out.println("Ejecucion bloque no estatico o de codigo");
        this.idPersona = Persona.contadorPersona++;
    }

    public Persona() {
        System.out.println("Ejecucion del contructor");
    }

    public int getIdPersona() { //solo un metodo get y no set ya que idPersona es final por lo que no se puede actualizar
        return idPersona;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("idPersona=").append(idPersona);
        sb.append('}');
        return sb.toString();
    }

    
}
