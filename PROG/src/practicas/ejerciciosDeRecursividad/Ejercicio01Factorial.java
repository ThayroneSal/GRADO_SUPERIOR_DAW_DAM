package ejerciciosDeRecursividad;

public class Ejercicio01Factorial {

public static void main(String[] args) {
    
    /*Factorial
Escribe una función recursiva que calcule el factorial de un número ( n ) (( n! )).
Ejemplo: ( 5! = 5 x 4 x 3 x 2 x 1 = 120 ). */

int numero = 5;
int resultado = factorial(numero);

System.out.println("El factorial de " + numero + " es " + resultado);

}

public static int factorial (int numero){
    if (numero < 0) return -1;
    if (numero == 0 || numero == 1) return 1;
    
    return numero * factorial(numero -1);
}
}


