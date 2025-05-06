package actividadesVarias20241007;

public class Ejercicio_ComoPonerElTextoEnCursiva {

	public static void main(String[] args) {
		
		/*como puedo poner el texto en cursiva*/
		
		        String cursiva = "\u001B[3m"; // inicia el formato de cursiva usando ANSI 
		        String reset = "\u001B[0m"; // Restablecer formato, sirve para que el texto no siga en cursiva

		        System.out.println(cursiva + "Este texto está en cursiva." + reset);
		    }
		}
		
	// para usar ANSI primero usamos el codigo para llamar al unicade "\u001B[ despues aplicamos el valor que queremos según 
    //la tabla de ANSI ejemplo para llamar la cursiva se usa el 3m entonces el codigo quedaria "\u001B[3m"; siempre termina
   // ; y se pone entre comillas doble.
