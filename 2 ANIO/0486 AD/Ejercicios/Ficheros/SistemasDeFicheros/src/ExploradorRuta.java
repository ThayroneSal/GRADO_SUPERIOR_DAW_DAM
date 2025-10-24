import java.io.File;

public class ExploradorRuta {

    /*Ejercicio 1. Sección 1: Sistemas de Ficheros.
 * Intrucciones paso a paso:
 * Crea un nuevo fichero Java llamado ExploraRuta.java en tu carpeta de la asignatura.
 * Pide al usuario (por arumento) una ruta de carpeta o fichero.
 * Si no existe, que muestre el mensaje: "La ruta no existe"
 * Si es un fichero, que muestre:
 * Su nombre.
 * Su tamaño en bytes.
 * Si se puede leer y excribir.
 * Si es un directorio, que muestre:
 * Cuantos elementos tiene.
 * El nombre de cada uno */

 public static void main(String[] args) {

    // no entiendo a que te refieres pide al usuario (por argumento) una ruta.
    String ruta = "D:\\9 - GRADO SUPERIOR\\05-PROGRAMACION\\GRADO_SUPERIOR_DAW_DAM\\GRADO_SUPERIOR_DAW_DAM\\2 ANIO\\0486 AD\\Ejercicios\\Ficheros\\SistemasDeFicheros\\src\\ExploradorRuta.java";
    
    File f = new File(ruta);

    if (!f.exists()){
        System.out.println("--ERROR--El elemento no existe");
    }

    if (f.isFile()){
        System.out.println("--Exito-- es un fichero");
        System.out.println("Nombre: " + f.getName());
        System.out.println("Tamaño: " + f.length() + " bytes");
        if (f.canRead()){
            System.out.println("Sí, se puede leer");
        }else {
            System.out.println("No, no se puede leer");
        }
        if (f.canWrite()){
            System.out.println("Sí, se puede escribir");
        }else{
            System.out.println("No, no se puede escribir");
        }
        
    }

    System.out.println("---DIRECTORIO---");

    if(f.isDirectory()){
        System.out.println("---Es un directorio--- \n contenido:");
        String[] contenido = f.list();
        for (String nombre : contenido){
            System.out.println("- " + nombre);
        }
        }else{
            System.out.println("El directorio no existe.");
    }


 }
}
