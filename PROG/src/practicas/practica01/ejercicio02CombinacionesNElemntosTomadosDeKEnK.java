package practica01;

import java.util.Scanner;

public class ejercicio02CombinacionesNElemntosTomadosDeKEnK {

/*Ejercicio 2: Combinaciones de n elementos tomados de k en k.
 * Descripción: Escribe un programa que calcule las combinaciones posibles de n 
 * elementos tomados de k en k utilizando recursividad. Una combinación es un 
 * subconjunto de tamaño k extraído de un conjunto den elementos.
 * Fórmula de combinaciones:
 * C(n,k)={1,si k=0 o k=nC(n−1,k−1)+C(n−1,k),si 0<k<n
 
 * Requisitos
 * 1.	El usuario debe ingresar n (el tamaño del conjunto) y k (el tamaño del 
 * subconjunto).
 * 2.	Usa recursividad para calcular el número total de combinaciones.
 * 3.	Muestra el número total de combinaciones posibles.
 */


// revisar este ejercicio, no se si esta bien

public class Combinaciones {

    // Método recursivo para calcular C(n, k)
    public static int combinaciones(int n, int k) {
        // Caso base: C(n, 0) = 1 y C(n, n) = 1
        if (k == 0 || k == n) {
            return 1;
        }
        // Llamada recursiva
        return combinaciones(n - 1, k - 1) + combinaciones(n - 1, k);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese n y k
        System.out.print("Ingrese el tamaño del conjunto (n): ");
        int n = scanner.nextInt();

        System.out.print("Ingrese el tamaño del subconjunto (k): ");
        int k = scanner.nextInt();

        // Validar que n y k sean válidos
        if (n < 0 || k < 0 || k > n) {
            System.out.println("Valores inválidos. Asegúrese de que n >= 0, k >= 0 y k <= n.");
        } else {
            // Calcular el número total de combinaciones
            int resultado = combinaciones(n, k);
            // Mostrar el resultado
            System.out.println("El número total de combinaciones de " + n + " elementos tomados de " + k + " en " + k + " es: " + resultado);
        }

        scanner.close();
    }
}
    }



