
package Interfaces;

public interface BaseDatos {
    
    int MAXIMO_DATOS = 10; //ES RECOMENDABLE USAR MAYUSCULAS E INDICAR EL VALOR
    
    void insertar();
    void listar();
    void actualizar();
    void eliminar();
    
}
