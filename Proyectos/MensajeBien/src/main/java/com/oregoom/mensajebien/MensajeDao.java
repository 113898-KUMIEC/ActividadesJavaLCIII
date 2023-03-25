package com.oregoom.mensajebien;

import static com.oregoom.mensajebien.Conexion.*;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MensajeDao {

    private Connection cnn = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private Mensaje mensaje;

    public List<Mensaje> seleccionar() { //vamos a poner todos los datos del sql a una lista y eso mismo va a retornar
        String sql = "Select * from mensajes";

        List<Mensaje> mensajes = new ArrayList<>();
        try {
            this.cnn = getConexion();
            this.ps = this.cnn.prepareStatement(sql);
            this.rs = this.ps.executeQuery();

            while (this.rs.next()) {//recorre todos los registros 

                int id = this.rs.getInt("id_mensaje");
                String mensaje = this.rs.getString("mensaje");
                String autor = this.rs.getString("autor");
                String fecha = this.rs.getString("fecha");

                this.mensaje = new Mensaje(id, mensaje, autor, fecha);
                mensajes.add(this.mensaje);

            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MensajeDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                cerrar(this.rs);
                cerrar(this.ps);
                cerrar(this.cnn);

            } catch (SQLException ex) {
                Logger.getLogger(MensajeDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return mensajes;
    }

    public int insertar(Mensaje mensaje) { //vamos a poner todos los datos del sql a una lista y eso mismo va a retornar
        String sql = "insert into mensajes(mensaje, autor, fecha) values (?,?,current_time())";

        int registro = 0;

        try {
            this.cnn = getConexion();
            this.ps = this.cnn.prepareStatement(sql);

            this.ps.setString(1, mensaje.getMensaje());
            this.ps.setString(2, mensaje.getAutor());
            registro = this.ps.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MensajeDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                cerrar(this.ps);
                cerrar(this.cnn);
            } catch (SQLException ex) {
                Logger.getLogger(MensajeDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return registro;
    }

    public int update(Mensaje mensaje) { //vamos a poner todos los datos del sql a una lista y eso mismo va a retornar
        String sql = "update mensajes set mensaje = ?, autor = ? where id_mensaje = ?";

        int registro = 0;

        try {
            this.cnn = getConexion();
            this.ps = this.cnn.prepareStatement(sql);

            this.ps.setString(1, mensaje.getMensaje());
            this.ps.setString(2, mensaje.getAutor());
            this.ps.setInt(3, mensaje.getId());

            registro = this.ps.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MensajeDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                cerrar(this.ps);
                cerrar(this.cnn);
            } catch (SQLException ex) {
                Logger.getLogger(MensajeDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return registro;
    }

    public int eliminar(Mensaje mensaje) { //vamos a poner todos los datos del sql a una lista y eso mismo va a retornar
        String sql = "delete from mensajes where id_mensaje = ?";

        int registro = 0;

        try {
            this.cnn = getConexion();
            this.ps = this.cnn.prepareStatement(sql);

            this.ps.setInt(1, mensaje.getId());

            registro = this.ps.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MensajeDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                cerrar(this.ps);
                cerrar(this.cnn);
            } catch (SQLException ex) {
                Logger.getLogger(MensajeDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return registro;
    }
}
