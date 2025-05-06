package ejerciciosDeRecursividad;

public class Ejercicio04Potencia {
/*Potencia
Escribe una función recursiva para calcular ( a^b ), donde ( a ) es la base y ( b ) el exponente.
Ejemplo: potencia(2, 3) = 8. */

public static void main(String[] args) {
    
    int resultado = potencia (2,3);
    System.out.println("El resultado de elevar 2 a 3 es: " + resultado);

}
 public static int potencia (int a, int b){
    int resultado = (int) Math.pow(a, b);  //Math.pow devuelve un double, por eso lo casteo a int.
     return resultado;                     //porque debo poner int en el método potencia, preguntar a Andres.


 }


}
