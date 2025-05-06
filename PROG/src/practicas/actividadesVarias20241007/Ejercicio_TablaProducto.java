package actividadesVarias20241007;

public class Ejercicio_TablaProducto {


	    public static void main(String[] args) {
	        // Ejercicio 3: Formatear una tabla de productos
	        // Imprime una tabla con columnas alineadas que muestre nombres de productos,
	        // cantidades y precios. Utiliza printf y códigos de formato.
	    	
	    	final String AZUL = "\u001B[34m";
	    	final String RESET = "\u001B[0m"; 
	    	final String ROJO = "\u001B[31m";
	    	System.out.printf(AZUL+"%-15s %-10s "+ROJO+ "%-10s %n"+RESET, "Producto", "Cantidad", "Precio"); /* % indica que la tabla va a la derecha el valor */
	    	System.out.printf(ROJO+"%-15s" +RESET+ "%-10d %.2f $%n", "Manzanas", 10, 10.5);
	    	System.out.printf("%-15s %-10d %.2f $%n", "Peras", 3, 6.333333);
	    	
	    }
	}
	
	
	
	

