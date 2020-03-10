package ExamenU7;

import java.io.*;
import java.util.*;

public class Concurso implements Serializable{
    private String nombreConcurso;
    private String localidad;
    private Perro perro;
    private Map<String, Set> mapaPerros = new HashMap<>();
    private Set<Perro> set1 = new HashSet<>();


    public Concurso(String nombreConcurso, String localidad, Perro perro) {
        setNombreConcurso(nombreConcurso);
        setLocalidad(localidad);
        setPerro(perro);

    }
    public String getNombreConcurso() {
        return nombreConcurso;
    }

    public void setNombreConcurso(String nombreConcurso) {
        this.nombreConcurso = nombreConcurso;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    public void addDog(String raza, Perro perro) {
        Map.Entry<String, Perro> entry = Map.entry(raza, perro);

        if (raza.equals(perro.getRaza()) && perro.getRaza().equals(entry.getKey())) {
            set1.add(perro);
            mapaPerros.put(raza, set1);
        } else {
            System.out.println("RAZAS NO COMPATIBLES");
        }
    }

    public void disqualifyDog(Perro perro) {
        set1.remove(perro);
        mapaPerros.put(perro.getRaza(), set1);
    }

    public void ownerDogs(int numSocio) {
        Set<Map.Entry<String, Set>> setPrueba = mapaPerros.entrySet();

        for (Iterator<Map.Entry<String, Set>> it = setPrueba.iterator(); it.hasNext(); ) {
            it.next();

            if (mapaPerros.containsValue(numSocio) || perro.getDuenyo().getNumSocio()==numSocio) {

                System.out.println(perro.toString());
            }
        }
    }

    public void cargarPerros() {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("perros.dat"));
            Perro perroActual = (Perro) ois.readObject();
            while (true) {
                set1.add(perroActual);
                mapaPerros.put(perroActual.getRaza(), set1);
                perroActual = (Perro) ois.readObject();

            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Fin");
        }
    }

    public void guardarPerros() {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("perros.dat"));

            Set<Map.Entry<String, Set>> setPrueba = mapaPerros.entrySet();

            for (Iterator<Map.Entry<String, Set>> it = setPrueba.iterator(); it.hasNext(); ) {

                oos.writeObject(setPrueba);
                it.next();
            }
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public String toString() {
        return "Concurso{" +
                "nombreConcurso='" + nombreConcurso + '\'' +
                ", localidad='" + localidad + '\'' +
                ", perro=" + perro.toString() + '}';
    }

    public void mostrarPerros() {
        System.out.println(mapaPerros);
    }


}
