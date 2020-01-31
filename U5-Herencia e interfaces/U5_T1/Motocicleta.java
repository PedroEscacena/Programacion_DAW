package pruebaGaraje;

public class Motocicleta extends Terrestre  {


    Motocicleta(String nombre, int numCapac, String matricula, Color color, int anyo) {
        super(nombre, numCapac, matricula, color, anyo);
    }

    @Override
    public String toString() {
        return "Motocicleta//"+super.toString()+'\n';
    }
}
