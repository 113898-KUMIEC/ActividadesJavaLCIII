
package Interfaces;

public class ImplementarMySQL implements BaseDatos{

    @Override
    public void insertar() {
        System.out.println("Se inserto un dato");
    }

    @Override
    public void listar() {
        System.out.println("Listando datos");
    }

    @Override
    public void actualizar() {
        System.out.println("Se actualizo un dato");
    }

    @Override
    public void eliminar() {
        System.out.println("Se elimino el dato");
    }
    
}
