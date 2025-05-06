package Practica_BatallaNaval;

import java.util.Scanner;

public class ejemploBatallaNaval {
	 

	public static void main(String[] args) {
	       
	        int[][] tablero = new int[5][5];
	        boolean[][] intentos = new boolean[5][5];
	        int barcosRestantes = 3; 
	        int maxIntentos = 10; 
	        Scanner scanner = new Scanner(System.in);

	        
	        tablero[1][2] = 1; 
	        tablero[3][0] = 1; 
	        tablero[4][4] = 1; 
	        
	        String RESET = "\u001B[0m";
			 String RED = "\u001B[31m";
			 String BLUE = "\u001B[34m";

	     
	        int intentosRealizados = 0;
	        while (intentosRealizados < maxIntentos && barcosRestantes > 0) {
	            System.out.println("Tablero actual:");
	            mostrarTablero(tablero, intentos); 

	            System.out.print("Introduce la fila (0-4): ");
	            int filaUsuario = scanner.nextInt();
	            System.out.print("Introduce la columna (0-4): ");
	            int columnaUsuario = scanner.nextInt();

	            if (filaUsuario < 0 || filaUsuario >= 5 || columnaUsuario < 0 || columnaUsuario >= 5) {
	                System.out.println("Coordenadas inválidas. Intenta de nuevo.");
	                continue;
	            }

	            if (!intentos[filaUsuario][columnaUsuario]) { 
	                intentos[filaUsuario][columnaUsuario] = true;

	                if (tablero[filaUsuario][columnaUsuario] == 1) { 
	                    System.out.println("¡Tocado!");
	                    tablero[filaUsuario][columnaUsuario] = -1; 
	                    barcosRestantes--; 
	                } else {
	                    System.out.println("Agua");
	                    tablero[filaUsuario][columnaUsuario] = -2;
	                }
	                intentosRealizados++;
	            } else {
	                System.out.println("Ya has disparado a esta posición. Intenta otra vez.");
	            }
	        }

	        
	        if (barcosRestantes == 0) {
	            System.out.println("¡Victoria!");
	        } else {
	            System.out.println("Derrota. Los barcos estaban en estas posiciones:");
	            mostrarTableroRevelado(tablero);
	        }

	        scanner.close();
	    }

	   private static void mostrarTablero(int[][] tablero, boolean[][] intentos) {
	        System.out.print("   "); 
	        for (int i = 0; i < 5; i++) {
	            System.out.print(i + " ");
	        }
	        System.out.println();

	        for (int i = 0; i < 5; i++) {
	            System.out.print(i + " | "); 
	            for (int j = 0; j < 5; j++) {
	                if (!intentos[i][j]) { 
	                    System.out.print(". "); 
	                } else if (tablero[i][j] == -1) { 
	                    System.out.printf( "X " ); 
	                } else if (tablero[i][j] == -2) { 
	                    System.out.printf(  "~ " ); 
	                } else {
	                    System.out.print(". "); 
	                }
	            }
	            System.out.println();
	        }
	    }

	    private static void mostrarTableroRevelado(int[][] tablero) {
	        System.out.print("   "); 
	        for (int i = 0; i < 5; i++) {
	            System.out.print(i + " ");
	        }
	        System.out.println();

	        for (int i = 0; i < 5; i++) {
	            System.out.print(i + " | ");
	            for (int j = 0; j < 5; j++) {
	                if (tablero[i][j] == 1) { 
	                    System.out.print("B "); 
	                } else if (tablero[i][j] == -1) { 
	                    System.out.print("X "); 
	                } else if (tablero[i][j] == -2) { 
	                    System.out.print("~ "); 
	                } else {
	                    System.out.print(". "); 
	                }
	            }
	            System.out.println();
	        }
	    }
	}

