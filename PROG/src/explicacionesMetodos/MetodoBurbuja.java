package explicacionesMetodos;

public class MetodoBurbuja {

    /* BubbleSort */
        public static void main(String[] args) {
            int[] arreglo = {64, 34, 25, 12, 22, 11, 90};
    
            System.out.println("Arreglo original:");
            imprimirArreglo(arreglo);
    
            // Llamada al método de ordenamiento burbuja
            ordenamientoBurbuja(arreglo);
    
            System.out.println("\nArreglo ordenado:");
            imprimirArreglo(arreglo);
        }
    
        // Método para ordenar un arreglo usando Bubble Sort
        public static void ordenamientoBurbuja(int[] arreglo) {
            int n = arreglo.length;
            boolean intercambio;
    
            for (int i = 0; i < n - 1; i++) {
                intercambio = false;
    
                // Comparar elementos adyacentes
                for (int j = 0; j < n - 1 - i; j++) {
                    if (arreglo[j] > arreglo[j + 1]) {
                        // Intercambiar elementos
                        int temp = arreglo[j];
                        arreglo[j] = arreglo[j + 1];
                        arreglo[j + 1] = temp;
                        intercambio = true;
                    }
                }
    
                // Si no hubo intercambios, el arreglo ya está ordenado
                if (!intercambio) {
                    break;
                }
            }
        }
    
        // Método para imprimir un arreglo
        public static void imprimirArreglo(int[] arreglo) {
            for (int i : arreglo) {
                System.out.print(i + " ");
            }
        }
    }

//     Explicación del código:
// Arreglo original:.

// El arreglo inicial es {64, 34, 25, 12, 22, 11, 90}.

// Método ordenamientoBurbuja:

// Recorre el arreglo comparando elementos adyacentes.

// Si un elemento es mayor que el siguiente, se intercambian.

// El proceso se repite hasta que no se necesiten más intercambios.

// Optimización:

// Se usa una variable intercambio para detectar si se realizó algún intercambio en una pasada completa.

// Si no hubo intercambios, el arreglo ya está ordenado y el algoritmo termina.

// Método imprimirArreglo:

// Imprime los elementos del arreglo.

// Salida del programa:
// Copy
// Arreglo original:
// 64 34 25 12 22 11 90 

// Arreglo ordenado:
// 11 12 22 25 34 64 90 
// Paso a paso del algoritmo:
// Primera pasada:

// Compara 64 y 34 → intercambia → {34, 64, 25, 12, 22, 11, 90}.

// Compara 64 y 25 → intercambia → {34, 25, 64, 12, 22, 11, 90}.

// Compara 64 y 12 → intercambia → {34, 25, 12, 64, 22, 11, 90}.

// Compara 64 y 22 → intercambia → {34, 25, 12, 22, 64, 11, 90}.

// Compara 64 y 11 → intercambia → {34, 25, 12, 22, 11, 64, 90}.

// Compara 64 y 90 → no intercambia.

// Segunda pasada:

// Compara 34 y 25 → intercambia → {25, 34, 12, 22, 11, 64, 90}.

// Compara 34 y 12 → intercambia → {25, 12, 34, 22, 11, 64, 90}.

// Compara 34 y 22 → intercambia → {25, 12, 22, 34, 11, 64, 90}.

// Compara 34 y 11 → intercambia → {25, 12, 22, 11, 34, 64, 90}.

// Compara 34 y 64 → no intercambia.

// Tercera pasada:

// Compara 25 y 12 → intercambia → {12, 25, 22, 11, 34, 64, 90}.

// Compara 25 y 22 → intercambia → {12, 22, 25, 11, 34, 64, 90}.

// Compara 25 y 11 → intercambia → {12, 22, 11, 25, 34, 64, 90}.

// Compara 25 y 34 → no intercambia.

// Cuarta pasada:

// Compara 12 y 22 → no intercambia.

// Compara 22 y 11 → intercambia → {12, 11, 22, 25, 34, 64, 90}.

// Compara 22 y 25 → no intercambia.

// Quinta pasada:

// Compara 12 y 11 → intercambia → {11, 12, 22, 25, 34, 64, 90}.

// Compara 12 y 22 → no intercambia.

// Sexta pasada:

// No se realizan intercambios → el arreglo está ordenado.

// Complejidad temporal:
// Peor caso: 
// O(n2) O(n2) (cuando el arreglo está en orden inverso).

// Mejor caso: 
// O(n) O(n) (cuando el arreglo ya está ordenado).

