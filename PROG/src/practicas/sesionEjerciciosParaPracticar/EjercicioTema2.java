import java.util.Scanner;

public class EjercicioTema2 {

    //Ejercicios tema -2

    public static void main(String[] args) {
    
        String h = "Hola";
        String m = "Mundo";

        System.out.println("\n" + h + ", " + m );

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n--- SUMA DE DOS ENTEROS ---");
        System.out.println("\nInserta el primer numero entero: ");
        int enteroP = scanner.nextInt();

        System.out.println("Inserta el segundo número entero: ");
        int enteroS = scanner.nextInt();

        int total = enteroP + enteroS;
        System.out.println("La suma de ambos números es: " + total);

        System.out.println("\n--- CONVERSIÓN DE TEMPERATURA ---");
        System.out.println("\nInserte la temperatura en Celsius: ");
        double celsius = scanner.nextDouble();
        double conversor = ((celsius * 9/5) + 32);
        System.out.println(celsius + " Celsius lo convertimos en Fahrenheit: " + conversor + " Fahrenheit");

        System.out.println("\n--- CÁLCULO DE ÁREA DE UN TRIÁNGULO ---");
        System.out.println("\nInserte la base del triangulo: ");
        double base = scanner.nextDouble();

        System.out.println("Ahora Inserte la altura del triangulo: ");
        double altura = scanner.nextDouble();

        double suma = base * altura / 2;

        System.out.println("El área del triangulo es: " + suma);

        System.out.println("\n--- OPERACIONES ARITIMÉTICAS ---");
        System.out.println("\nInserta el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.println("Inserta el segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.println("\nLa suma de " + numero1 +" + "+ numero2 + " es igual a: " + (numero1 + numero2));

        System.out.println("\nLa resta de " + numero1 + " - " + numero2 + " es igual a: " + (numero1 - numero2));

        System.out.println("\nLa multiplicación de " + numero1 + " * " + numero2 + " es igual a: " + (numero1 * numero2));

        if(numero2 == 0 || numero1 == 0){
            System.out.println("\nError no se puede dividir por cero.");
        }else{
        System.out.println ("\nLa división de " + numero1 + " / " +numero2 + " es igual a: " + (numero1 / numero2));
        }
        scanner.close();
    }

}
