
package persistenciadatos;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ManejoArchivos {
    
    public static void CrearArchivo(String nombreArchivo){
        
        File archivo = new File(nombreArchivo);
        
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
            System.out.println("Se creo el archivo");
        } 
        catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
        public static void EscribirArchivo(String nombreArchivo, String contenido){
        
        File archivo = new File(nombreArchivo);
        
        try {
            PrintWriter salida;
            salida = new PrintWriter(new FileWriter(archivo,true)); 
            salida.println(contenido);
            salida.close();
            System.out.println("Se escribio el archivo");
        } 
        catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
        catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
        public static void LeerArchivo(String nombreArchivo){
        
        File archivo = new File(nombreArchivo);
        
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String lectura = entrada.readLine();
            while(lectura != null){
                System.out.println(lectura);
                lectura = entrada.readLine();
            }
            entrada.close();
            
        } 
        catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
        catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
        
        public static void EliminarArchivo(String nombreArchivo){
        
        File archivo = new File(nombreArchivo);
        
        archivo.delete();
        System.out.println("Se elimino el archivo");
    }
        
}
