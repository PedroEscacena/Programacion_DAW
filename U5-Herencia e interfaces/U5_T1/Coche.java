package pruebaGaraje;

public class Coche extends Terrestre {


    Coche(String nombre, int numCapac, String matricula, Color color, int anyo) {
        super(nombre, numCapac, matricula, color, anyo);
    }

    @Override
    public String toString() {
        return "Coche//"+super.toString()+")";
    }

}
