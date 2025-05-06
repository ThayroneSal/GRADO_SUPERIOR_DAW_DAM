package ejercicioParaExamen;

import java.util.Random;
import java.util.Scanner;

public class ejercicioExamenMasaPan2 {

    public static void main (String [] args){

        int[][] tablero = new int[4][4];
        Random aleatorio = new Random();
        int mazapanes = 0;
        while(mazapanes < 3){
            int fila = aleatorio.nextInt(4);
            int columna = aleatorio.nextInt(4);
            if (tablero[fila][columna]==0){
                tablero[fila][columna]=1;
                mazapanes++;
            }
        }
        /*
         * También podríamos haberlo hecho así:
         * tablero[1][0] = 1;
         * tablero[0][1] = 1;
         * tablero[1][1] = 1;
         */
        int intento = 0;
        int aciertos = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println(" --- BUSCA-MAZAPANES ---");
        System.out.println("En este tablero de 4x4 hay 3 mazapanes escondidos. Encuéntralos y ganarás... algo.");
        do{
            System.out.println("Introduce la fila: ");
            int fila = entrada.nextInt();
            System.out.println("Introduce la columna: ");
            int columna = entrada.nextInt();
            if (fila<0||columna<0||fila>3||columna>3){
                System.out.println("Tirada fuera del tablero. Intenta otra vez (cada coordenada va entre 0 y 3, primero filas y luego columnas).");
                continue;
            }
            intento++;
            System.out.println("Este es tu intento nº"+intento);
            if(tablero[fila][columna]==1){
                aciertos++;
                System.out.println("¡Has acertado! Quedan "+(3-aciertos)+" mazapanes por descubrir.");
                tablero[fila][columna]=0;
            }else{
                System.out.println("Has fallado, sigue intentándolo.");
            }
        }while(intento<8);
        entrada.close();
    }
}





