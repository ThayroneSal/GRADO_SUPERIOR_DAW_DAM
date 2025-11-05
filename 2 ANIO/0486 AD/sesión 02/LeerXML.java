package Clase_02;

import org.w3c.dom.*;              
import javax.xml.parsers.*;        
import java.io.*;                  

public class LeerXML {
    public static void main(String[] args) {
        try {
            // 1) Crear una fábrica de constructores de documentos.
            //    La fábrica nos permite configurar opciones de parsing (p. ej., validación, espacios en blanco, etc.)
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();

            // 2) A partir de la fábrica, obtenemos un "DocumentBuilder",
            //    que es el objeto que realmente parsea (lee) el XML y construye el DOM en memoria.
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

            // 3) Parsear el fichero XML "curso.xml" y construir el árbol DOM (objeto Document).
            //    Si el fichero no existe o el XML está mal formado, lanzará una excepción.
            Document doc = dBuilder.parse(new File("curso.xml"));

            // 4) Normalizar el documento: combina nodos de texto adyacentes y deja el DOM en estado consistente.
            //    Suele ser buena práctica antes de recorrer el árbol.
            doc.getDocumentElement().normalize();

            // 5) Obtener y mostrar el nombre del elemento raíz del documento (en nuestro ejemplo, "curso").
            System.out.println("Elemento raiz: " + doc.getDocumentElement().getNodeName());

            // 6) Recuperar todos los nodos con la etiqueta <modulo>.
            //    Esto devuelve una NodeList (lista "viva" de nodos del DOM).
            NodeList listaModulos = doc.getElementsByTagName("modulo");

            // 7) Recorrer la lista de <modulo> uno a uno.
            for (int i = 0; i < listaModulos.getLength(); i++) {
                // 7.1) Obtener el nodo i-ésimo de la lista.
                Node node = listaModulos.item(i);

                // 7.2) Comprobar que el nodo es de tipo ELEMENT_NODE (un elemento del XML).
                //      (En DOM hay distintos tipos: elementos, texto, comentarios, etc.)
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    // 7.3) Convertir el Node genérico a Element para poder usar métodos específicos de elementos.
                    Element elemento = (Element) node;

                    // 7.4) Dentro de cada <modulo>, obtener el texto de sus sub-etiquetas:
                    //      <nombre>, <horas> y <nota>. Se asume que existe al menos un elemento de cada.
                    //      item(0) toma el primer hijo que coincide con la etiqueta; getTextContent() extrae su contenido textual.
                    String nombre = elemento.getElementsByTagName("nombre").item(0).getTextContent();
                    String horas  = elemento.getElementsByTagName("horas").item(0).getTextContent();
                    String nota   = elemento.getElementsByTagName("nota").item(0).getTextContent();

                    // 7.5) Mostrar la información del módulo por consola en una línea legible.
                    System.out.println("Módulo: " + nombre + ". Horas: " + horas + ". Nota: " + nota);
                }
            }
        } catch (Exception e) {
            // 8) Capturar cualquier excepción y mostrar un mensaje sencillo por consola.
            System.out.println("Error: " + e.getMessage());
        }
    }
}
