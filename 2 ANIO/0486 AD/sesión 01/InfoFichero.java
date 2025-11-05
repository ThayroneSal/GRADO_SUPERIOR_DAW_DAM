import java.io.File;

public class InfoFichero {
    public static void main(String[] arg){
        //Cada uno pondrá la ruta absoluta de su carpeta
        String ruta = "C:\\Users\\0021090\\Escritorio\\Proyecto_Ficheros.zip";
        
        File f = new File(ruta);

        if (f.exists()) {
            System.out.println("El elemento existe, es un EXITO");

            if (f.isFile()){
                System.out.println("Es un fichero, OLÉ");
                System.out.println("Nombre: " + f.getName());
                System.out.println("Ruta absoluta: " + f.getAbsolutePath());
                System.out.println("Tamaño: " + f.length() + " bytes");
            }

            if (f.isDirectory()){
                System.out.println("Es un directorio, OHHH");
                String[] contenido = f.list();
                for (String nombre : contenido) {
                    System.out.println(" - " + nombre);
                }
            }
        } else {
            System.out.println("El fichero o directorio no existe, BUUM");
        }
    }
}
