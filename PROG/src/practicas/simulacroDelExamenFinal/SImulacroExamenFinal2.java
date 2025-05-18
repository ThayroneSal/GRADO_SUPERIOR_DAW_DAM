package simulacroDelExamenFinal;

class DescuentoSobrePrecio {

    //Atributos privados
    private String nombreProducto;
    private double precioOriginal;
    private double descuento;

    //Constructor
    public DescuentoSobrePrecio (String nombreProducto, double precioOriginal, double descuento) {
        this.nombreProducto = nombreProducto;
        this.precioOriginal = precioOriginal;
        this.descuento = descuento;
    }

    //Metodos Getters
    public String getNombreProducto() {
        return nombreProducto;
    }

    public double getPrecioOriginal() {
        return precioOriginal;
    }

    public double getDescuento() {
        return descuento;
    }

    //Metodos Settings
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public void setPrecioOriginal(double precioOriginal) {
        this.precioOriginal = precioOriginal;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    //comentario en la parte que me estaba liando al llamar este metodo
    // public void precioFinalConDescuento() {
    //     double precioFinal = precioOriginal - (precioOriginal * descuento / 100);
    // }

    //Metodo para calcular el descuento del precio total.
    public double precioFinalConDescuento() {
        return precioOriginal - (precioOriginal * descuento / 100);
    }

    //Metodo para llamar los detalles.
    public void mostrarDetalles() {
        System.out.println("Nombre del producto: " + nombreProducto);
        System.out.println("Precio original: " + precioOriginal + " Euros");
        System.out.println("Descuento: " + descuento + " %");
        System.out.println("Precio final con descuento: " + precioFinalConDescuento() + " Euros");
    }

    
}

//Metodo Main
public class SImulacroExamenFinal2 {
    public static void main(String[] args) {
        //Crear objeto.
        DescuentoSobrePrecio descuento = new DescuentoSobrePrecio("Ordenador Portatil", 1500.0, 20.0);

        descuento.mostrarDetalles();
    }

}
