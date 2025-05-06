package ejercicioParaExamen;

import java.util.Scanner;

public class actividadEnClase {

    /* Rellenar una matriz de palabras
    *Crea un programa que permita trabajar con una matriz de tamaño 2x2 de tipo String. El programa debe realizar los siguientes pasos:
    *Crear una matriz de tamaño 2x2 para almacenar cadenas de texto.
    *Pedir al usuario que introduzca 4 palabras, una para cada posición de la matriz.
    *Mostrar la matriz completa en formato de tabla.
    *Mostrar por pantalla los elementos de la diagonal principal (de la esquina superior izquierda a la esquina inferior derecha), 
    *concatenando un espacio entre ellos.
    *Terminar el programa agradeciendo al usuario.
    */

    public static void main(String[] args) {

String [][] matriz = new String[2][2];
Scanner entrada = new Scanner(System.in);
System.out.println(" --- MATRIZ DE DOS POR DOS ---");
		System.out.println("Hola usuario, en esta ocasión voy a necesitar que me escribas 4 frutas. Te las voy a ir pidiendo una por una.");
		System.out.println("Dame la primera fruta. ");
		String fruta1 = entrada.nextLine();
		System.out.println("Dame la segunda fruta. ");
		String fruta2 = entrada.nextLine();
		System.out.println("Dame la tercera fruta. ");
		String fruta3 = entrada.nextLine();
		System.out.println("Dame la cuarta fruta. ");
		String fruta4 = entrada.nextLine();
		matriz[0][0]=fruta1;
		matriz[0][1]=fruta2;
		matriz[1][0]=fruta3;
		matriz[1][1]=fruta4;
		System.out.println();
		System.out.println("-----TABLA-----");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("---------------");
		System.out.println();
		System.out.println("Y la diagonal principal es: ");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if(i == j) System.out.print("\u001B[31m" +matriz[i][j]+"\t"+"\u001B[0m");
			}
		}
		System.out.println("\n");
		System.out.println("Gracias y que pases un afrutado día.");
	}

}



