public class Ejercicio03 {
/*
 * 3. Escribe un programa en Java que realice las siguientes acciones:

    a. Crea un array bidimensional de tamaño 3x3 con valores enteros (asignale valores
    iniciales).
    b. Calcula la suma de los elementos de cada fila.
    c. Imprime el resultado de la suma de cada fila en el formato:
        La suma de la fila 1 es: <suma>
        La suma de la fila 2 es: <suma>
        La suma de la fila 3 es: <suma>
 */

 // en este ejercicio tambien me ha costado bastante, se me olvido crear una variable para guardar la suma de cada fila y al no tenerla no podia hacer la suma correctamente

public static void main(String[] args) {

    int matriz [][] = {{8,5,3},{9,4,2},{1,7,6}};

    for (int i = 0; i < matriz.length; i++){
        int sumaFila = 0; // se me olvidor crear esta variable para guarda la suma de la fila y reniciar la siguiente
    
        for (int j = 0; j < matriz[i].length; j++){
            sumaFila = sumaFila + matriz[i][j]; // acumula la suma de cada fila
           // System.out.print(matriz[i][j]);
        }
        System.out.println();
        System.out.println("La suma de la fila " + (i + 1) + " es: " + sumaFila);
    
    }


    }
}
