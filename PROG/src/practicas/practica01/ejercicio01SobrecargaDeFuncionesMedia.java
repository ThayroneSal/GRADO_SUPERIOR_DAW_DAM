package practica01;

public class ejercicio01SobrecargaDeFuncionesMedia {

/*Ejercicio 1: Sobrecarga de Funciones para Media, Moda y Mediana.
 *Descripción: Crea un programa que implemente una función sobrecargada llamada
 *"calcular" que realice las siguientes operaciones dependiendo del tipo
 *de parámetro recibido:
 *1.	Media (int[]): Calcula la media de un arreglo de números enteros.
 *2.	Moda (double[]): Encuentra el valor más frecuente en un arreglo de números 
 *decimales.
 *3.	Mediana (String[]): Determina la mediana (orden alfabético) de un arreglo de
 *cadenas.
 *Requisitos:
 *1.	Implementa tres versiones de la función "calcular" para manejar enteros, 
 *decimales y cadenas.
 *2.	Muestra ejemplos para cada caso.
 */

 /**
  * @author Thayrone
  *@version 1.0
  */

 public static void main(String[] args) {
    int[] numeros = {1,2,3,4,5,6,7,8,9,10};
    double[] numeros2 = {1.1,2.2,2.2,4.4,5.5,5.5};
    String[] cadenas = {"a","b","c","d","e","f","g"};
    
    System.out.println("La media de los números es: " + calcular(numeros));
    System.out.println("La moda de los números es: " + calcular(numeros2));
    System.out.println("La mediana de los números es: " + calcular(cadenas));

    
}
 public static double calcular(int[] numeros){
     double media = 0;
     for (int i = 0; i < numeros.length; i++) {
         media += numeros[i];
     }
     return media/numeros.length;
 }
 public static double calcular(double[] numeros){
     double moda = 0;
     int contador = 0;
     int contador2 = 0;
     for (int i = 0; i < numeros.length; i++) {
         for (int j = 0; j < numeros.length; j++) {
             if (numeros[i] == numeros[j]) {
                 contador++;
             }
         }
         if (contador > contador2) {
             contador2 = contador;
             moda = numeros[i];
         }
         contador = 0;
     }
     return moda;
 }

 public static String calcular(String[] cadenas){
     String mediana = "";
     for (int i = 0; i < cadenas.length; i++) {
         for (int j = 0; j < cadenas.length; j++) {
             if (cadenas[i].compareTo(cadenas[j]) < 0) {
                 String aux = cadenas[i];
                 cadenas[i] = cadenas[j];
                 cadenas[j] = aux;
             }
         }
     }
     if (cadenas.length % 2 == 0) {
         mediana = cadenas[cadenas.length/2 - 1] + " y " + cadenas[cadenas.length/2];
     } else {
         mediana = cadenas[cadenas.length/2];
     }
     return mediana;
 }
}

// Actividade de ENTORNOS. (GITHUB)
// Commit: Guarda tus cambios localmente.
// Push: Envía tus commits locales al repositorio remoto.
// Pull: Trae y fusiona los cambios del repositorio remoto a tu copia local.

// Con el Commit se puede usar para realizar cambios en el codigo 
// Agregar, modificar o elimininar archivos, se debe realizar un commit estos cambios
// para que pueda resgitra en el historial del repositorio y cada commit tiene un
// mensaje asociado que describe lo que se ha camiado.

// Con el Push despues de realizar los commit se hace los push para guardalos en el 
// servidor remoto, así los demas miembros pueden ver los cambios y a su ves trabajar
// sobre ellos.

// Con el Pull es parecido al Push, pero ahora lo que hace es descarga el archivo a 
// nuestra maquina desde el servidor remoto, asi asegurando que tu copia este 
// actualizada, es decir lo descarga y luego funciona los cambios con tu ruma actual.