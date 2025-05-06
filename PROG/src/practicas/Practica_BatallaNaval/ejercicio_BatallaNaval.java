package Practica_BatallaNaval;

import java.util.Scanner;




public class ejercicio_BatallaNaval {
	
	/* Ejercicio: Batalla Naval Simplificada
	 *Descripción
	 *Vas a programar una versión simplificada de Batalla Naval. El programa generará un tablero de 5x5 
	 *en el que se ocultarán barcos y el usuario intentará adivinar sus posiciones.

	 *Requisitos del Programa
	 *Generar el tablero:

	 *Crea un array bidimensional de 5x5 que represente el tablero.
	 *Llena el tablero con ceros 0.
	 *Coloca aleatoriamente 3 barcos representados por el número 1.
	 *(OPCIONAL) Añade el nombre de cada fila y columna, usando para ello las opciones de formato que viste 
	 *en clase el otro día.
	 *
	 *Juego del usuario:
     *
	 *Pide al usuario que introduzca las coordenadas (fila y columna) para intentar "disparar" a un barco.
	 *Si acierta, muestra un mensaje como "¡Tocado!" y marca la posición con una X roja.
	 *Si falla, muestra "Agua" y marca la posición con un ~  (alt gr + 4) azul.
	 *(OPCIONAL) Por supuesto, si quieres adornarlo aún más, eres bienvenido de hacerlo. Lo valoraré positivamente 
	 *para compensar posibles errores. 
	 *Condiciones:

	 *El usuario tiene un máximo de 10 intentos.
	 *Si encuentra los 3 barcos antes de que se acaben los intentos, el juego termina y se muestra "¡Victoria!".
	 *Si se agotan los intentos sin encontrar todos los barcos, muestra "Derrota. Los barcos estaban en estas 
	 *posiciones:" seguido del tablero con las posiciones reveladas.
	 *Salida del tablero:

	 *Después de cada turno, muestra el tablero actualizado. Solo las posiciones que el usuario ha adivinado 
	 *deben revelarse.
	 

	 *FECHA LÍMITE DE ENTREGA: JUEVES 28 DE NOVIEMBRE A LAS 18:00H (lo corregiremos entonces).
	 *Método de entrega: PDF CON EL CÓDIGO COPIADO Y PEGADO, SIN CAPTURAS (ALTERNATIVAMENTE SE PUEDE ENTREGAR 
	 *ENLACE A GITHUB) */
	
	
	public static void main(String [] args) {
		
		
		/*Crea un array bidimensional de 5x5 que represente el tablero.
		 *Llena el tablero con ceros 0.
		 *Coloca aleatoriamente 3 barcos representados por el número 1.
		 *(OPCIONAL) Añade el nombre de cada fila y columna, usando para ello las opciones de formato que viste 
		 *en clase el otro día. */
		
		
		
		int[][] tablero = new int[5][5];
		/*boolean[][] intentos = new boolean[5][5];*/ 
		int barcosRestantes = 3; 
		int maxIntentos = 10; 
		Scanner tablero1 = new Scanner(System.in);
		
		 String RESET = "\u001B[0m";
		 String RED = "\u001B[31m";
		 String BLUE = "\u001B[34m";
		 
		 tablero[3][4]=1;
		 tablero[2][3]=1;
		 tablero[0][1]=1;
		 
		 int rellenoTablero = 0;
		
		 for (int fila = 0; fila < 5; fila++) {
			 for(int columna = 0; columna < 5; columna++) {
				 tablero [fila][columna] = rellenoTablero;
				 rellenoTablero ++;
				 
				 System.out.println(tablero[fila][columna]);
		
			 
				
			 }
		 }
		 
		 
	

}
	}
