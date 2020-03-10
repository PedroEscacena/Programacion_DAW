package ExamenU7;

import java.io.Serializable;

public class Perro implements Serializable {
    private String nombre;
    private int edad;
    private double peso;
    private boolean tieneVacuna;
    private Propietario duenyo;
    private String raza;

    public Perro(String nombre, int edad, double peso, boolean tieneVacuna, Propietario duenyo, String raza) {
        setNombre(nombre);
        setEdad(edad);
        setPeso(peso);
        setTieneVacuna(tieneVacuna);
        setDuenyo(duenyo);
        setRaza(raza);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isTieneVacuna() {
        return tieneVacuna;
    }

    public void setTieneVacuna(boolean tieneVacuna) {
        this.tieneVacuna = tieneVacuna;
    }

    public Propietario getDuenyo() {
        return duenyo;
    }

    public void setDuenyo(Propietario duenyo) {
        this.duenyo = duenyo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", tieneVacuna=" + tieneVacuna +
                ", duenyo=" + duenyo.toString() +
                ", raza='" + raza + '\'' +
                '}';
    }
}
