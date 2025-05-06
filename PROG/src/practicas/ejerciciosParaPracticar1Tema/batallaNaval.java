package ejerciciosParaPracticar1Tema;

import java.util.Random;
import java.util.Scanner;

public class batallaNaval {

    public static void main (String [] args){

        final String ROJO = "\u001B[31m";
        final String AZUL = "\u001B[34m";
        final String RESET = "\u001B[0m";

        int[][] tablero = new int[5][5];
        Random aleatorio = new Random();
        
        int barcosColocados = 0;
        int[][] tableroVisible = new int[5][5];
        Scanner entrada = new Scanner(System.in);
        int intentos = 0;
        int aciertos = 0;

        while(barcosColocados<3) {
            int fila = aleatorio.nextInt(5);
            int columna = aleatorio.nextInt(5);
            if (tablero[fila][columna]==0){
                tablero[fila][columna]=1;
                barcosColocados++;
            }
        }
        System.out.println(" --- BATALLA NAVAL SIMPLIFICADA v2.0 ++ --- ");
        System.out.println("Estimado usuario, aquí tienes tu campo de batalla. Tendrás que atacar a mis barcos, que yo he escondido entre estas filas y columnas. Cada barco ocupa una única posición, además de que pueden o no estar juntos. Tienes que indicar una fila (del 1 al 5 de arriba a abajo) y una columna (de izquierda a derecha). Tienes hasta 10 intentos para vencerme. De lo contrario, habrás perdido EL JUEGO.");
        for(int i=0;i<tableroVisible.length; i++){
            for(int j=0;j<tableroVisible[i].length; j++){
                System.out.print(" - ");
            }
            System.out.println();
        }
        System.out.println("¡Mucha suerte!\n");
        

        while(intentos<10){
            System.out.println("Intento nº"+(intentos+1));
            //Le pedimos al usuario las coordenadas.
            System.out.println("Oye usuario, hazme el favor, dime la fila a la que deseas disparar. Pero no te equivoques, dame una entre 1 o 5.");
            int filaUsuario = entrada.nextInt()-1;
            System.out.println("Y ahora, ya que estás, la columna...");
            int columnaUsuario = entrada.nextInt()-1;

            //Guardo la tirada en memoria.
            tableroVisible[filaUsuario][columnaUsuario]=1;

            //Respondo al usuario según haya acertado o no.
            if (tablero[filaUsuario][columnaUsuario]==1){
                System.out.println("¡Tocado!");
                aciertos++;
            }else{
                System.out.println("Agua");
            }

            //Muestro por pantalla el estado del campo de batalla actual.
            for(int i=0;i<tableroVisible.length; i++){
                for(int j=0;j<tableroVisible[i].length; j++){
                    if (tableroVisible[i][j]==1){
                        if(tablero[i][j]==1) { //Si acertó es rojo.
                            System.out.print(" "+ROJO+"X"+" "+RESET);
                        }else{ //Si falló es azul
                            System.out.print(" "+AZUL+"~"+" "+RESET);
                        }
                    }else{ //Si no ha disparado a esta casilla, es blanco.
                        System.out.print(" - ");
                    }
                }
                System.out.println();
            }
            if(aciertos == 3){
                System.out.println("¡Enhorabuena: has ganado!");
                break;
            }
            intentos++;
        }
        if (intentos==10){
            System.out.println("Derrota. Los barcos estaban en estas posiciones:");
            for(int i=0;i<tablero.length; i++){
                for(int j=0;j<tablero[i].length; j++){
                    if(tablero[i][j]==1) { 
                        System.out.print(" "+ROJO+"X"+" "+RESET);
                    }else{ 
                        System.out.print(" "+AZUL+"~"+" "+RESET);
                    }
                }
                System.out.println();
            }
        }
        System.out.println("¡Gracias por participar!");
        entrada.close();
    }

    }
    

