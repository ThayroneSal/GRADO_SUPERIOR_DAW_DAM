
package ejerciciosParaPracticar1Tema;

import java.util.Scanner;

public class ejercicio_gestion_notas {
    
public static void main (String [] args) {
            
            double[][] notasProgramacion = {{4.0,4.5,3.8,4.2,3.5},{8.0,7.5,9.0,8.3,8.0},{7.0,6.5,7.5,6.8,7.5}};
            double[][] notasEntornos ={{4.5,3.0,4.8,4.0},{7.5,8.2,7.8,8.5},{6.5,7.0,7.5,6.8}};
    
            Scanner entrada = new Scanner(System.in);
    
            final String LETRA_ROJA = "\u001B[31m";
            final String RESET = "\u001B[0m";
            
            int opcionPrincipal;
            int opcionSecundaria;
    
            do{
                System.out.println("\n--- MENÚ PRINCIPAL ---");
                System.out.println("1. Notas de Programación");
                System.out.println("2. Notas de Entornos de Desarrollo");
                System.out.println("3. Salir");
                System.out.println("Elige una opción: ");
                opcionPrincipal = entrada.nextInt();
                
                switch (opcionPrincipal){
                    case 1:
                        do{
                            System.out.println("\n--- PROGRAMACIÓN ---");
                            System.out.println("1. Ver notas");
                            System.out.println("2. Cambiar nota");
                            System.out.println("3. Mostrar nota final");
                            System.out.println("4. Volver al menú principal");
                            System.out.println("Elige una opción: ");
                            opcionSecundaria = entrada.nextInt();
                            switch (opcionSecundaria) {
                                case 1:
                                    System.out.println("\n--- NOTAS DE PROGRAMACIÓN ---");
                                    System.out.printf("%-20s %-20s %-20s %n","Andrés Mateo", "Mar Beamud", "Luis Miguel Richard");
                                    for (int columna = 0; columna < notasProgramacion[0].length; columna++){
                                        for (int fila = 0; fila < notasProgramacion.length; fila++){
                                            if(notasProgramacion[fila][columna]<5){
                                                System.out.printf(LETRA_ROJA+"%-20.2f "+RESET,notasProgramacion[fila][columna]);
                                            }else{ 
                                                System.out.printf("%-20.2f ",notasProgramacion[fila][columna]);
                                            }
                                        }
                                        System.out.println();
                                    }
                                    break;
                                case 2:
                                    System.out.println("Indica primero el estudiante del que vas a cambiar la nota. \n 1 para Andrés \n 2 para Mar \n 3 para Richard");
                                    int indiceEstudiante = entrada.nextInt()-1;
    
                                    if(indiceEstudiante<0 || indiceEstudiante>notasProgramacion.length){
                                        System.out.println("No existe ese estudiante en mi base de datos.");
                                    }else{
                                        System.out.println("Ahora introduce el índice del examen cuya nota quieras modificar (entre el 1 y el "+notasProgramacion[indiceEstudiante].length+"): ");
                                        int indiceNota = entrada.nextInt()-1;
                                        if(indiceNota<0 || indiceNota>notasProgramacion[indiceEstudiante].length){
                                            System.out.println("No existe ese índice de examen.");
                                        }else{
                                            System.out.println("Dime la nota que quieres poner, utilizando una , para los decimales: ");
                                            double notaNueva = entrada.nextDouble();
                                            notasProgramacion[indiceEstudiante][indiceNota] = notaNueva;
                                            System.out.println("¡Nota actualizada!");
                                        }
                                    }
                                    break;
                                case 3:
                                    System.out.println("--- NOTAS FINALES ---");
                                    for(int i = 0; i<notasProgramacion.length;i++){
                                        int numeroEntregas = notasProgramacion[i].length - 1;
                                        double sumaEntregas = 0;
                                        for(int j = 0; j<numeroEntregas;j++){
                                            sumaEntregas += notasProgramacion[i][j];
                                        }
                                        double mediaEntregas = sumaEntregas / numeroEntregas;
                                        double notaExamen = notasProgramacion[i][numeroEntregas];
                                        System.out.println("La nota final del estudiante nº"+(i+1)+" es: "+(mediaEntregas*0.6+notaExamen*0.4));
                                    }
                                    break;
                                case 4:
                                    System.out.println("Volviendo al menú principal...");
                                    break;
                                default:
                                    System.out.println("Opción no válida");
                            }
                        }while(opcionSecundaria!=4);
                        break;
    
                    case 2:
                        do{
                            System.out.println("\n--- PROGRAMACIÓN ---");
                            System.out.println("1. Ver notas");
                            System.out.println("2. Cambiar nota");
                            System.out.println("3. Mostrar nota final");
                            System.out.println("4. Volver al menú principal");
                            System.out.println("Elige una opción: ");
                            opcionSecundaria = entrada.nextInt();
                            switch (opcionSecundaria) {
                                case 1:
                                    System.out.println("\n--- NOTAS DE ENTORNOS DE DESARROLLO ---");
                                    System.out.printf("%-20s %-20s %-20s %n","Andrés Mateo", "Mar Beamud", "Luis Miguel Richard");
                                    for (int columna = 0; columna < notasEntornos[0].length; columna++){
                                        for (int fila = 0; fila < notasEntornos.length; fila++){
                                            if(notasEntornos[fila][columna]<5){
                                                System.out.printf(LETRA_ROJA+"%-20.2f "+RESET,notasEntornos[fila][columna]);
                                            }else{ 
                                                System.out.printf("%-20.2f ",notasEntornos[fila][columna]);
                                            }
                                        }
                                        System.out.println();
                                    }
                                    break;
                                case 2:
                                    System.out.println("Indica primero el estudiante del que vas a cambiar la nota. \n 1 para Andrés \n 2 para Mar \n 3 para Richard");
                                    int indiceEstudiante = entrada.nextInt()-1;
    
                                    if(indiceEstudiante<0 || indiceEstudiante>notasEntornos.length){
                                        System.out.println("No existe ese estudiante en mi base de datos.");
                                    }else{
                                        System.out.println("Ahora introduce el índice del examen cuya nota quieras modificar (entre el 1 y el "+notasProgramacion[indiceEstudiante].length+"): ");
                                        int indiceNota = entrada.nextInt()-1;
                                        if(indiceNota<0 || indiceNota>notasEntornos[indiceEstudiante].length){
                                            System.out.println("No existe ese índice de examen.");
                                        }else{
                                            System.out.println("Dime la nota que quieres poner, utilizando una , para los decimales: ");
                                            double notaNueva = entrada.nextDouble();
                                            notasEntornos[indiceEstudiante][indiceNota] = notaNueva;
                                            System.out.println("¡Nota actualizada!");
                                        }
                                    }
                                    break;
                                case 3:
                                    System.out.println("--- NOTAS FINALES ---");
                                    for(int i = 0; i<notasEntornos.length;i++){
                                        int numeroEntregas = notasEntornos[i].length - 1;
                                        double sumaEntregas = 0;
                                        for(int j = 0; j<numeroEntregas;j++){
                                            sumaEntregas += notasEntornos[i][j];
                                        }
                                        double mediaEntregas = sumaEntregas / numeroEntregas;
                                        double notaExamen = notasEntornos[i][numeroEntregas];
                                        System.out.println("La nota final del estudiante nº"+(i+1)+" es: "+(mediaEntregas*0.6+notaExamen*0.4));
                                    }
                                    break;
                                case 4:
                                    System.out.println("Volviendo al menú principal...");
                                    break;
                                default:
                                    System.out.println("Opción no válida");
                            }
                        }while(opcionSecundaria!=4);
                        break;
    
                    case 3:
                        System.out.println("¡Hasta luego!");
                        break;
                    
                    default:
                        System.out.println("Opción no válida.");
                }
    
            } while (opcionPrincipal != 3);
            entrada.close();
            
        }    
    
    }