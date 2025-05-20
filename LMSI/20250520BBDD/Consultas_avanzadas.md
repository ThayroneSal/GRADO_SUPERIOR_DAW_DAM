# 📌 Consultas SQL Avanzadas

- INNER JOIN -> Devuelve solo los registros que tienen coincidencia en ambas tablas.
- LEFT JOIN -> Devuelve todos los registros de la tabla izquierda y solo los coincidentes de la tabla derecha.
- RIGHT JOIN -> Devuelve todos los registros de la tabla derecha y solo los coincidentes de la tabla izquierda.
- FULL JOIN -> Devuelve todos los registros de ambas tablas

### EJEMPLO 1. Obtener el nombre del album y el nombre del artista.
Utilizar las tablas ALBUM y ARTIST

```sql
SELECT Album.Title AS Album, Artist.Name AS Artista
FROM Album
JOIN Artist ON Album.ArtistId = Artist.ArtistId;
```

### EJEMPLO 2. OBtener las canciones y su genero.
Utilizar las tablas Track y Genre.
```sql
SELECT Track.Name AS Canción, Genre.Name AS Género
FROM Track
JOIN Genre ON Track.GenreId = Genre.GenreId;
```
## CONSULTAS MULTITABLA CON FILTROS

### EJEMPLO 3. Listar solo las canciones del géreno "ROCK"
Utilizar las tablas Track y Genre.
```sql
SELECT track.Name AS Canción, Genre.Name AS Género
FROM Track
JOIN Genre ON Track.GenreId = Genre.GenreId
WHERE Genre.Name = 'Rock';
```

### EJEMPLO 4. Mostrar las facturas junto con el nombre del cliente
Utilizar  las tablas invoice y Customer
```sql
SELECT  Invoice.total AS Total, Customer.FirstName AS Nombre
FROM Invoice
JOIN Customer ON Invoice.CustomerId = Customer.CustomerId
WHERE Invoice.Total > 13;
```
## RESUMEN:
- JOIN -> Me une dos tablas basadas en una clave común
- INNER JOIN DEvuelve solo coincidencias entre ambas tablas.
- LEFT JOIN Devuelve todos los registros de la primera tabla y las coincidencias de la segunda
- RIGHT JOIN Devuelve todos los registros de la segunda tabla y las coincidencias de la primera

JOIN + WHERE Filtra los resultados DESPUÉS de unir las tablas.

### EJEMPLO 5. Mostrar nombre del álbum y nombre del artista que lo creó.
Utilizar las tablas ALBUM y ARTIST
```sql
SELECT Album.Title AS Álbum, Artist.Name AS Artista
FROM Album
INNER JOIN Artist  ON Album.ArtistId = Album.ArtistId;
```
### EJEMPLO 6. Mostrar todos los artistas, uncluso aquellos que no tienen álbunes
Utilizamos las tablas ARTIST y ALBUM
```sql
SELECT Artist.Name AS Artista, Album.Title AS Álbum
FROM Artist
LEFT JOIN Album On Artist.ArtistId = Album.AlbumId;
```