package examen;

public class Orco extends Personaje implements Atacar {

    private int tonelaje;

    Orco(String nombre, int energy, int c_ataq, int c_def, boolean enchantment, int tonelaje) {
        super(nombre, energy, c_ataq, c_def, enchantment);
        this.tonelaje = tonelaje;
    }

    Orco(String nombre) {
        super(nombre);
        this.tonelaje = 200;
    }

    public int getTonelaje() {
        return tonelaje;
    }

    @Override
    public String toString() {
        return super.toString() + " tonelaje: " + tonelaje + '}';
    }

    public void setTonelaje(int tonelaje) {
        this.tonelaje = tonelaje;
    }

    @Override
    public void atacarPersonaje(Personaje personaje) {
        System.out.println("Orco " + getNombre() + " atacando");
        if (personaje.getClass() == this.getClass()) {
            System.out.println("Son del mismo tipo, no puede hacerle daño");
        } else if (getEnergy() < 0) {
            System.out.println("MUERTO NO PUEDE ATACAR");
        } else {

            if (personaje.isEnchanted()) {

                personaje.setEnergy(personaje.getEnergy() - (2 * (this.getC_ataq() - personaje.getC_def())));
            } else {
                personaje.setEnergy(personaje.getEnergy() - (this.getC_ataq() - personaje.getC_def()));
            }
        }

    }
}
