import java.sql.*;

public class ConexionMySQL {
    public static void main(String[] args) {
        // Parámetros de conexión
        String url = "jdbc:mariadb://localhost:3306/mcgrawpeliculas";
        String usr = "root";
        String pwd = "";

        try {
            // Establecer conexión
            Connection con = DriverManager.getConnection(url, usr, pwd);
            System.out.println("Conexión establecida con éxito.");

 
            // Cerrar conexión
            con.close();

        } catch (SQLException e) {
            System.out.println("Error en la conexión:");
            e.printStackTrace();
        }
    }
}
 
