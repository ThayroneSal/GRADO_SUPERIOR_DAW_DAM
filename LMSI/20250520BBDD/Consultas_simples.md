# 📌 Consultas SQL Simples

En SQL, las consultas simples permiten **extraer y manipular datos** de una base de datos. Estas consultas son esenciales para realizar operaciones básicas como **seleccionar, filtrar, ordenar y agrupar información**.

---

## 1. `SELECT` → Obtener datos de una tabla
El comando `SELECT` se usa para **recuperar información** de una tabla.

### 📌 **Sintaxis básica**
```sql
SELECT columna1, columna2 FROM nombre_tabla;
```

columna1, columna2 → Especifica qué columnas se desean recuperar.
FROM nombre_tabla → Indica de dónde obtener los datos.

Ejemplo: Obtener todos los empleados
```sql
SELECT * FROM empleados;
```

## 2. `WHERE` → filtrar resultados
El comando `WHERE` permite aplicar condiciones a una consulta para seleccionar datos específicos.

### 📌 **Sintaxis básica**
```sql
SELECT columna1, columna2 FROM nombre_tabla WHERE condición;
```

La **condición** define qué registros se deben recuperar.

Ejemplo: Obtener empleados con salario mayor a 3000.
```sql
SELECT nombre, salario FROM empleados WHERE salario > 3000;
```

Solo muestra empleados cuyo **salario sea mayor a 3000**

## 3. `ORDER BY` → Ordenar datos
El comando `ORDER BY`  se usa para ordenar los resultados de una consulta en **orden ascendente** (`ASC`) **o descendente** (`DESC`).
### 📌 **Sintaxis básica**
```sql
SELECT columna1, columna2 FROM nombre_tabla ORDER BY columna1 ASC|DESC;
```
- `ASC` Ordena de → **menor a mayor**
- `DESC`Odena de → **mayor a menor**

Ejemplo: Ordenar empleados por salario de mayor a menor.
```sql
SELECT nombre, salario FROM empleados ORDER BY salario DESC;
```

Muestra los empleados **con los salarios más altos primero**.

## 4. `LIMIT` → Limitar el número de registros
El comando `LIMIT` restringe la cantidad de registros devueltos en una consulta.
### 📌 **Sintaxis básica**
```sql
SELECT columna1, columna2 FROM nombre_tabla LIMIT cantidad;
```
**cantidad** → Número máximo de registros a devolver.
Ejemplo: Mostrar los 5 empleados con mayor salario.
```sql
SELECT nombre, salario FROM empleados ORDER BY salario DESC LIMIT 5;
```
Solo devuelve los 5 **empleados mejor pagados**.

## 5. Funciones Agregadas `COUNT()` y `AVG()` → Cálculos sobre datos.
Las funciones agregadas permiten realizar **operaciones matemáticas sobre columnas.** 
### 📌 **Sintaxis básica**
```sql
SELECT FUNCION(columna) FROM nombre_tabla;
```
**FUNCION** puede ser **COUNT(), AVG(), SUM(), MAX(), MIN(), etc**
Ejemplo 1: Contar cuántos empleados hay en la empresa.
```sql
SELECT COUNT(*) AS total_empleados FROM empleados;
```
`COUNT(*)`devuelve la cantidad total de filas.

Ejemplo 2: Obtener el salario promedio de los empleados.
```sql
SELECT AVG(salario) AS salario_promedio FROM empleados;
```
`AVG(salario)`devuelve la media de los salarios.

## 6. `GROUP BY` → Agrupar datos según un criterio
El comando `SELECT` se usa para agrupar registros con valores comunes en **una columna** generalmente junto con funciones agregadas.
### 📌 **Sintaxis básica**
```sql
SELECT columna, FUNCION(columna2) FROM nombre_tabla GROUP BY columna;
```
Ejemplo: Contar cuántos empleados hay por departamento
```sql
SELECT departamento, COUNT(*) AS cantidad FROM empleados GROUP BY departamento;
```
Agrupa los empleados por departamento y **cuenta cuántos hay en cada uno.**