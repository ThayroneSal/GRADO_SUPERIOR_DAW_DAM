## ¿Qué estructuras de datos podemos almacenar con XML?
Estructura relacional -> Equivalente en XML
BBDD -> Documento XML
Tabla -> Elemento principal
Filas -> Subelementos dentro del elemento principal
Columnas -> Elementos hijos (atributos)

### Adaptacion
Elementos simples: <titulo>
Elementos complejos: <autores><autor>...</autor></autores>
Atributo: <libro id="12123">....</libro>

### Ejercicio 1. 
Tenemos una tabla relacional (repuestos) con los siguientes campos:
Id_pieza (clave primaria)
nombre
fabricante(nombre, país)
precio
