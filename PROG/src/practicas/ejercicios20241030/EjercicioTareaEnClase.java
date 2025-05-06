package ejercicios20241030;

public class EjercicioTareaEnClase {

	public static void main(String[] args) {
		// Ejercicio: "Comparador de Edades y Descuentos"
		// Escribe un programa en Java que realice los siguientes pasos:
		// 1. Declara cuatro variables de tipo int para representar las edades de cuatro personas.
		// 2. Declara una variable double para representar el precio original de un producto, y una variable int para representar el descuento en porcentaje.
		// 3. Usa operadores booleanos para comparar las edades de las personas y establecer quién es la más joven y quién es la mayor. (Asume que no hay edades iguales para simplificarlo.)
		// 4. Aplica el descuento solo si al menos dos personas son mayores de 18 años. En caso contrario, el precio del producto queda sin descuento.
		// 5. Realiza un casting explícito para convertir el descuento de int a double y luego aplica el descuento en el precio original.
		// 6. Imprime el precio final del producto y menciona si el descuento fue aplicado o no.
		int edadA = 54;
		int edadB = 43;
		int edadC = 19;
		int edadD = 65;
		
		double precio = 19.66;
		int descuento = 20;
		
		int edadMaxima = edadA;
		if (edadMaxima<edadB) {
			edadMaxima=edadB;
		}
		if (edadMaxima<edadC) {
			edadMaxima=edadC;
		}
		if (edadMaxima<edadD) {
			edadMaxima=edadD;
		}
		
		int edadMinima = edadA;
		if (edadMinima>edadB) {
			edadMinima=edadB;
		}
		if (edadMinima>edadC) {
			edadMinima=edadC;
		}
		if (edadMinima>edadD) {
			edadMinima=edadD;
		}
		int contador = 0;
		if (edadA>18) {
			contador = contador + 1;
		}
		if (edadB>18) {
			contador++;
		}
		if (edadC>18) {
			contador++;
		}
		if (edadD>18) {
			contador++;
		}
		
		if(contador>=2) {
			double descuentoDecimal = (double) descuento /100;
			precio = precio * (1 - descuentoDecimal);
			System.out.println("El precio a pagar tras descuento es de "+precio+"€.");
		} else {
			System.out.println("No hay descuento, así que toca pagar "+precio+"€.");
		}
	}

}
