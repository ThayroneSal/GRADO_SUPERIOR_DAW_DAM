public class ejemploParaPonerTituloArray {
    public static void main(String[] args) {

        int [][] matriz = new int [3][4];
       /*  int [][] matriz = {{8, 3, 4, 5}, {7, 5, 8, 6}, {13, 5, 7, 8}};*/        
        System.out.println("==== CONTENIDO DE LA MATRIZ ====");

        System.out.print("\t  "); // el espacio antes de los nombres de las columnas
        
        
                for(int columna = 0; columna < matriz[0].length; columna++) {
        
          System.out.printf(" C%1d ", columna); // títulos de las columnas
        }
        
        System.out.print("\n"); // salto de línea, vamos a empezar con las filas
        
        for(int fila = 0; fila < matriz.length; fila++) {
        
         System.out.printf("\tF%1d ", fila); // muestra el título de la fila
        
         for(int columna = 0; columna < matriz[fila].length; columna++) {
        
            System.out.printf("[%02d]", matriz[fila][columna]); // muestra el contenido
         }
        
            System.out.print("\n"); // salto de línea entre fila y fila
        
// COMO PONER UN NOMBRE DISTINTO PARA CADA FILA Y COLUNA ES DECIR COLUNA C0 PEPE C1 ANTONIO .... ETC 

 


        }

    }
}
