package pruebaGaraje;

import java.util.Objects;

public abstract class Terrestre extends Vehículo  implements Comparable{


    private String matricula;
    private Color color;
    private int anyo;

    Terrestre(String nombre, int numCapac, String matricula, Color color, int anyo) {
        super(nombre, numCapac);
        setMatricula(matricula);
        setColor(color);
        setAnyo(anyo);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Terrestre terrestre = (Terrestre) o;
        return matricula.equals(terrestre.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula);
    }

    @Override
    public int compareTo(Object o){

        Terrestre c = (Terrestre) o;
        return getMatricula().compareTo(c.getMatricula());
    }

    @Override
    public String toString() {
        return "Nombre->"+getNombre()+'/'+"Matricula->"+matricula+'/'+"Color->"+color+'/'+"Año de fabricación->"+anyo+'\n';
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

}
