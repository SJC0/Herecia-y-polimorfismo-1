
package farmaciapoohply;

public class Farmacia {
    
    private String clave,nombre,diacompra,tipoproducto;
    private int cantidad;
    protected double precio;

    public Farmacia(String clave, String nombre, String diacompra, String tipoproducto, int cantidad, double precio) {
        this.clave = clave;
        this.nombre = nombre;
        this.diacompra = diacompra;
        this.tipoproducto = tipoproducto;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getClave() {
        return clave;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDiacompra() {
        return diacompra;
    }

    public String getTipoproducto() {
        return tipoproducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }
    
    
    
    
}
