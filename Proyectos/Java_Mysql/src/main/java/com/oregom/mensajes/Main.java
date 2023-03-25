package com.oregom.mensajes;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        
        //InsertarRegistros("Hola desde java", "mi amigo Roel");
        listarRegistros();
        //EditarRegistros("Actualizacion desde java", "Riquelme", 2);
        //listarRegistros();
        //EliminarRegistros(2);
        //listarRegistros();
    }
    
    static void listarRegistros() throws SQLException{
        Connection cnn = DriverManager.getConnection(
                "jdbc:mysql://localhost/mensajes_db?serverTimezone=UTC", 
                "root",
                "123456"
        );
        
        System.out.println("Conexion exitosa");
    
        String sql = "select * from mensajes";
        PreparedStatement ps = cnn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        
        while(rs.next()){
            int id = rs.getInt("id_mensaje");
            String mensaje = rs.getString("mensaje");
            String autor = rs.getString("autor");
            String fecha = rs.getString("fecha");
            
            System.out.printf("%d, %s, %s, %s \n", id, mensaje, autor, fecha);
        }
        
        rs.close();
        ps.close();
        cnn.close();
    }
    
    static void InsertarRegistros(String mensaje, String autor) throws SQLException{
        Connection cnn = DriverManager.getConnection(
                "jdbc:mysql://localhost/mensajes_db?serverTimezone=UTC", 
                "root",
                "123456"
        );
        
        System.out.println("Conexion exitosa");
    
        String sql = "insert into mensajes(mensaje, autor, fecha)values(?, ?, current_time())";
        PreparedStatement ps = cnn.prepareStatement(sql);
        ps.setString(1, mensaje);
        ps.setString(2, autor);
        ps.executeUpdate();
        
        ps.close();
        cnn.close();
    }

    static void EditarRegistros(String mensaje,String autor,int id) throws SQLException{
        Connection cnn = DriverManager.getConnection(
                "jdbc:mysql://localhost/mensajes_db?serverTimezone=UTC", 
                "root",
                "123456"
        );
    
        String sql = "update mensajes set mensaje =?, autor=? where id_mensaje = ?";
        PreparedStatement ps = cnn.prepareStatement(sql);
        ps.setString(1, mensaje);
        ps.setString(2, autor);
        ps.setInt(3, id);
        ps.executeUpdate();
        
        ps.close();
        cnn.close();
    }

        static void EliminarRegistros(int id) throws SQLException{
        Connection cnn = DriverManager.getConnection(
                "jdbc:mysql://localhost/mensajes_db?serverTimezone=UTC", 
                "root",
                "123456"
        );
    
        String sql = "delete from mensajes where id_mensaje = ?";
        PreparedStatement ps = cnn.prepareStatement(sql);
        ps.setInt(1, id);
        ps.executeUpdate();
        
        ps.close();
        cnn.close();
    }
}
