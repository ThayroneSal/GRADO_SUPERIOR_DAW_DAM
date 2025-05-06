## Tipos de almacenamiento de información

### 1. Bases de datos relaciones
- Ejemplos: MySqL, SQL Server
Organizan los datos en tablas (filas y columnas)
Usan un lenguaje estructurado.
Alta integridad, rendimiento y consistencia.
Admiten relaciones entre los datos de diferentes tablas.
Estructura rígida.

- Ventajas: 
Consultas eficientes.
Soporte muy integrado.

- Desventajas:
Poco flexibles ante cambios en la estructura.

### 2. Almacenamiento basado en documentos ( XML, JSON)
- Ejemplos: Archivos XML, Bases de datos no relacionales (MongoDB - JSON)
Almacenan la información como documentos jerárquicos.
Muy utilizados en intercambio de datos ( web Services, APIS..)
Felixes en cuanto a la estructura.

- Ventajas:
Adaptable a estructuras cambiantes.

- Inconvenientes:
Menor rendiiento en grandes volúmenes.
No hay operadores como JOIN.

### 3. Comparativa
Características  || BD Relacional  || BD XML (documentos) 
Estructura       || Tablas         || jerárquica, flexible
Lenguaje         || SQL            || XPath /Xquery
Relaciones entre datos || JOIN     || no disponible
Cambios en datos || Muy costoso    || Flexible


¿Cuándo usar cada tipo de BBDD?
Relacional -> datos muy estructurados y repetitivos, muchas relaciones entre tablas, se necesita una gran consistencia.
XML (documentos) -> datos jerárquicos o con estructura cambiante, se necesita flexibilidad en la estructura de los datos.



### Caso práctico.
Tenemos una aplicacion de gestiones de publicaciones de mangas
Datos básicos: Titulo, autor, precio, año de publicación
Listado de ediciones: puede tener múltiples entradas
Los manfas se intercambian entre dististas editoriales web. 
Ejemplo: 
{"id":12123,
"titulo":"dsf",
"autor":"qwqe",
"precio": 123,
"año":1223,
"listado_ediciones":[
    {
        "nombre_edicion":"asda",
        "fecha": "2025-07-31"
    }
    ]
}