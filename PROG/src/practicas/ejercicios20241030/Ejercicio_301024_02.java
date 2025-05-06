package ejercicios20241030;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio_301024_02 {



// Enunciado:
// Escribe un programa que solicite al usuario elegir una opción de un menú:
// 1. Saludar
// 2. Despedirse
// 3. Decir el día de la semana
// 4. Salir
// Dependiendo de la opción seleccionada, el programa debe imprimir el mensaje correspondiente.

    public static void main (String [] args) {
	 
	 System.out.println(" Hola usuario, elige una de estas 4 opciones (poniendo solo el numero correspondiente.");
	 System.out.println("1. Saludar");
	 System.out.println("2. Despedirse");
	 System.out.println("3. Decir el dia de la semana");
	 System.out.println("4. Salir");
	 
	 Scanner escaner = new Scanner (System.in);
	 int opcion = escaner.nextInt();
	 
	 switch (opcion) {
	 
	 case 1:
		 System.out.println("Hola");
		 break;
	 case 2:
		 System.out.println("Adios");
		 break;
	 case 3:
		 LocalDate fechaDeHoy = LocalDate.now();
		 DayOfWeek diaDeLaSemana = fechaDeHoy.getDayOfWeek();
		 String diaCastellano = diaDeLaSemana.getDisplayName(TextStyle.FULL, new Locale ("es", "ES"));
		 System.out.println("Hoy es "+diaDeLaSemana);
		 break;
	 case 4: 
		 System.out.println("Saliendo...");
		 default:
			 System.out.println("haz el favor y pon correcto la proxima vez, que son solo 4 numeros");
    }
			 
	 if (opcion == 1) {
		 System.out.println("Hola");
	 }
    	
	 else if (opcion ==2) {
	 System.out.println("Adios");
 }
	 else if (opcion ==3) { 
	 LocalDate fechaDeHoy = LocalDate.now();
	 DayOfWeek diaDeLaSemana = fechaDeHoy.getDayOfWeek();
	 String diaCastellano = diaDeLaSemana.getDisplayName(TextStyle.FULL, new Locale ("es", "ES"));
	 System.out.println("Hoy es "+diaDeLaSemana);
	 }
	 else if (opcion==4) {
		 System.out.println("Saliendo...");
	 }
	 else {
		 System.out.println("haz el favor y pon correcto la proxima vez, que son solo 4 numeros");
		 
	 }
	 escaner.close();
	 
    }
}
 
 



