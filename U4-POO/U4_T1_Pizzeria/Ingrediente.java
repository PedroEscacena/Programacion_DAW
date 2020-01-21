package pruebaPizzeria;

public class Ingrediente {

    private String nombre;
    private int calorias;

    Ingrediente() {
        this.nombre = "Queso";
        this.calorias = 250;
    }

    Ingrediente(String nombre, int calorias) {
        setNombre(nombre);
        setCalorias(calorias);
    }


    String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    int getCalorias() {
        return calorias;
    }

    private void setCalorias(int calorias) {
        this.calorias = calorias;
    }

}
