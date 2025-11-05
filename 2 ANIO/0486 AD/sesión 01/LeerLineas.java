import java.io.*;

public class LeerLineas {
    public static void main(String[] args) {
        String ruta = "texto.txt";
        File f = new File(ruta);
        try {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println("Línea leída: " + linea);
            }
            br.close(); // Cierra BufferedReader y FileReader
        } catch (IOException e) {
            System.out.println("Error al leer el fichero: " + e.getMessage());
        }
    }
}
