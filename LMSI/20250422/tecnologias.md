## ¿Que tecnologías se pueden usar en la transformacion de documentos XML?
- XSLT Lenguaje específico para transformar documentos XML. Permite crear una nueva estructura a partir de un XML
- XPath Lenguaje para navegar y seleccionar partes (componentes) del XML.  
- XSL-FO Lenguaje que nos permite transformar XML en un formato mas legible (orientado a documentos PDF).  

## XPATH

### Sintaxis
/ selecciono la raiz del documentos
// Selecciono desde cualquier otra parte del documento
. Nodo actual
.. Nodo padre
@ Atributo -> Ejemplo: //libro/@id

### Operadores
= Igualdad
!= Distinto
>,< mayor y menor
and, or
contains() Seleccionar una subcadena