
package com.oregoom.mensajebien;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        
        
        MensajeDao mensajedao = new MensajeDao();
        
        Mensaje m = new Mensaje();
//        m.setMensaje("Aguante boca y aguante peron");
//        m.setAutor("Maradona");
//        mensajedao.eliminar(m);
        List<Mensaje> mensajes = mensajedao.seleccionar();
        
        for(Mensaje mensaje : mensajes){
            System.out.println(mensaje);
        }
        
        
    }
}
