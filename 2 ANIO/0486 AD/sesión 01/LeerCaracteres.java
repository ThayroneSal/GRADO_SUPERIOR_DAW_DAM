import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LeerCaracteres {
    public static void main(String[] args) {

        String ruta = "texto.txt";  //Fichero de texto de la carpeta
        File f = new File(ruta); // Creamos el objeto File
        try {
            FileReader fr = new FileReader(f); // Creamos el lector
            int c;
            while ((c = fr.read()) != -1) {
                char letra = (char) c; // Convertir el número a crácter
                System.out.print(letra); //Mostrar el carácter
            }
            fr.close(); // Cerrar el flujo de lectura
        } catch (IOException e) {
            System.out.println("Error al leer el fichero: " + e.getMessage());
        }
    }
}
