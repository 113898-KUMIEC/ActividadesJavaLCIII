
package peliculas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import peliculas.ui.UIPeliculas;

public class Main {
    public static void main(String[] args) {
        
        //ArrayList<String> meses = new ArrayList<>();
        
        //meses.add("Enero");
        //meses.add("Febrero");
        //meses.add("Marzo");
        //System.out.println(meses);
        
        //for(String dato : meses){
        //    System.out.println(dato);
        //}
        
        //meses.forEach(dato ->{ //otra forma de hacer un foreach
        //    System.out.println(dato);
        //});
        
        //String valor = JOptionPane.showInputDialog(
        //        null,
        //        "Ingrese un texto",
        //        "Entrada",
        //        2);
        
        //JOptionPane.showMessageDialog(
        //        null, 
        //        valor,
        //        "Catalogo de peliculas",
        //        JOptionPane.INFORMATION_MESSAGE);
        
        UIPeliculas.interfazUsuario();
    }
    
}
