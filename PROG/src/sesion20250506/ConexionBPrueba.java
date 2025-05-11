import java.io.File;
import java.sql.*;

public class ConexionBPrueba {
    public static void main(String[] args) {

        System.out.println("Ruta completa: " + new File("lib/sqlite-jdbc-3.49.1.0.jar").getAbsolutePath());

        // 1. Usa el cable mágico
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (Exception e) {
            System.out.println("¡Ups! No encontré el cable: " + e.getMessage());
            return;
        }

        // 2. Di la contraseña correcta
        String direccion = "jdbc:sqlite:C:\\Users\\thayr\\AppData\\Roaming\\DBeaverData\\workspace6\\.metadata\\sample-database-sqlite-1\\Chinook.db";
        
        // 3. Intenta abrir el libro
        try (Connection conn = DriverManager.getConnection(direccion)) {
            System.out.println("¡CONEXIÓN EXITOSA! 🎉");
            
            // Aquí puedes hacer cosas chulas como:
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT name FROM sqlite_master WHERE type='table'");
            
            while (rs.next()) {
                System.out.println("Tengo esta tabla: " + rs.getString("name"));
            }
        } catch (SQLException e) {
            System.out.println("¡Error! No pude abrir el libro:");
            System.out.println("1. ¿Está cerrado en DBeaver? (ciérralo)");
            System.out.println("2. ¿La ruta es correcta? " + direccion);
        }
    }
}

// javac -cp ".;lib/sqlite-jdbc-3.49.1.0.jar" ConexionBPrueba.java
// java -cp ".;lib/sqlite-jdbc-