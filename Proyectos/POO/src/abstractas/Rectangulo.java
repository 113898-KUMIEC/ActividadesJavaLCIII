package abstractas;

public class Rectangulo extends  FiguraGeometrica {

    public Rectangulo(String tipoFigura) {
        super(tipoFigura);
    }
    
    @Override
    public void dibujar(){
        System.out.println("Se dibuja un: " + getClass().getSimpleName()); //se dibuja un rectangulo -- dice rectangulo porque lo que hace es sacar el nombre de la clase
    }
    
    
}
