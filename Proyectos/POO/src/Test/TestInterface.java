
package Test;

import Interfaces.*;

public class TestInterface {
    public static void main(String[] args) {
        
        BaseDatos bd = new ImplementarMySQL(); //se llama a la interface y se le asigna un objeto (en este caso implementarmysql)
        
        bd.eliminar();
        bd.actualizar();
    }
}
