package sesion20250109;

public class EjemploFuncions02 {

    public static void main(String[] args) {
        
        // luego hago esto
        System.out.println(esPrimo (1999999));
    }


    public static boolean esPrimo (double n){
        //vamos a suponer qu el numeo es valido, es un entero positivo mayor que 1.
        if (n==2){
            return true;
        }
        if (n%2==0){
            return false;
        }

        for (int i = 3; i <=Math.sqrt (n); i+=2){
            if (n % i == 0){
                System.out.println(i);
                return false;

            }

        }
        return true;

    }

}
