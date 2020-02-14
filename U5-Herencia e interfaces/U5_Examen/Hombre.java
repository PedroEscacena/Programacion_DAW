package examen;

public abstract class Hombre extends Personaje {

     Hombre(String nombre, int energy, int c_ataq, int c_def, boolean enchantment) {
        super(nombre, energy, c_ataq, c_def, enchantment);
    }
    Hombre(String nombre){
         super(nombre);
    }
}
