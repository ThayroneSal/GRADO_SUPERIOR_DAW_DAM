package ejercicios20241030;

public class EjercicioTarea {

    public static void main(String[] args) {
        // Edades de las personas (ahora veremos cómo se hace con Scanner) 
        int edad1 = 15;
        int edad2 = 22;
        int edad3 = 19;
        int edad4 = 17;
        
        // Precio del producto y porcentaje de descuento
        double precioOriginal = 100.0;
        int descuento = 20;

        // Comparadores booleanos para determinar si cada persona es mayor de 18 años (habitualmente ponemos lo de "es" como inicio)
        boolean esMayorEdad1 = edad1 > 18;
        boolean esMayorEdad2 = edad2 > 18;
        boolean esMayorEdad3 = edad3 > 18;
        boolean esMayorEdad4 = edad4 > 18;

        // Suma 1 por cada mayor de edad (¿recordáis el operador ternario?)
        int mayoresDeEdad = (esMayorEdad1 ? 1 : 0) + 
                            (esMayorEdad2 ? 1 : 0) + 
                            (esMayorEdad3 ? 1 : 0) + 
                            (esMayorEdad4 ? 1 : 0);

        // Identificar el mayor y el menor
        int mayorEdad = Math.max(Math.max(edad1, edad2), Math.max(edad3, edad4));
        int menorEdad = Math.min(Math.min(edad1, edad2), Math.min(edad3, edad4));

        /* 
        int mayorEdad = edad1;
        if (edad2 > mayorEdad) {
            mayorEdad = edad2;
        }
        if (edad3 > mayorEdad) {
            mayorEdad = edad3;
        }
        if (edad4 > mayorEdad) {
            mayorEdad = edad4;
        }

        // Encontrar la menor edad
        int menorEdad = edad1;
        if (edad2 < menorEdad) {
            menorEdad = edad2;
        }
        if (edad3 < menorEdad) {
            menorEdad = edad3;
        }
        if (edad4 < menorEdad) {
            menorEdad = edad4;
        }
         */
        // Precio final con o sin descuento
        double precioFinal;
        
        // Aplica el descuento solo si hay al menos dos personas mayores de edad
        if (mayoresDeEdad >= 2) {
            double descuentoDecimal = (double) descuento / 100; // casting de int a double de forma explícita
            precioFinal = precioOriginal * (1 - descuentoDecimal); // Calcula el precio con descuento (muchos habéis fallado aquí)
            System.out.println("Descuento aplicado. Precio final: " + precioFinal + "€.");
        } else {
            precioFinal = precioOriginal;
            System.out.println("No se aplicó descuento. Precio final: " + precioFinal + "€.");
        }

        // Mostrar el mayor y el menor
        System.out.println("La edad mayor es: " + mayorEdad);
        System.out.println("La edad menor es: " + menorEdad);
    }

}
