package ejercicioParaExamen;

import java.util.Scanner;

public class ejecicioDeExamen1nombre {
    public static void main(String[] args) {
                Scanner entrada = new Scanner(System.in);

                while(true){

                    System.out.println("Usuario, dame el nombre: ");
                    String nombre = entrada.nextLine();
                    entrada.nextLine();
                    if(nombre.equals(nombre.toLowerCase())){
                        System.out.println("Está en minúsculas");
                    }else if(nombre.equals(nombre.toUpperCase())){
                        System.out.println("Está en mayúsculas");
                    }else{
                        System.out.println("Ni en mayúsculas ni en minúsculas");
                    }  
                    if(nombre.equals(nombre.trim())){
                        System.out.println("No empieza ni con espacios ni termina con ellos.");
                    }else{
                        System.out.println("Hay algún espacio al principio o al final.");
                    }
                    if(nombre.equals(nombre.toLowerCase()) && nombre.equals(nombre.trim())){
                    
                        System.out.println("\u001B[34mEl nombre cumple con las propiedades pedidas y tiene "+nombre.length()+" letras.\u001B[0m");
                        break;
                    }else{
                        System.out.println("\u001B[31mEl nombre no cumple conlos requisitos.\u001B[0m");
                    }
                }
                entrada.close();
            }
        }





