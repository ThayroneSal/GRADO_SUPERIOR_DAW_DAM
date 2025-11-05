// Importamos or.json para recorrer/parsear el documento JSON.
import org.json.*;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;


public class Ejemplo2_LeerJSON {
    public static void main(String[] args) {
        //Paso 1. List donde recostruiremos los objetos leídos del JSON.
        List<Modulo> lista = new ArrayList<>();

        //Paso 2. Intentamos abrir el archivo 'curso.json' con el FileReader (lee caracteres).
        try (FileReader fr = new FileReader("curso.json")) {

            //Paso 3. Creamo un JSONTokener apartir del Reader (convierte texto en tokens JSON).
            JSONTokener tokener = new JSONTokener(fr);

            //Paso 4. Contruir el objeto JSON raíz con el tokener
            JSONObject root = new JSONObject(tokener);

            //Paso 5. Leemos campos simples de la raíz. Utilizamos (optXxx) por si falta ese campo.
            String ciclo = root.optString("ciclo", "desconocido");  //si no existe, se verá "desconocido"
            int nivel   = root.optInt("año", 0);                    //si no existe, se verá 0
            System.out.println("Ciclo: " + ciclo + " | Año: " + nivel);

            //Paso 6. Obtener el array 'curso' (utilizamos el getJSONArray)
            JSONArray arrModulos = root.getJSONArray("curso");

            //Paso 7. Recorremos el array 'curso' y para cada posicion tomamos el objeto JSON del módulo.
            for (int i = 0; i < arrModulos.length(); i++) {
                JSONObject oModulo = arrModulos.getJSONObject(i);  //objeto del módulo en la posición i

                //Paso 8. Extraemos campos con getXxx
                String nombre = oModulo.getString("nombre");
                int horas     = oModulo.getInt("horas");
                double nota   = oModulo.getDouble("nota");

                //Paso 9. Recostruir el objeto Java y lo añadimos a la lista
                Modulo m = new Modulo(nombre, horas, nota);
                lista.add(m);

                //Mostramos por consola lo que hemos leido
                System.out.println(nombre + " (" + horas + "h) nota " + nota);
            }

            //Mostramos el tamaño de los módulos leídos
            System.out.println("Total módulos leídos: " + lista.size());

        } catch (FileNotFoundException e) {
            System.out.println("No encuentro 'curso.json'");
        } catch (JSONException e) {
            System.out.println("JSON mal formado o clave/valor inesperado: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error de lectura: " + e.getMessage());
        }
    }
}
