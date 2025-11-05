public class Ejercicio02 {
    /*
* 2. En este ejercicio, vas a diseñar un "Generador de Identificadores" que cree un
identificador a partir del nombre completo de una persona y su fecha de nacimiento
Pasos a seguir:
        ● El programa pedirá al usuario que ingrese su nombre completo en una sola línea,
        incluyendo su nombre y dos apellidos
        ● Luego, el sistema pedirá la fecha de nacimiento en formato DD/MM/AAAA
        Reglas para construir el identificador. (Consta de 3 partes separados por “-”)
    1. Toma la primera letra del nombre y la primera letra de cada apellido en mayúsculas y
    juntalas (1o parte del id)
    2. Suma el dia el mes y el año de la fecha que has indicado (2o parte de id)
    3. Agrega los últimos dos dígitos del año de nacimiento y concatena la cantidad total de
    letras del nombre completo, excluyendo espacios
Ejemplo:
    1. Datos de entrada:
        ● Nombre completo: Ana Torres Sánchez
        ● Fecha de nacimiento: 25/11/1983
    2. Generación del identificador:
    1. 1a parte (Iniciales):
    
    2. 2a parte (Suma de fecha):
        ○ Día (25) + Mes (11) + Año (1983)
        ○ $25 + 11 + 1983 = 2019$
        ○ Resultado: 2019
    3. 3a parte (Últimos 2 dígitos del año):
        ○ Año: 1983
        ○ Resultado: 83
        4. 4a parte (Total de letras):
        ○ Ana (3) + Torres (6) + Sánchez (7)
        ○ $3 + 6 + 7 = 16$
        ○ Resultado: 16
    */

public static void main(String[] args) {

    }
}
