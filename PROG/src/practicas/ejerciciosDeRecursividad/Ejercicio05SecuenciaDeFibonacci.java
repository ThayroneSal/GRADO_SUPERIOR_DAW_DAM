package ejerciciosDeRecursividad;

public class Ejercicio05SecuenciaDeFibonacci {



    /*Escribe una función recursiva para obtener el ( n )-ésimo término de la serie de Fibonacci.
Ejemplo: fibonacci(5) = 5 (secuencia: 0, 1, 1, 2, 3, 5). */

// Que es Fibonnacci: La secuencia de Fibonacci es una serie de números en la que (cada número es la suma de los dos anteriores).
// Comienza típicamente con 0 y 1, aunque a veces se inicia con 1 y 1. La secuencia se puede expresar matemáticamente como:

// ( F(0) = 0 )
// ( F(1) = 1 )
// ( F(n) = F(n-1) + F(n-2) ) para ( n > 1 )

//El ésimo término de la serie de Fibonacci se refiere al número que ocupa la posición ( n ) en la secuencia de Fibonacci.

public static void main (String[] args){

int numero = 5;
int resultado = fibonacci(numero);

System.out.println("El número " + numero + " de la serie de Fibonacci es: " + resultado);



}

public static int fibonacci (int numero){
    if (numero == 0) return 0;
    if (numero == 1) return 1;
    return fibonacci (numero -1) + fibonacci (numero -2); // no entiendo por qué es -1 y -2. numero deberia de ser 5 no?
    
}


}
