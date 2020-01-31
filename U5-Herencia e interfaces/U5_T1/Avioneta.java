package pruebaGaraje;

import java.util.Arrays;

public class Avioneta extends Aereo {


    Avioneta(String nombre, int numCapac, int altitud, String oaci) {
        super(nombre, numCapac, altitud, oaci);
    }
    Avioneta(String oaci){
        super(oaci);
    }

    @Override
    String altitudTipo() {
        return "Avioneta" + super.altitudTipo();
    }

    @Override
    public String toString() {
        return "Avioneta->" + super.toString();
    }
}
