# 📌 Inserciones SQL Simples
INSERT - Inserciones en una tabla de base de datos
Dar "altas" son operaciones que nos permiten añadir nuevos datos a las tablas de nuestra base de datos

## 1. Recordatorio de crear una tabla
Sentencia:
```sql
CREATE TABLE nombre_tabla (
	columna1 TIPO NOT NULL,
	columno2 TIPO,
	...
);
```

### EJEMPLO 1
Crear una tabla EstiloMusical para nuevos géneros (EstiloId, Nombre)
```sql
CREATE TABLE EStiloMusical (
	EstiloId INTEGER PRIMARY KEY AUTOINCREMENT,
	Nombre TEXT NOT NULL
);
```

## 2. INSERTAR DATOS BÁSICO ( INSERT INTO ... VALUES)
Sentencia:
```sql
INSERT INTO nombre_tabla (calumna1, columna2, ...)
VALUES (valor1, valor2, ...)
```

### EJEMPLO 2.
Hacer una inserción en la tabla Estilo Musical (Meter el género Flamenco)
```sql
INSERT INTO EStiloMusical (Nombre)
VALUES ('Flamenco');
```

### EJEMPLO 3.
Hacer áas de una insercción a la vez (Meter Electro, Trap, Pop)
```sql
INSERT INTO EStiloMusical (Nombre)
VALUES ('Electro'), ('Flamencos'), ('Trap'), ('Pop');
```

## 3. Formas avanzadas de inserción de datos (INSERT INTO ... SELECT)
Permite copiar datos desde una tabla existente hacia otra
Sentencia:
```sql
INSERT INTO tablas_destino (col1, col2)
SELECT col1, col2 FROM tabla_origen WHERE condición;

CREATE TABLE GENEROARTISTA (
	ArtistaId INTEGER,
	Name TEXT
);
```

### EJEMPLO 4.
Copiar artistas cuyo nombre empiezan por P a la nueva tabla GENEROARTISTA
```sql
INSERT INTO GENEROARTISTA (ArtistaId, Name)
SELECT ArtistId, Name FROM Artist
WHERE Name LIKE 'P%';
```



