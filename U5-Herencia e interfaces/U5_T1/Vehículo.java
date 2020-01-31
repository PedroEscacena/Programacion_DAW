package pruebaGaraje;

public abstract class Vehículo {


    private String nombre;

    private int numCapac;

    public String getCapActual() {
        return capActual+" de "+numCapac;
    }

    private int capActual;

    Vehículo(String nombre, int numCapac) {
        setNombre(nombre);
        setNumCapac(numCapac);
        this.capActual = 0;

    }


    boolean transportar(int numViajeros) {

        if (numViajeros + capActual > numCapac) {
            return false;
        } else if (numViajeros + capActual <= numCapac) {
            capActual += numViajeros;
            return true;
        }
        return false;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumCapac() {
        return numCapac;
    }

    public void setNumCapac(int numCapac) {
        this.numCapac = numCapac;
    }

}
