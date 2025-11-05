//Impartamos las clases de la libreria org.jon para poder construir el archivo JSON
import org.json.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;


public class Ejemplo1_EscribirJSON {
    public static void main(String[] args) {
        //Paso 1. Preparar datos
        List<Modulo> curso = Arrays.asList(
            new Modulo("Acceso a Datos", 6, 8.45),
            new Modulo("Programación", 3, 9.0)
        );

        //Paso 2. Creamos el objeto JSON raiz donde vamos a incorporar todo el contenido
        JSONObject root = new JSONObject();        

        //Paso 3. Añadimos campos pares clave-valor
        root.put("ciclo", "DAM");     //{"ciclo":"DAM"}             
        root.put("año", 2);           //{"ciclo":"DAM","año":2}            

        //Paso 4. Creamos un JSONArray para la lista de modulos
        JSONArray arrModulos = new JSONArray();     

        //Paso 5. Recorremos a lista de objetos y convertimos cada uno en JSONObject
        for (Modulo m : curso) {
            //Creamos un objeto JSON 
            JSONObject oModulo = new JSONObject();  
            //Copiamos dentro de los campos del objeto
            oModulo.put("nombre", m.getNombre());  //{"nombre":"Acceso a Datos"}
            oModulo.put("horas", m.getHoras());    //{"nombre":"Acceso a Datos", "horas":6}
            oModulo.put("nota", m.getNota());      //{"nombre":"Acceso a Datos", "horas":6, "nota":8.45}
            // Añadimos el objeto del modulo del array JSON
            arrModulos.put(oModulo);               
        }
        //Paso 6. Colgamos el array del modulo en la clave "curso"
        root.put("curso", arrModulos);          //{"ciclo":"DAM", "año":2, "curso":[...]}

        //Paso 7. Escribimos el JSON a un archivo físico.
        try (FileWriter fw = new FileWriter("curso.json")) { //Crear el 'curso.json'
            fw.write(root.toString(4));                               //Convertir el JSONObject a texto
            System.out.println("JSON escrito en curso.json");
        } catch (IOException e) {
            System.out.println("Error escribiendo JSON: " + e.getMessage());
        }

        //Paso 8. (OPCIONAL) Mostar por pantalla el contenido del JSON
        System.out.println("\n--- JSON generado ---");
        System.out.println(root.toString(2));
    }
}
