package comparadorDeEdadesYDescuento;

	/*
	 * Ejercicio: "Comparador de Edades y Descuentos" Escribe un programa en Java
	 * que realice los siguientes pasos: 
	 * 
	 * Declara cuatro variables de tipo int para
	 * representar las edades de cuatro personas.
	 * 
	 *  Declara una variable double para representar el precio original de un producto, y una variable int para
	 * representar el descuento en porcentaje.
	 * 
	 *  Usa operadores booleanos para
	 * comparar las edades de las personas y establecer quién es la más joven y
	 * quién es la mayor. (Asume que no hay edades iguales para simplificarlo.)
	 * 
	 * Aplica el descuento solo si al menos dos personas son mayores de 18 años. En
	 * caso contrario, el precio del producto queda sin descuento.
	 * 
	 *  Realiza un casting explícito para convertir el descuento de int a double y luego aplica
	 * el descuento en el precio original. 
	 * 
	 * Imprime el precio final del producto y
	 * menciona si el descuento fue aplicado o no.
	 * 
	 */
public class Actividadprogramacion_02 {

	public static void main(String[] args) {
		

		int persona1 = 20;
		int persona2 = 18;
		int persona3 = 25;
		int persona4 = 30;
		
		double precioOriginal = 100.0;
		int descuentoPorcentaje = 20;
		
		/*determina quien es la persona mayor y menor */
		
		int mayor = Math.max(Math.max(persona1, persona2), Math.max(persona3, persona4));
		int menor = Math.min(Math.min(persona1, persona2), Math.min(persona3, persona4));
		
		/* contar cuantas personas son mayores de 18*/  /*esto es un contador*/
		int mayoresDe18 = 0;
		if (persona1 > 18) mayoresDe18++;
		if (persona2 > 18) mayoresDe18++;
		if (persona3 > 18) mayoresDe18++;
		if (persona4 > 18) mayoresDe18++;
		
		/* aplica el descuento si dos personas son mayores de 18 */
		boolean descuentoAplicado = false;
		double precioFinal = precioOriginal;
		
		/*realiza el casting de double y aplica el descuento*/
		if (mayoresDe18 >= 2) {
			double descuentoDecimal = (double) descuentoPorcentaje / 100;
			precioFinal = precioOriginal * (1 - descuentoDecimal);
			descuentoAplicado = true;
			}
		
		/* imprime precio final y si se aplico el descuento */
		System.out.println("Precio original: " + precioOriginal+ " euros");
		System.out.println("Precio final: " + precioFinal + " euros");
		if (descuentoAplicado) {
		System.out.println("Descuento aplicado: " + descuentoPorcentaje + "%");
		} else {
		System.out.println("No se aplicó descuento.");
		}
		
		/*Quien es la mas jovem y la mayor*/
		System.out.println("La persona más joven tiene: " + menor + " años.");
	    System.out.println("La persona más Mayor tiene " + mayor+ " años");		
		
		
		
	}

}
