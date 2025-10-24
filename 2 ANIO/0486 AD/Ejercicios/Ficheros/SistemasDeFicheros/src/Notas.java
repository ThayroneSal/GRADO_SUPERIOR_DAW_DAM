import java.io.BufferedWriter;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Notas {

    /* Ejercicio 2. Sección 2: Ficheros de Texto.
 * Instrucciones paso a paso:
 * Crea un nuevo archivo Java llamado Notas.java.
 * Pide al usuario que introduzca 3 frases desde teclado (puedes usar Scanner).
 * Escribe esas 3 frases en un fichero llamado frases.txt (una por línea).
 * Luego, vuelve a abrir ese mismo fichero y lee su contenido línea a línea.
 * Muestra cada línea por pantalla con un número delante */
    
 public static void main(String[] args) throws IOException { // seria conveniente revisar las Exceptions me he liado un monton con ellas me daba error todo el rato. hasta que tuve que pedir ayuda a IA.
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Escribe 3 frases.");

    String ruta = "SistemasDeFicheros\\src\\frases.txt";

    try (BufferedWriter bw = new BufferedWriter(new FileWriter(ruta))){
        for(int i = 1; i <= 3; i ++){
            System.out.println("Introduce la frase numero " + i + ": ");
            String linea = sc.nextLine();
            bw.write(linea);
            bw.newLine();
        }
    }

    System.out.println("\nContenido del fichero:");

    try (BufferedReader br = new BufferedReader(new FileReader(ruta))){
        String lineaa;
        int num = 1;
        while ((lineaa = br.readLine()) != null){
            System.out.println(num + ": " + lineaa);
            num++;
        }
    }
   sc.close();
   // he intentado cerra el br.close(); y bw.close(); pero me daba error, no se a que se debe.
  

 }
}
