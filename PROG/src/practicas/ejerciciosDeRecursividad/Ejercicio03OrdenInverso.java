package ejerciciosDeRecursividad;

public class Ejercicio03OrdenInverso {

/*Imprimir números en orden inverso
Escribe una función recursiva que reciba un número ( n ) y lo imprima en orden descendente.
Ejemplo: Para ( n = 5 ), salida: 5, 4, 3, 2, 1. */

public static void main(String[] args) {
int numero = 5;
int  resultado = imprimir(numero);

// System.out.println("El número " + numero + " en orden inverso es: " + resultado);


}

public static int imprimir (int numero){

if (numero == 0){
    return 0;
   } else{
    System.out.println(numero);
    return imprimir(numero -1);}

}
}
