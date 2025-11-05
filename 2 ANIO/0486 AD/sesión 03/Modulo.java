//Clase de datos para representar un módulo del curso.
public class Modulo {
    //Atributos privados
    private String nombre;
    private int horas;
    private double nota;

    //Contructor para crear el objeto con sus valores
    public Modulo(String nombre, int horas, double nota) {
        this.nombre = nombre;  //Asignar el nombre recibido
        this.horas = horas;    //Asignar las horas recibido
        this.nota = nota;      //Asignar la nota recibido
    }

    //Gettter para poder leer los campos desde las otras clases
    public String getNombre() { return nombre; }
    public int getHoras() { return horas; }
    public double getNota() { return nota; }
}
