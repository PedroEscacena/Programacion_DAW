package examen;

public class Guerrero extends Hombre implements Atacar {

    private int edad;

    Guerrero(String nombre, int energy, int c_ataq, int c_def, boolean enchantment, int edad) {
        super(nombre, energy, c_ataq, c_def, enchantment);
        this.edad = edad;
    }

    Guerrero(String nombre) {
        super(nombre);
        this.edad = 35;
    }

    @Override
    public String toString() {
        return super.toString() + " edad: " + getEdad() + '}';
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override

    public void atacarPersonaje(Personaje personaje) {
        System.out.println("Hombre " + getNombre() + " atacando");
        if (personaje.getClass() == this.getClass()) {
            System.out.println("Son del mismo tipo, no puede hacerle daño");
        }else if (getEnergy()<0){
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
