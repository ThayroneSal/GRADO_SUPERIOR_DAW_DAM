
# Ejercicio: Gestión de Notas por Asignatura

Desarrolla un programa en Java para gestionar las notas de los estudiantes en dos asignaturas: **Programación** y **Entornos de Desarrollo**. El programa utilizará matrices para almacenar las notas de las entregas y exámenes, y permitirá realizar varias acciones mediante un menú interactivo.

---

## Datos iniciales

### Estudiantes:
- Andrés Mateo  
- Mar Beamud  
- Luis Miguel Richard  

### Asignaturas:
- **Programación:**  
  Cada estudiante tiene **4 entregas** con notas entre 0 y 10 (con dos decimales) y **1 examen trimestral**.  
  Las entregas valen el **60%** de la nota final y el examen el **40%**.

- **Entornos de Desarrollo:**  
  Cada estudiante tiene **3 entregas** con notas entre 0 y 10 (con dos decimales) y **1 examen trimestral**.  
  Las entregas valen el **60%** de la nota final y el examen el **40%**.

### Notas iniciales:

- **Programación:**
  | Estudiante         | Entrega 1 | Entrega 2 | Entrega 3 | Entrega 4 | Examen |
  |--------------------|-----------|-----------|-----------|-----------|--------|
  | Andrés Mateo       | 4.0       | 4.5       | 3.8       | 4.2       | 3.5    |
  | Mar Beamud         | 8.0       | 7.5       | 9.0       | 8.3       | 8.0    |
  | Luis Miguel Richard| 7.0       | 6.5       | 7.5       | 6.8       | 7.5    |

- **Entornos de Desarrollo:**
  | Estudiante         | Entrega 1 | Entrega 2 | Entrega 3 | Examen |
  |--------------------|-----------|-----------|-----------|--------|
  | Andrés Mateo       | 4.5       | 3.0       | 4.8       | 4.0    |
  | Mar Beamud         | 7.5       | 8.2       | 7.8       | 8.5    |
  | Luis Miguel Richard| 6.5       | 7.0       | 7.5       | 6.8    |

---

## Funcionalidades del programa

El programa debe mostrar un menú principal que permita al usuario seleccionar una asignatura o salir del programa:

### Menú principal:
- **1. Ver notas de Programación**  
- **2. Ver notas de Entornos de Desarrollo**  
- **3. Salir**

---

## Submenú por asignatura

Al seleccionar una asignatura, se debe mostrar un submenú con las siguientes opciones:

1. **Ver notas:**  
   - Muestra las notas de todas las entregas y el examen de cada estudiante.
   - Las notas suspensas (menores a 5) deben mostrarse en **rojo**.

2. **Cambiar nota:**  
   - Permite al usuario seleccionar un estudiante y cambiar una nota específica (entrega o examen).
   - Debe validar que los índices del estudiante y de la nota sean correctos antes de realizar cambios.

3. **Mostrar nota final:**  
   - Calcula y muestra la nota final de cada estudiante para la asignatura seleccionada, de acuerdo con el peso de las entregas y el examen.  
     Fórmula:  
     ```
     Nota final = (media de entregas * peso entregas) + (examen * peso examen)
     ```

4. **Volver al menú principal:**  
   - Retorna al menú principal sin realizar cambios.

---

## Restricciones
1. El programa debe utilizar **matrices bidimensionales** para almacenar las notas de las entregas y los exámenes de cada asignatura.
2. Todo el código debe estar dentro del método `main`.
3. Debe utilizar secuencias ANSI para destacar las notas suspensas en **rojo**.

---

## Ejemplo de interacción del usuario

### Menú principal:
```
--- MENÚ PRINCIPAL ---
1. Ver notas de Programación
2. Ver notas de Entornos de Desarrollo
3. Salir
Elige una opción: 1
```

### Ver notas:
```
--- NOTAS DE PROGRAMACIÓN ---
Andrés Mateo: 4.00 4.50 3.80 4.20 3.50
Mar Beamud: 8.00 7.50 9.00 8.30 8.00
Luis Miguel Richard: 7.00 6.50 7.50 6.80 7.50
```

### Cambiar nota:
```
Introduce el índice del estudiante (1-3): 1
Introduce el índice de la nota (1-5): 2
Introduce la nueva nota: 5.5
¡Nota actualizada correctamente!
```

### Mostrar nota final:
```
--- NOTA FINAL DE PROGRAMACIÓN ---
Andrés Mateo: 3.87
Mar Beamud: 8.21
Luis Miguel Richard: 7.10
```

### Volver al menú principal:
```
Volviendo al menú principal...
```

### Salir:
```
¡Hasta luego!
```

---


