
import java.util.Scanner;

  public class ejemplo_array {
  
     public static void main(String[] args) {
  
        Scanner teclado = new Scanner(System.in);
  
        int a[] = new int[4];
  
        for(int i = 0; i < a.length; i++) {
  
            System.out.print("Valor para la posición " + i + ": ");
  
            a[i] = teclado.nextInt();
  
        }
  
        System.out.println("==== CONTENIDO DEL ARRAY ====");
  
        for(int i = 0; i < a.length; i++) {
  
            System.out.println("Valor para la posición " + i + ": " + a[i]);
  
        }
    }
}