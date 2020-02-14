package examen;

import java.util.Arrays;
import java.util.Objects;

public abstract class Personaje implements Comparable {
    private String nombre;
    private int energy;
    private int c_ataq;
    private int c_def;
    private boolean enchantment;
    private static Personaje[] arrayPers;
    private static int numPersonajes = 0;

    public Personaje(String nombre, int energy, int c_ataq, int c_def, boolean enchantment) {
        this.nombre = nombre;
        setEnergy(energy);
        setC_ataq(c_ataq);
        setC_def(c_def);
        this.enchantment = enchantment;
        numPersonajes++;
    }

    public Personaje(String nombre) {
        this.nombre = nombre;
        this.energy = 500;
        this.c_ataq = 50;
        this.c_def = 50;
        this.enchantment = false;
        numPersonajes++;
    }

    public void setArrayPers(Personaje[] arrayPers) {
        this.arrayPers = arrayPers;
        System.out.println(Arrays.deepToString(this.arrayPers));
    }

    @Override
    public int compareTo(Object o) {
        Personaje p = (Personaje) o;
        return this.getEnergy() - p.getEnergy();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personaje personaje = (Personaje) o;
        return energy == personaje.energy &&
                c_ataq == personaje.c_ataq &&
                c_def == personaje.c_def &&
                enchantment == personaje.enchantment &&
                Objects.equals(nombre, personaje.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, energy, c_ataq, c_def, enchantment);
    }

    void borrarMuertos(Personaje[] p) {

        for (int i = 0; i < getNumPersonajes(); i++) {
            if (p[i].getEnergy() <= 0) {
                Personaje[] arrayPers2 = new Personaje[p.length - 1];

                for (int j = i; j < getNumPersonajes(); j++) {

                    p[i] = p[i + 1];
                }
                arrayPers2 = p;
                numPersonajes--;
            }
        }
        if (getNumPersonajes() == 1) {
            hayGanador(p);
        }

    }

    public void setEnergy(int energy) {

        if (energy >= 0 && energy <= 1000) {
            this.energy = energy;
        } else if (energy < 0) {
            System.out.println("MUERTO");
            this.energy = energy;
            borrarMuertos(arrayPers);
        }

    }

    public static void mostrarEstado(Personaje[] p) {
        Arrays.sort(p);
        System.out.println('\n');
        for (int i = 0; i < getNumPersonajes(); i++) {
            System.out.println(p[i].toString());
        }


    }

    public void hayGanador(Personaje[] p) {
        if (getNumPersonajes() == 1) {
            System.out.println("EL GANADOR ES: " + p[0].toString() + " ENHORABUENA");
        }

    }

    @Override
    public String toString() {
        return "Personaje{ " + getClass() + " " +
                "nombre='" + nombre + '\'' +
                ", energy=" + energy +
                ", c_ataq=" + c_ataq +
                ", c_def=" + c_def +
                ", enchantment=" + enchantment;
    }

    public static int getNumPersonajes() {
        return numPersonajes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEnergy() {
        return energy;
    }


    public int getC_ataq() {
        return c_ataq;
    }

    public void setC_ataq(int c_ataq) {
        if (c_ataq > 0 && c_ataq <= 100) {
            this.c_ataq = c_ataq;
        }

    }

    public int getC_def() {
        return c_def;
    }

    public void setC_def(int c_def) {
        if (c_def > 0 && c_def <= 100) {
            this.c_def = c_def;
        }
    }

    public boolean isEnchanted() {
        return enchantment;
    }

    public void setEnchantment(boolean enchantment) {
        this.enchantment = enchantment;
    }
}
