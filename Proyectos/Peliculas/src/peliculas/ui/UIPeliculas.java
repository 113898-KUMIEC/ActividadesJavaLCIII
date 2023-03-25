package peliculas.ui;

import javax.swing.JOptionPane;
import peliculas.modelo.IcatalogoPeliculas;
import peliculas.modelo.ImplementacionCatalogoPelicula;
import peliculas.modelo.Pelicula;

public class UIPeliculas {
    public static void interfazUsuario() {
        IcatalogoPeliculas peliculas = new ImplementacionCatalogoPelicula();
        Pelicula pelicula;
        
        CERRAR:
        while(true){
            
            String opcion = JOptionPane.showInputDialog(
                    null,
                    "1 - Insertar pelicula\n"
                  + "2 - Listar pelicula\n"
                  + "3 - Buscar pelicula\n"
                  + "4 - Salir",
                    "Ingrese una opcion",
                    3
            );
            
            int opcionInt  = 0;
            try{
                opcionInt = Integer.parseInt(opcion);
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null,
                        "Las opciones tienen que ser nuemeros enteros\n" + e,
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }catch(Exception e) {
                JOptionPane.showMessageDialog(null,
                        e,
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
            
            
            switch(opcionInt){
                case 1:
                    String nombrePelicula = JOptionPane.showInputDialog(
                    null,
                            "Ingrese el nombre de la pelicula",
                            "Entrada",
                            3
                    );
                    pelicula = new Pelicula(nombrePelicula);
                    peliculas.insertarPelicula(pelicula);
                    break;
                case 2:
                    peliculas.listarPelicula();
                    break;
                case 3:
                    String nombrePelicula1 = JOptionPane.showInputDialog(
                    null,
                            "Ingrese el nombre de la pelicula",
                            "Entrada",
                            3
                    );
                    
                    peliculas.buscarPelicula(nombrePelicula1);
                    break;
                case 4 :
                    break CERRAR;
                default : 
                    JOptionPane.showMessageDialog(null,
                            "OPCION INCORRECTA VUELVE A ENVIAR LA OPCION CORRECTA (1 O 4)",
                            "Error",
                            JOptionPane.ERROR_MESSAGE
                    );
            }
        }
        
    }
}
