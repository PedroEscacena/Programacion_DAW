public class Futbolista {

    private int dorsal;
    private String nombre;
    private Demarcaciones listaDemarcaciones;
    private String equipo;


    public Futbolista(int dorsal, String nombre, Demarcaciones listaDemarcaciones, String equipo) {
        this.dorsal = dorsal;
        this.nombre = nombre;
        this.listaDemarcaciones = listaDemarcaciones;
        this.equipo = equipo;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Demarcaciones getListaDemarcaciones() {
        return listaDemarcaciones;
    }

    public void setListaDemarcaciones(Demarcaciones listaDemarcaciones) {
        this.listaDemarcaciones = listaDemarcaciones;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }
}
