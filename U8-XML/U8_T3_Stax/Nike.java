package xml.Stax;

public class Nike {
    private String nombre;
    private int precio;
    private String tipoProducto;
    private int unidades;

    public Nike(String nombre, int precio, String tipoProducto, int unidades) {
        this.nombre = nombre;
        this.precio = precio;
        this.tipoProducto = tipoProducto;
        this.unidades = unidades;
    }

    public Nike() {
        this.nombre = "jordan 1";
        this.precio = 220;
        this.tipoProducto = "Sneaker";
        this.unidades = 20000;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }
}
