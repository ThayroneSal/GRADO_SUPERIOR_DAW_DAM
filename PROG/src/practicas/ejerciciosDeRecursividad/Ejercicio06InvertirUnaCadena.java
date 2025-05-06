package ejerciciosDeRecursividad;

public class Ejercicio06InvertirUnaCadena {

    /*Invertir una cadena
Escribe una función recursiva que invierta una cadena de texto.
Ejemplo: invertir("recursivo") → "ovisrucer". */

public static void main(String[] args) {
    
    String cadena = "recursivo";
    String resultado = invertido(cadena);
    System.out.println("La frase recursivo al reves es: " + resultado);

}

public static String invertido (String str){
 if (str.isEmpty()){
    
 }
 return str;

  //Otra manera de hacerlo.

 /* if (palabra.isEmpty()) return palabra;
  * System.out.printIn("por ahora tengo esto: " +palabra.substring(1)+ "/" +palabra.charAt(0));
  * return invertir(palabra.substring(1))+palabra.charAt(0);
  */

 //Función charAt en Java se utiliza para devolver el carácter en un índice específico de una cadena.
 //Puedes utilizarla de la siguiente manera: char ch = str.charAt(1);donde strestá tu cadena y 1 es el índice
 // del carácter al que quieres acceder.

 
}

}

// utilizando el método isEmpty(). Si la cadena está vacía, la función retorna la cadena tal como está. Esta condición
// actúa como el caso base de la recursión,
// asegurando que la función tenga un punto de parada y no entre en un bucle infinito.

// invertir(palabra.substring(1)) llama a la función recursivamente con la cadena palabra sin el primer carácter.
//  El método substring(1) devuelve una nueva cadena que comienza desde el segundo carácter hasta el final de la cadena original.
// palabra.charAt(0) obtiene el primer carácter de la cadena original.
// La concatenación de estos dos valores (invertir(palabra.substring(1)) y palabra.charAt(0)) da como resultado la cadena invertida.
// Por ejemplo, si palabra es "hola":

// En la primera llamada, palabra.substring(1) es "ola" y palabra.charAt(0) es 'h'.
// En la segunda llamada, palabra.substring(1) es "la" y palabra.charAt(0) es 'o'.
// En la tercera llamada, palabra.substring(1) es "a" y palabra.charAt(0) es 'l'.
// En la cuarta llamada, palabra.substring(1) es "" (cadena vacía) y palabra.charAt(0) es 'a'.
// Finalmente, cuando palabra es "", la función retorna "".
// Concatenando todos estos valores en orden inverso: "a" + "l" + "o" + "h" = "aloh".