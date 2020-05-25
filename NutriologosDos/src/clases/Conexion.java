package clases;
import java.sql.*;

public class Conexion {
    
    public static Connection conectar() {
        
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/nutriolodos_bd", "root", "");
            return cn;
        }
        catch (SQLException e) {
            System.err.println("Error en conexión local " + e);
        }
        
        return null;
    }
}
