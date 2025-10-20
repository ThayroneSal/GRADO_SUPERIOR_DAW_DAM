package simulacroDelExamenFinal;

class DescuentoSobrePrecio{

    private String nombreProducto;
    private double precioOriginal;
    private double descuento;

    public DescuentoSobrePrecio (String nombreProducto, double precioOriginal, double descuento){
        this.nombreProducto = nombreProducto;
        this.precioOriginal = precioOriginal;
        this.descuento = descuento;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public double getPrecioOriginal() {
        return precioOriginal;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public void setPrecioOriginal(double precioOriginal) {
        this.precioOriginal = precioOriginal;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double precioFinalConDescuento(){
        return precioOriginal - (precioOriginal * descuento / 100);
    }

    public void mostrarDetalles(){
        System.out.println("El nombre del producto es: " + nombreProducto);
        System.out.println("El precio original es: " + precioOriginal + " euros");
        System.out.println("El porcentaje de descuento es: " + descuento + " %");
        System.out.println("El precio final con descuento es: " + precioFinalConDescuento() + " euros");
    }

}
public class VolverHacer2 {
    public static void main(String[] args) {
        DescuentoSobrePrecio dec = new DescuentoSobrePrecio("Ebook", 100.0, 15.0);

        dec.mostrarDetalles();
    }

}
