package examen;

public class Elfo extends Personaje implements Atacar {

    private ElfoTipo tipo;

    Elfo(String nombre, int energy, int c_ataq, int c_def, boolean enchantment, ElfoTipo tipo) {
        super(nombre, energy, c_ataq, c_def, enchantment);
        this.tipo = tipo;
    }

    Elfo(String nombre) {
        super(nombre);
        this.tipo = ElfoTipo.BOSQUE;
    }


    public ElfoTipo getTipo() {
        return tipo;
    }

    public void setTipo(ElfoTipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString() + " Tipo de elfo: " + tipo + '}';

    }

    @Override
    public void atacarPersonaje(Personaje personaje) {
        System.out.println("Elfo " + getNombre() + " atacando");
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
