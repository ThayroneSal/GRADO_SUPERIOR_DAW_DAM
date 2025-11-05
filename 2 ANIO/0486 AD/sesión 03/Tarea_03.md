### Gestión de películas.
El objetivo de esta tarea será trabajar con ficheros JSON para guardar y leer informarión estructurada desde Java.

Tu modelo será una clase 'Pelicula', que represente información básica de una película: título, director y año de estreno.

Ejemplo
```java
public class Pelicula {
    private String titulo;
    private String director;
    private int anio;

    public Pelicula(String titulo, String director, int anio) {
        this.titulo = titulo;
        this.director = director;
        this.anio = anio;
    }

    public String getTitulo() { return titulo; }
    public String getDirector() { return director; }
    public int getAnio() { return anio; }
}
```

### Ejercicio 1. Escribir JSON
Crear un programa en Java que genere un fichero JSON llamado peliculas.json con la información de varias películas.

### Ejercicio 2. Leer JSON
Leer el fichero peliculas.json generado en el ejercicio anterior y mostrar su contenido por pantalla.


NOTA
CLASE 03 — JSON (org.json) SIN MAVEN
====================================

Cómo usar (Windows, en esta carpeta):

1) Descarga la librería org.json (JAR) y colócala en ./lib/
   - URL oficial: https://repo1.maven.org/maven2/org/json/json/20240303/json-20240303.jar
   - Renómbrala a: json-20240303.jar  (o ajusta el nombre en el classpath de los comandos)

2) Compilar:
   javac -cp ".;lib/json-20240303.jar" Ejemplo1_EscribirJSON.java Ejemplo2_LeerJSON.java Modulo.java
   
   javac -cp ".;lib/json-20240303.jar" Ejercicio1_EscribirJSON.java Ejercicio2_LeerJSON.java Pelicula.java

3) Ejecutar: 
    java -cp ".;lib/json-20240303.jar" Ejemplo1_EscribirJSON
    java -cp ".;lib/json-20240303.jar" Ejemplo2_LeerJSON

    java -cp ".;lib/json-20240303.jar" Ejercicio1_EscribirJSON
    java -cp ".;lib/json-20240303.jar" Ejercicio2_LeerJSON
