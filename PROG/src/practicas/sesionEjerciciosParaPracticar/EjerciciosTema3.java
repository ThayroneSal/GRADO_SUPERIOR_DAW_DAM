import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EjerciciosTema3 {

   
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.println("\n--- DETERMINA SI EL NUMERO ES PAR O IMPAR");
        System.out.println("\nIntroduz el número entero: ");
        int par = scanner.nextInt();

        if(par %2 == 0){
            System.out.println("El número: " + par + " es par.");
        }else{
            System.out.println("El número: " + par + " es impar.");
        }

        System.out.println("\n--- MAYOR DE TRES NÚMEROS ---");

        System.out.println("\nIntroduz el primer número entero: ");
        int numero1 = scanner.nextInt();

        System.out.println("\nIntroduz el segundo número entero: ");
        int numero2 = scanner.nextInt();

        System.out.println("\nIntroduz el tercero número entero: ");
        int numero3 = scanner.nextInt();

        int mayor = numero1;

        if (numero2 > mayor){
            mayor = numero2;
        }

        if (numero3 > mayor){
            mayor = numero3;
        }

    //     // //Alternativa se puede usar Mach.max

    //     // int mayor = Math.max(Math.max(numero1, numero2),numero3);

        System.out.println("\nEl número mayor es: " + mayor);

        System.out.println("\n---TABLA DE MULTIPLICAR---");

        System.out.println("\nIntroduz un número entero:");
        int entero = scanner.nextInt();

        System.out.println("\nLa tabla del número " + entero+ " es: ");

        for(int i = 1; i <= 10; i++) {
        System.out.println(entero + " x " + i + " = " + (entero * i));
    }

    System.out.println("\n---CONTADOR DE 1 a N ---");

    System.out.println("\nIntroduzca el número entero positivo que desea contar: ");
    int n = scanner.nextInt();

    for(int i = 0; i <=n; i++){
        System.out.println("\n contador: " + i);

    }

    System.out.println("\n---NÚMERO PRIMO ---");

    System.err.println("\nIndroduzca el número entero que desee: ");
    int pr = scanner.nextInt();

    boolean primo = true;
    for(int i = 2; i <= Math.sqrt(pr); i++ ){
        if(pr % i == 0){
            primo = false;
            break;
        }
    }
    System.out.println(primo ? "Es primo" : "No es primo");

    Set <String> lista = new HashSet<>();
    System.out.println("\n--- MENÚ CON INTERACIÓN ---");
    int opcion;

    while(true) {
        System.err.println("\n---LISTA DE COMPRA---");
        System.out.println("1. Agregar Articulo");
        System.out.println("2. Ver lista de compra");
        System.out.println("3. Eliminar Articulo");
        System.out.println("4. buscar Articulo");
        System.out.println("5. Salir");
        System.out.println("\nElija una de las opciones arriba:");
        opcion = scanner.nextInt();
        scanner.nextLine();

        switch (opcion) {
            case 1:
            System.out.println("\nIngrese el nombre del articulo que desea adicionar en la lista: ");
            String articulo = scanner.nextLine();

            if(lista.contains(articulo)){
                System.out.println("ERROR: El articulo ya existe en la lista");
            }else {
                lista.add(articulo);
                System.out.println("**Articulo adicionado correctamente");
            }
                break;

            case 2:
            if (lista.isEmpty()) {
                System.out.println(" **La lista esta vacia");
            } else{
                System.out.println(" **Lista de compra**");
                for(String articulos1: lista){
                    System.out.println("- " + articulos1);
                }
            }
                break;

            case 3:
            System.out.println("Ingrese el nombre del articulo que desees eliminar: ");
            String borrar = scanner.nextLine();
            if(lista.remove(borrar)){
                System.out.println("**Articulo borrado");
            }else{
                System.out.println("ERROR: No se ha podido borra, el articulo no existe en la lista");
            }
                break;

            case 4:
            System.out.println("\nInserte el articulo a buscar: ");
            String busc = scanner.nextLine();
            if(lista.contains(busc)){
                System.out.println("\nEl articulo " + busc + " Existe en la lista");
            }else{
                System.out.println("EL articulo " + busc + " no existe en la lista");
            }
                break;

            case 5:
            System.out.println("\nSaliendo del programa ...");
            scanner.close();
            return;
        
            default:
            System.out.println("Opción no validad, elije una de las opciones del menú: ");
                break;
            }
        }
        

    }
    

}
