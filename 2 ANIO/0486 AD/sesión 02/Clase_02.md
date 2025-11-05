## 3. Ficheros binarios. Ficheros de objetos

### Ficheros binarios vs ficheros de texto
Ventajas del formato binario:
- Mayor rapidez y eficacia. 
- Mayor precisión (se conservan los tipos int, double,...)
- Permite acceso directo a las posiciones del fichero sin tener que leerlo entero.
- Ofrece cierta protección, ya que no es fácilmente legible.

### Flujos base: FileInputStream / File OutputStream
- FileInputStream: Lee bytes de un fichero.
- FileOutputStream: escribe bytes en un fichero.

Métodos principales:
- read() -> lee un byte (valor 0-255). Devuelve -1 si llega al final del fichero.
- write(int b) -> escribe un byte en el fichero.

### Decoradores para tipos: DataInputStream / DataOutputStream
Permiten trabajar por tipo de dato, en lugar de byte a byte.

Métodos más usados:
- WriteInt(int n) -> guardar un número entero.
- WriteDouble(double n) -> guardar un número decimal.
- writeUTF(String texto) -> guardar la longitud más el texto.

- readInt() -> leer un entero.
- readDouble() -> leer un decimal.
- readUTF() -> leer una cadena guardada.

Importante el orden de escritura y lectura, debe de ser el mismo.

```java
DataOutputStream n = new DataOutputStream(new FileOutputStream("ejemplo.bin"));
n.writeInt(10);
n.writeUTF("Yeee");
n.writeDouble(3.14);
n.close();
```

### Ficheros de objetos y serialización
Cuando queremos guardar objetos completos (no solo datos sueltos).

- ObjectOutputStream -> para escribir objetos.
- ObjectInputStream -> para leer objetos.

Serialización: significa convertir un objeto en una secuencia de bytes para guardarlo o enviarlo.
```java
class Alumno implements Serializable {
    private String nombre;
    private int edad;
    private double nota;
}
```

```java
ObjectOutputStream n = new ObjectOutputStream(new FileOutputStream("ejemplo.bin"));
n.writeObjecto(listaDeAlumnos);
n.close;
```

```java
ObjectInputStream n = new ObjectInputStream(new FileInputStream("ejemplo.bin"));
List<Alumno> leido = (List<Alumno>) n.readObject();
n.close;
```
## 4. Almacenamiento con documentos XML

### Analizadores XML
Un parser XML es una clase que nos permite:
- Leer documentos XML
- Interpretar segun su estructura
- Permite acceder a la información que contiene.

SAX -> LEctura secuencial. Rápido pero no flexible.
DOM -> Fácil de recorrer.

### El modelo DOM
<curso>
    -> <modulo>
        -> <nombre>Acceso a Datos </nombre>
            <horas>6 </horas>
            <nota>8.45</nota>

Clases principales:
- Document -> representa todo el XML
- Element -> cada etiqueta
- Text -> el texto dentro de las etiquedas
- NodeList -> conjunto de los nodos

### Lectura de un XML
- DocumentBuilderFactory -> crear la herramienta que leerá e XML.
- DocumentBuilder  > Se usa para abrir y analizar el documento.
- parse() carga el fichero en memoria.
- getElemensByTagName() -> devuelve todos los nodos con esa etiqueta.
- getTextContent() -> devuelve el texto dentro de la etiqueta.

### Escritura de un XML
- DocumentBuilderFactory + newDocument() -> crear un DOM vacío.
- createElement() -> crea una etiqueta.
- appendChild() -> insertamos un nodo dentro d eotro.
- createTextNode() - crear texto dentro de una etiqueta.
- Transformer -> convierte el árbol DOM en un fichero XML físico.
