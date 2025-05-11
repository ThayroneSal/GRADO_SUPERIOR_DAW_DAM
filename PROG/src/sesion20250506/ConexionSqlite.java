import java.sql.*;

public class ConexionSqlite {
    public static void main(String[] args) {
        // Parámetros de conexión
        String url = "jdbc:sqlite:C:\\Users\\thayr\\AppData\\Roaming\\DBeaverData\\workspace6\\.metadata\\sample-database-sqlite-1\\Chinook.db";

        try {
            // Establecer conexión
            Connection con = DriverManager.getConnection(url);
            System.out.println("Conexión establecida con éxito.");

            // Aquí podrías hacer una consulta, por ejemplo:
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT ArtistId, Name FROM Artist");

            while (rs.next()) {
                int idArtista = rs.getInt(1); // Por posición
                String nombre = rs.getString(2);
                System.out.println("Id: " + idArtista + " - Nombre: " + nombre);
            }

            // Cerrar conexión
            con.close();
        } catch (SQLException e) {
            System.out.println("Error en la conexión:");
            e.printStackTrace();
        }
    }
}
