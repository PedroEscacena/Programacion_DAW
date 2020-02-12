package examen;

public class Mago extends Hombre implements Magia {

    private int long_barba;

    Mago(String nombre, int energy, int c_ataq, int c_def, boolean enchantment, int long_barba) {
        super(nombre, energy, c_ataq, c_def, enchantment);
        this.long_barba = long_barba;
    }

    Mago(String nombre) {
        super(nombre);
        this.long_barba = 40;
    }

    public int getLong_barba() {
        return long_barba;
    }

    public void setLong_barba(int long_barba) {
        this.long_barba = long_barba;
    }

    @Override
    public void encantar(Personaje personaje) {
        if (getEnergy() < 0) {
            System.out.println("MUERTO NO PUEDE HACER MAGIA");
        } else {

            personaje.setEnchantment(true);
        }
    }

    @Override
    public String toString() {
        return super.toString() + " longitud de la barba: " + long_barba + '}';
    }

    @Override
    public void desencantar(Personaje personaje) {
        if (getEnergy() < 0) {
            System.out.println("MUERTO NO PUEDE HACER MAGIA");
        } else {
            personaje.setEnchantment(false);
        }

    }
}
