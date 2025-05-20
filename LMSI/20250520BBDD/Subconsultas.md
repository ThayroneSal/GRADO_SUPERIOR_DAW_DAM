# 📌 Consultas SQL Simples

## 1. Subconsultas Escalonadas (anidadas)
Sentencia:
```sql
SELECT ... FROM ... WHERE columna = (
	SELECT ... FROM ... WHERE ...
);
```
Se usa cuando queremos buscar un valor que previamente hemos calculado y lo usamos dentro de otra consulta.

### EJEMPLO 1.
Obtener el nombre del cliente que más ha gastado en total.
```sql
SELECT FirstName, LastName
FROM Customer
WHERE CustomerId = (
	SELECT CustomerId
	FROM Invoice
	ORDER BY Total DESC
	LIMIT 1

);
```
## 2. Subconsulta de Lista (IN)
Sentencia:
```sql
SELECT ... FROM ... WHERE columna IN (
	SELECT ... FROM ... WHERE ...
);
```
Se usa cuando queremos comprobar si un valor está dentro de una lista de resultados generado por otra consulta.

### EJEMPLO 2.
Obtener los nombres de los clientes que han hecho al menos una compra.
```sql
SELECT FirstName, LastName
FROM Customer
WHERE CustomerId IN (
	SELECT CustomerId FROM Invoice
);
```
## 3. Subconsulta de Lista (ALL)
Sentencia:
```sql
SELECT ... FROM ... WHERE columna > ALL (
	SELECT ... FROM ... WHERE ...
);
```
Para Comparar un valor con todos los valores devueltos por la subconsulta.

### EJEMPLO 3.
Obtener canciones cuyo precio es mayor que todas las cancionesdel genero "ROCK".
```sql
SELECT Name, UnitPrice
FROM Track
WHERE UnitPrice > ALL (
	SELECT UnitPrice FROM Track
	WHERE GenreId = (
		SELECT GenreId FROM Genre WHERE Name = 'Rock'
	)

);
```
## 4. Subconsulta de Lista (ANY)
```sql
SELECT ... FROM ... WHERE columna > ANY (
SELECT ... FROM ... WHERE ...
)
```
Se traduce como ALGUNO, sirve para comparar un valor con al menos uno d elos valores de la subconsulta.

### EJEMPLO 4.
Obtener canciones más caras que al menos una canción de 'Rock'.
```sql
SELECT Name, UnitPrice
FROM Track
WHERE UnitPrice > ANY (
	SELECT UnitPrice FROM Track
	WHERE GenreId = (
		SELECT GenreId FROM Genre WHERE Name = 'Rock'
	)
);
```
FORMA EQUIVALENTE
```sql
SELECT Name, UnitPrice
FROM Track
WHERE UnitPrice > (
	SELECT MIN(UnitPrice) 
	FROM Track
	WHERE GenreId = (
		SELECT GenreId FROM Genre WHERE Name = 'Rock'
	)
);
```

## 5. Subconsulta de Lista (EXISTS)
```sql
SELECT ... FROM ... WHERE EXISTS (
	SELECT 1 FROM ... WHERE algunaCondición
);
```

Sirve para verificar si existe al menos un resultado que cumpla cierta condición

### EJEMPLO 5. Mostrar los clientes que han realizado alguna compra.
```sql
SELECT FirstName, LastName
FROM Customer c 
WHERE EXISTS (
	SELECT 1 FROM Invoice i 
	WHERE i.CustomerId = c.CustomerID
	
);
```


























