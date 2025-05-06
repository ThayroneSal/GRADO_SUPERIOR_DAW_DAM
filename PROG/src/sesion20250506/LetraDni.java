
    import java.util.Scanner;

    public class LetraDni {
    
       public static char letraDNI(int numeroDNI) {
    
           char[] letras={'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B',
    
    'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
    
           int indiceBusqueda = numeroDNI % 23;
    
           return letras[indiceBusqueda];
    
       }
    
       public static void main(String[] args) {
    
          Scanner teclado = new Scanner(System.in);
    
          System.out.print("Introduce un DNI: ");
    
          int dni = teclado.nextInt();
    
          char tuLetra = letraDNI(dni);
    
          System.out.println("La letra del DNI es la " + tuLetra);
    
       } 
    
    }

