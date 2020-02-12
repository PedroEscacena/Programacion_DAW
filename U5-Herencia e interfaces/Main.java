package examen;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Elfo f1 = new Elfo("Glorfindel", 400, 60, 50, false, ElfoTipo.BOSQUE);
        Guerrero h1 = new Guerrero("Isildur", 250, 80, 50, false, 28);
        Mago m1 = new Mago("Radagas", 200, 80, 20, false, 40);
        Orco o1 = new Orco("Uruk hai", 300, 90, 30, false, 200);
        Enano e1 = new Enano("Dwali", 400, 60, 70, false, 120);
        Enano e2 = new Enano("Thorin");


        //CRACIÓN DE PERSONAJES
        Personaje[] arraypersonajes = new Personaje[6];

        {
            arraypersonajes[0] = f1;
            arraypersonajes[1] = h1;
            arraypersonajes[2] = m1;
            arraypersonajes[3] = o1;
            arraypersonajes[4] = e1;
            arraypersonajes[5] = e2;
        }
        arraypersonajes[5].setArrayPers(arraypersonajes);


        //MAGIA
        m1.encantar(m1);
        m1.encantar(h1);
        m1.encantar(e1);
        System.out.println(arraypersonajes[1].toString());
        m1.desencantar(arraypersonajes[1]);
        System.out.println(arraypersonajes[1].toString());


        //Ordenación por defensa

        Arrays.sort(arraypersonajes, new Comparator<Personaje>() {
            @Override
            public int compare(Personaje personaje, Personaje t1) {
                return personaje.getC_def() - t1.getC_def();
            }
        });


        //Ordenación por ataque

        System.out.println('\n' + Arrays.deepToString(arraypersonajes));
        Arrays.sort(arraypersonajes, new Comparator<Personaje>() {
            @Override
            public int compare(Personaje personaje, Personaje t1) {
                return personaje.getC_ataq() - t1.getC_ataq();
            }
        });
        System.out.println('\n' + Arrays.deepToString(arraypersonajes));


        //ATAQUE Y MUERTOS
        e1.atacarPersonaje(e2);
        e1.atacarPersonaje(o1);
        o1.atacarPersonaje(m1);
        o1.atacarPersonaje(m1);
        Personaje.mostrarEstado(arraypersonajes);
        h1.atacarPersonaje(o1);
        h1.atacarPersonaje(o1);
        h1.atacarPersonaje(o1);
        h1.atacarPersonaje(o1);
        h1.atacarPersonaje(o1);
        h1.atacarPersonaje(o1);
        Personaje.mostrarEstado(arraypersonajes);
    }
}
