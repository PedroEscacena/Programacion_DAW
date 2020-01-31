package pruebaGaraje;

public abstract class Aereo extends Vehículo {


    private int altitud;
    private String oaci;


    Aereo(String nombre, int numCapac, int altitud, String oaci) {
        super(nombre, numCapac);
        setAltitud(altitud);
        setOaci(oaci);
    }

    Aereo(String oaci) {
        super(null, 4);
        setOaci(oaci);
    }

    @Override
    public String toString() {
        return "OACI->" + oaci+'\n';
    }

    String altitudTipo() {
        return "(Altitud->" + altitud + ")";
    }

    public int getAltitud() {
        return altitud;
    }

    public void setAltitud(int altitud) {
        this.altitud = altitud;
    }

    public String getOaci() {
        return oaci;
    }

    public void setOaci(String oaci) {
        this.oaci = oaci;
    }
}
