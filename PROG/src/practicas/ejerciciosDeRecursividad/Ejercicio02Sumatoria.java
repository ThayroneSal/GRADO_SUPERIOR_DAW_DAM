package ejerciciosDeRecursividad;

public class Ejercicio02Sumatoria {

    /*Sumatoria de números
Escribe una función recursiva que calcule la suma de los números del 1 al ( n ).
Ejemplo: suma(5) = 1 + 2 + 3 + 4 + 5 = 15. */

public static void main(String[] args) {

       System.out.println(suma(5));

       //Abajo hay otro ejemplo de como hacerlo con varargs y otro tipo de bucle for

    // System.out.println(sumar(1,2,3));
    // System.out.println(sumar(1,2,3,4));

}
public static int suma ( int numeros){
    if (numeros < 0) return -1;
    if (numeros == 0) return 0;
    return numeros + suma(numeros -1 );

/*  public static int sumar ( int... numeros){ //esto es lo de usar varargs (los puntitos)
 *     int suma = 0;
 *     for (int i = 0; i < numeros.length; i++){
 *         suma+= numeros [i];
 *     }
 *     return suma;
}*/

/*public static int sumar(int... numeros){ otra manera de hacer con el bucle for - estudiar esto
    int suma = 0;
    for (int num : numeros){
        suma += num;
    }
    return suma; 
}*/
}
}