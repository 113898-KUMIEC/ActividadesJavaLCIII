package peliculas.modelo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ImplementacionCatalogoPelicula implements IcatalogoPeliculas{
    
    private final ArrayList<String> listarPeliculas;

    public ImplementacionCatalogoPelicula() {
        this.listarPeliculas = new ArrayList<>();
    }
    
    
    @Override
    public void insertarPelicula(Pelicula nombrePelicula) {
        this.listarPeliculas.add(nombrePelicula.toString());
    }

    @Override
    public void listarPelicula() {
        JOptionPane.showMessageDialog(
                null, 
                this.listarPeliculas,
                "Lista de Peliculas",
                JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public void buscarPelicula(String nombrePelicula) {
        
        String resultado = null;
        for(var pelicula : this.listarPeliculas){
            if(pelicula.equals(nombrePelicula)){
                resultado = pelicula;
                break;
            }
            else{
                resultado = pelicula;
            }
        }
        if(nombrePelicula.equals(resultado)){
            JOptionPane.showMessageDialog(
                    null, 
                    "Resultado - > " + resultado,
                    "Buscar pelicula",
                    JOptionPane.QUESTION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(
                    null, 
                    "No se encontro la pelicula -> " + nombrePelicula,
                    "Buscar Pelicula",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
