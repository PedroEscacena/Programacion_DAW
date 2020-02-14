package examen;

public class Enano extends Personaje implements Atacar {

    private int altura;

    Enano(String nombre, int energy, int c_ataq, int c_def, boolean enchantment, int altura) {
        super(nombre, energy, c_ataq, c_def, enchantment);
        this.altura = altura;
    }

    Enano(String nombre) {
        super(nombre);
        this.altura = 130;
    }

    @Override
    public String toString() {
        return super.toString() + " altura: " + altura + '}';
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public void atacarPersonaje(Personaje personaje) {
        System.out.println("Enano " + getNombre() + " atacando");
        if (personaje.getClass() == this.getClass()) {
            System.out.println("Son del mismo tipo, no puede hacerle daño");
        }else if (getEnergy()<0){
            System.out.println("MUERTO NO PUEDE ATACAR");
        }else {

            if (personaje.isEnchanted()) {

                personaje.setEnergy(personaje.getEnergy() - (2 * (this.getC_ataq() - personaje.getC_def())));
            } else {
                personaje.setEnergy(personaje.getEnergy() - (this.getC_ataq() - personaje.getC_def()));
            }
        }

    }
}
