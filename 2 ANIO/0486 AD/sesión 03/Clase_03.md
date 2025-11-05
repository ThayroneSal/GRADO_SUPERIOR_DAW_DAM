## 5. Almacenamiento con ficheros JSON

### Ficheros JSON
JSON es un formato de texto ligero para intercambiar datos.
- Legible y facil de parsear.
- Texto: editable y portable.
- Estructura: objetos/arrays que mapean muy bien a clases y colecciones.

Tipos de datos en JSON:
- Números: 1, 2, 3
- Cadenas: "luis"
- Booleano: true/false
- Null: null
- Array: ["luis", "jose"]
- Objeto: {"clave": "valor", "edad": 29}

```json
{
  "name": "Luis Skywalker",
  "films": [
    "Una nueva esperanza",
    "Campeones"
  ]
}
```

### JSON en Java
En java utilizaremos la libreria org.JSON. Clases mas importantes dentro d ela libreria:

- JSONObject: representa un objeto JSON (pares clave: valor).
- JSONArray: representa un array JSON (lista ordenada).
- JSONTokener: convierte un Reader/String en tokens para construir JSONObject/JSONArray.
- JSONStringer/JSONWriter: para construir JSON “en cadena fluida” (menos usado en iniciación).
- org.json lanza JSONException si una clave no existe o el tipo no coincide.


1. JSONObject → un objeto JSON (pares clave/valor).

- put(String key, Object value) añade o reemplaza.
- getString/getInt/getDouble/getBoolean(key) leen un tipo.
- getJSONObject/getJSONArray(key) bajan de nivel.
- optXxx(...) variantes que no lanzan excepción si falta la clave.
- JSONObject.NULL representa un null de JSON.

2. JSONArray → un array JSON.

- put(Object) añade al final.
- get(int) / getJSONObject(int) / length().

3. JSONTokener → tokeniza un Reader o String para crear JSONObject/JSONArray.

4. JSONStringer/JSONWriter → para construir JSON en modo “fluido” (menos usado en clase básica).

### Creación de un objeto JSON
Para la creacioón de un objeto JSON, crearemos un JSONObject vacío y mediante metodos como get, iremos añadiendo cada uno de los atributos.

JSONObject Representa un objeto JSON, es decir, una colección de pares clave: valor.

| Método                              | Qué hace                                              | Ejemplo                              |
| ----------------------------------- | ----------------------------------------------------- | ------------------------------------ |
| `new JSONObject()`                  | Crea un objeto vacío                                  | `JSONObject o = new JSONObject();`   |
| `put(String key, Object value)`     | Añade o reemplaza un valor asociado a una clave       | `o.put("nombre", "luis");`           |
| `getString(String key)`             | Devuelve un valor `String` (lanza error si no existe) | `o.getString("nombre");`             |
| `optString(String key, String def)` | Devuelve un valor o un valor por defecto              | `o.optString("nombre", "—");`        |
| `getInt`, `getDouble`, `getBoolean` | Recupera valores numéricos o booleanos                | `o.getInt("edad");`                  |
| `getJSONObject(String key)`         | Devuelve un objeto JSON anidado                       | `o.getJSONObject("direccion");`      |
| `getJSONArray(String key)`          | Devuelve un array JSON anidado                        | `o.getJSONArray("alumnos");`         |
| `isNull(String key)`                | Comprueba si un valor es `null` (JSON)                | `o.isNull("telefono");`              |
| `toString(int indent)`              | Convierte el JSON a texto (con formato bonito)        | `System.out.println(o.toString(2));` |


NOTA: el tipo de datos del valor puede ser String, int, double, boolean, otro JSONObject, JSONArray o JSONObject.NULL.

JSONArray representa una lista ordenada de valores. Puede contener cualquier tipo de JSON: objetos, arrays, números, booleanos o cadenas.

| Método                      | Qué hace                                            | Ejemplo                            |
| --------------------------- | --------------------------------------------------- | ---------------------------------- |
| `new JSONArray()`           | Crea un array vacío                                 | `JSONArray arr = new JSONArray();` |
| `put(Object value)`         | Añade un valor al final                             | `arr.put("DAM");`                  |
| `getJSONObject(int index)`  | Devuelve un elemento del array como objeto JSON     | `arr.getJSONObject(0);`            |
| `getInt`, `getString`, etc. | Devuelve un valor primitivo en la posición indicada | `arr.getString(1);`                |
| `length()`                  | Devuelve el número de elementos                     | `arr.length();`                    |

NOTA: Los JSONArray se suelen usar dentro de un JSONObject para representar colecciones de objetos.

¿Como podemos usar estos métodos?
1. Crear un JSONObject raíz con metadatos (ciclo, nivel…).
2. Crear un JSONArray que contenga varios objetos JSON.
3. Cada objeto JSON del array representa un objeto Java (por ejemplo, un módulo).
4. Finalmente, guardar el texto con FileWriter usando toString(4) (el número indica espacios de indentación).

¿Cómo se usan para la lectura?
1. Abrir el archivo con FileReader (modo lectura).
2. Pasarlo al constructor de JSONTokener.
3. Crear un JSONObject raíz con el JSONTokener.
4. Extraer:
- Claves simples con getXxx o optXxx.
- Arrays con getJSONArray.
- Valores dentro de esos arrays con getJSONObject(i) y getXxx.