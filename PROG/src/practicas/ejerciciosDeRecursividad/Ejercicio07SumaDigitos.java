package ejerciciosDeRecursividad;

public class Ejercicio07SumaDigitos {

/*Sumar dígitos de un número
Escribe una función recursiva que sume los dígitos de un número.
Ejemplo: sumaDigitos(123) = 1 + 2 + 3 = 6. */

    
public static void main(String[] args) {
    
    System.out.println(sumaDigitos(123));
}

public static int sumaDigitos (int n){

if (n==0) return 0;
return n % 10 + sumaDigitos(n/10); // se usa para hacer la resta de una divison entre 10, con ellos siempre va cortando la ultima sifra.
                                 // estudiar la funcion de modulo es muy importante.
}

}

// n % 10 obtiene el último dígito del número n. El operador % (módulo) devuelve el resto de la división de n entre 10,
// que es el último dígito del número.
// sumaDigitos(n / 10) llama a la función recursivamente con el número n dividido por 10.
// El operador / (división entera) elimina el último dígito del número n.
// La suma de estos dos valores (n % 10 y el resultado de la llamada recursiva sumaDigitos(n / 10))
//  da como resultado la suma de todos los dígitos del número original.
// Por ejemplo, si n es 1234:

// En la primera llamada, n % 10 es 4 y sumaDigitos(1234 / 10) es sumaDigitos(123).
// En la segunda llamada, n % 10 es 3 y sumaDigitos(123 / 10) es sumaDigitos(12).
// En la tercera llamada, n % 10 es 2 y sumaDigitos(12 / 10) es sumaDigitos(1).
// En la cuarta llamada, n % 10 es 1 y sumaDigitos(1 / 10) es sumaDigitos(0).
// Finalmente, cuando n es 0, la función retorna 0.
// Sumando todos estos valores: 4 + 3 + 2 + 1 = 10.

// En resumen, la función sumaDigitos descompone el número n en sus dígitos individuales y los suma uno por uno mediante
// la recursión hasta que n se reduce a 0.