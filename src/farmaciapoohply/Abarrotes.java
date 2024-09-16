package farmaciapoohply;

public class Abarrotes extends Farmacia {

    public Abarrotes(String clave, String nombre, String diacompra, String tipoproducto, int cantidad, double precio) {
        super(clave, nombre, diacompra, tipoproducto, cantidad, precio);
    }

    public double calcularPrecioDescuento(double descuento) {
        return getPrecio() * (1 - descuento / 100);
    }

    public void mostrarDatos() {
        System.out.printf("Clave: %s%nNombre: %s%nDía de compra: %s%nTipo de producto: %s%nCantidad: %d%nPrecio: $%.2f%n",
                getClave(), getNombre(), getDiacompra(), getTipoproducto(), getCantidad(), getPrecio());

        if (getDiacompra().equals("jueves")|| getDiacompra().equals("Jueves")) {
            double precioConDescuento = calcularPrecioDescuento(15);
            System.out.printf("Precio con descuento (15%%): $%.2f%n", precioConDescuento);
        } else {
            System.out.println("Descuento: 0%");
        }
    }
}
