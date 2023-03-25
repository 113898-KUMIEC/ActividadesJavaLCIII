
package Test;

import abstractas.*;

public class TestAbstracta {
    public static void main(String[] args) {
        
        FiguraGeometrica f = new Rectangulo("Rectangulo");
        
        f.dibujar();
        
        f = new Cuadrado("Cuadrado");
        f.dibujar();
        
        
    }
}
