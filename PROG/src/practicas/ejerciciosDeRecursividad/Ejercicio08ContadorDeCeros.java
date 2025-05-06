package ejerciciosDeRecursividad;

public class Ejercicio08ContadorDeCeros {

/*Conteo de ceros en un número
Escribe una función recursiva que cuente cuántos ceros tiene un número.
Ejemplo: contarCeros(102030) = 3. */

public static void main(String[] args) {
    
    System.out.println(contarCeros(102030)); //en este ejercicio tengo duda ¿si el numero enpieza por 0 el resultado seria 0 porque?
}

public static int contarCeros (int n){

    if (n < 10) return (n==0)? 1 : 0; // No entiendo esta funcion, si n es menor que 10, indica que es un solo digito,
    //ahora me retorna n == 0, si es igual a 0 me daria 1, si es diferente de 0 me daria 0, no entiendo porque o como para el bucle.
    
    return ((n % 10 == 0)? 1 : 0) + contarCeros (n/10);

}

}

// n % 10 == 0 verifica si el último dígito de n es 0. El operador % (módulo) devuelve el resto de la división de n entre 10,
// que es el último dígito del número. Si el último dígito es 0, la expresión ternaria ((n % 10 == 0)? 1 : 0) retorna 1;
//  de lo contrario, retorna 0.
// contarCeros(n / 10) llama a la función recursivamente con el número n dividido por 10.
//  El operador / (división entera) elimina el último dígito del número n.
// La suma de estos dos valores (((n % 10 == 0)? 1 : 0) y el resultado de la llamada recursiva contarCeros(n / 10)) da como
// resultado el conteo total de ceros en el número original.
// Por ejemplo, si n es 10204:

// En la primera llamada, n % 10 es 4 y contarCeros(10204 / 10) es contarCeros(1020).
// En la segunda llamada, n % 10 es 0 y contarCeros(1020 / 10) es contarCeros(102).
// En la tercera llamada, n % 10 es 2 y contarCeros(102 / 10) es contarCeros(10).
// En la cuarta llamada, n % 10 es 0 y contarCeros(10 / 10) es contarCeros(1).
// En la quinta llamada, n es 1, que es menor que 10, por lo que la función retorna 0.
// Sumando todos estos valores: 0 + 1 + 0 + 1 + 0 = 2.

