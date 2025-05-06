package practica_fraccion;
/**
 * @author: ThayroneSal
 * @version: 2.0
 * @since: 06-02-2025
 */

/***Objetivo:**
 *Diseñar y documentar la clase Fraccion, incorporando conceptos básicos como atributos, constructores, encapsulación y 
 *documentación adecuada.

**Instrucciones:**
  *Define una clase llamada Fraccion que represente una fracción matemática. La clase debe incluir:

  *1. Dos atributos privados (opcional: ¿sabrías indicar por qué debe ser privado?): numerador y denominador.
  *2. Tres constructores:
    *- Uno sin parámetros que inicialice la fracción como 0/1.
    *- Otro que reciba numerador y denominador como parámetros (validando que el denominador no sea 0).
    *- Un tercero que reciba solo el numerador y asuma que el denominador es 1.
  *3. Métodos para obtener y modificar los valores de los atributos, asegurando que el denominador no sea 0.
  *4. Un método para devolver la fracción en formato de texto (numerador/denominador).

  *Documenta el código con comentarios claros y apropiados usando JavaDoc para describir la clase, los atributos y los métodos.
  *Opcionalmente, prueba tu clase en un programa principal, mostrando en consola al menos una fracción creada con cada constructor.

**Entrega: Enlace al proyecto de GitHub. Este proyecto se irá ampliando semanalmente a través de distintos commits..**

 */


 /**
  * Clase Fraccion que representa una fracción matemática.
  *@param crear clase Fraccion
  */

public class Fraccion{

    //son privados para encapsular la lógica de la clase. Esto significa que solo se pueden acceder y modificar
    //a través de métodos públicos. Esto ayuda a proteger los datos y asegura que se mantenga la integridad de la
    //fracción (por ejemplo, evitando un denominador igual a cero).

    /**
     * Atributos de la clase Fraccion.
     * @param numerador el numerador de la fracción privado
     * @param denominador el denominador de la fracción privado
     */

private int numerador;
private int denominador;

/**
 * Crea una fracción 0/1.
 * @param numerador
 * @param denominador
 */

public Fraccion(){
    numerador = 0;
    denominador = 1;

}

/**
 * Crea una fracción con un numerador y un denominador.
 * @param numerador
 * @param denominador
 */

public Fraccion(int numerador, int denominador){
    if (denominador != 0){
        this.numerador = numerador;
        this.denominador = denominador;
        } else {
            System.out.println("El denominador no puede ser 0, y no crea la fracción");
        }
        simplificar();
    }

    /**
     * Crea una fracción con un numerador y denominador de 1.
     * @param numerador
     */
    
    public Fraccion(int numerador){
        this.numerador = numerador;
        this.denominador = 1;
    }

    /**
     * Devuelve el numerador de la fracción.
     * @return
     */

    public int getNumerador(){
        return numerador;
    }

    /**
     * Cambia el numerador de la fracción.
     * @param numerador
     */

    public void setNumerador(int numerador){
        this.numerador = numerador;
        simplificar();
    }

    /**
     * Devuelve el denominador de la fracción.
     * @return
     */

    public int getDenominador(){
        return denominador;
    }
    

/**
 * Cambia el denominador de la fracción, siempre y cuando no sea 0.
 * @param denominador
 * @return
 * @throws IllegalArgumentException si el denominador es 0 /* throws ... es una funcion que se puede poner en el 
 * codigo para devolver un error
 *  */


    public void setDenominador(int denominador){
        if (denominador != 0){
            this.denominador = denominador;
        } else {
            System.out.println("El denominador no puede ser 0, entonces no se ha cambiado el denominador");
        }
        simplificar();
    }
/**
 * Devuelve la fracción en formato de texto (numerador/denominador).
 * @return la fracción en formato de texto (numerador/denominador)
 */
    public String toString(){
        return numerador + "/" + denominador;
    }
    /**
     * Calcula el máximo común divisor de dos números enteros.
     * @param a
     * @param b
     * @return
     */

    private  int calcularMCD(int a, int b){  /*calcula el maximo comun con divisor */
        while (b != 0) {
            int temporal = b;
            b = a % b;
            a = b;
            a = temporal;
            
        }
        return a;

    }

    /**
     * Simplifica la fracción dividiendo el numerador y el denominador por su máximo común divisor.
     * @param numerador
     * @param denominador
     */

    public void simplificar() {
        int mcd = calcularMCD(Math.abs(this.numerador), Math.abs(this.denominador));
        this.numerador /=  mcd;
        this.denominador /= mcd;
    }
    /* para hacer la simplificacion de una fraccion primero hacemos el maximo comun de un divisor,
     * ejemplo el mcd de la fraccion 12/18 es 6, ahora  para simplificar hacemos en el codigo 
     * que el numerador y el divisor se divida por el mcd, entonces 12/6 = 2 y 18/6 = 3,
     *  entonces la fraccion simplificada es 2/3
     */

    /**
     * Suma la fracción actual con otra fracción.
     * @param otraFraccion
     * @return
     */

    public Fraccion sumar( Fraccion otraFraccion){
        int nuevoNumerador = this.numerador * otraFraccion.denominador + otraFraccion.numerador * this.denominador;
        int nuevoDenominador = this.denominador * otraFraccion.denominador;
        return new Fraccion (nuevoNumerador, nuevoDenominador);
    }

    /**
     * Resta la fracción actual por otra fracción.
     * @param otraFraccion
     * @return
     */

    public Fraccion restar( Fraccion otraFraccion){
        int nuevoNumerador = this.numerador * otraFraccion.denominador - otraFraccion.numerador * this.denominador;
        int nuevoDenominador = this.denominador * otraFraccion.denominador;
        return new Fraccion (nuevoNumerador, nuevoDenominador);
    }

    /**
     * Multiplica la fracción actual por otra fracción.
     * @param otraFraccion
     * @return
     */

    public Fraccion multiplicar( Fraccion otraFraccion){
        int nuevoNumerador = this.numerador * otraFraccion.numerador;
        int nuevoDenominador = this.denominador * otraFraccion.denominador;
        return new Fraccion (nuevoNumerador, nuevoDenominador);
    }

    /**
     * Divide la fracción actual por otra fracción.
     * @param otraFraccion
     * @return
     */

    public Fraccion dividir( Fraccion otraFraccion){
        int nuevoNumerador = this.numerador * otraFraccion.denominador;
        int nuevoDenominador = this.denominador * otraFraccion.numerador;
        return new Fraccion (nuevoNumerador, nuevoDenominador);
    }




    /**
     * Método principal para probar la clase Fraccion. (06-02-2025 hecho en clase)
     * @param args
     */

    public static void main(String[] args){
        Fraccion f1 = new Fraccion();
        System.out.println("f1 = " + f1);

        Fraccion f2 = new Fraccion(2, 1);
        System.out.println("f2 = " + f2);

        Fraccion f3 = new Fraccion(8);
        System.out.println("f3 = " + f3);

        f1.setNumerador(5);
        f1.setDenominador(2);
        System.out.println("f1 = " + f1);

        f1.setDenominador(0);
        System.out.println("f1 = " + f1);

        System.out.println("Si sumamos las fracciones "+ f2.toString() + " y " + f3.toString() + " obtenemos " + f2.sumar(f3));
    }
}




