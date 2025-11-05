public class Ejercicio01 {
    /* 1. Elaboración de las funciones de dibujado del triángulo rectángulo
* Se pide a continuación la siguiente función:
* public static void leftTriangle (int nrows, String simbol)
* ● Se quiere que se represente el siguiente de altura nrows
* ● Ej: leftTriangle(5, “* “)
*
* *
* * *
* * * *
* * * * * */

//Con este Ejercicio me he liado bastante y mira que era facil, al principio me he pegado como 1´5h intentando hacerlo como un array bidimencional, hasta que empece a buscar informacion de como hacerlo. y simplesmente era crear una funcion, Sinceramente al principio no supe hacerlo después de buscar infomación me di cuenta de lo facil que era.

public static void  leftTriangle( int nlineas, String simbolo){

    for (int i = 1; i <= nlineas; i++) {  //interuactua con el n de linas que especificas y las posiciones.
        for (int j = 1; j <= i; j++){     // interactua con el simbolo que vas a imprimir.
            System.out.print(simbolo);
        }

        System.out.println();
    }
}

public static void main(String[] args) {

    System.out.println("---Triango a Izquierda (5 lienas, simbolo *)");
    leftTriangle(5,"*");
    
    /*String [][] tablero = new String[5][5];

tablero [0][0] = "*";
tablero [0][1] = "*";
tablero [0][2] = "*";
tablero [0][3] = "*";
tablero [0][4] = "*";

tablero [1][0] = "*";
tablero [1][1] = "*";
tablero [1][2] = "*";
tablero [1][3] = "*";
tablero [1][4] = "*";

    for (int i = 0; i < 5 ; i++){
        
        for (int j = 0; j < tablero[i].length; j++ ){
            System.out.println(tablero[i][j] + "\t");
            
        }
        System.out.println();
    }
// Mostrar tablero 
for (int fila = 0; fila < tablero.length; fila++){
    for(int columna = 0; columna < tablero[fila].length; columna++);{
    System.out.println("[ " + tablero[fila][columna] + "]");
    }
    System.out.print("\n");
}*/





}

}
