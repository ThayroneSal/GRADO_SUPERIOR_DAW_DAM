## TEMA 1
1. Sistema de ficheros

Como funciona la jerarquía de carpetas, rutas absolutas y relativas.
Clases de Java paa trabajar con el sistema de ficheros (FIles, Path, Files).

### Coneptos básicos
- Fichero 
Es un contenedor de informacion (texto, binario, imagen...)

- Directorio
Es un contenedor de ficheros

- Ruta absoluta
Comienza en la raiz del sistema.
C:\\Users\\Luis\\Desktop\\proyecto_ficheros (WINDOWS)

- Ruta relativa 
Parte desde el directorio de ejecución del programa.


### Clase FILE en JAVA
Constructores principales
```java
File f1 = new File("C:\\Users\\Luis\\Desktop\\proyecto_ficheros\\Clase_01.md"); //Ruta absoluta
File f1 = new File (parent,"Clase_01.md"); //Ruta relativa
```

Métodos importantes:
- exists()
- isFile()
- isDirectory()
- canRead(), canWrite()
- length()
- delete()
- renameTo(File)

Ejemplo 1. Comprobar si existe un fichero o directorio. (InfoFichero)


2. Ficheros de texto

Dos tipos de niveles:
- Carácter a carácter -> FileReader / FileWriter
- Línea a Línea -> BufferedReader / BufferedWriter