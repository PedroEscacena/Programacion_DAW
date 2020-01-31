package pruebaGaraje;

public class Helicoptero extends Aereo {


    Helicoptero(String nombre, int numCapac, int altitud, String oaci) {
        super(nombre, numCapac, altitud, oaci);
    }

    Helicoptero(String oaci){
        super(oaci);
    }

    @Override
    String altitudTipo() {
        return "Helicoptero"+super.altitudTipo();
    }

    @Override
    public String toString() {
        return "Helicoptero->"+super.toString();
    }
}
