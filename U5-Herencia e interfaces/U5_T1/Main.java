package pruebaGaraje;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Avioneta[] arrayAvionetas = new Avioneta[3];
        {
            arrayAvionetas[0] = new Avioneta("UP-3000");
            arrayAvionetas[1] = new Avioneta("Avion1", 5, 3000, "IP-20");
            arrayAvionetas[2] = new Avioneta("Avion2", 4, 2000, "IP-21");
        }

        System.out.println(Arrays.deepToString(arrayAvionetas));
        System.out.println(arrayAvionetas[1].altitudTipo());
        System.out.println(arrayAvionetas[0].transportar(1));
        System.out.println("Número de pasajeros actuales->" + arrayAvionetas[0].getCapActual());
        System.out.println(arrayAvionetas[0].transportar(3));
        System.out.println("Número de pasajeros actuales->" + arrayAvionetas[0].getCapActual());
        System.out.println(arrayAvionetas[0].transportar(1));
        System.out.println("Número de pasajeros actuales->" + arrayAvionetas[0].getCapActual());

        Helicoptero[] arrayHelicopteros = new Helicoptero[3];
        {
            arrayHelicopteros[0] = new Helicoptero("UP-1000");
            arrayHelicopteros[1] = new Helicoptero("Helicoptero1", 10, 3000, "IP-400");
            arrayHelicopteros[2] = new Helicoptero("Helicoptero2", 8, 2000, "IP-300");
        }

        System.out.println(Arrays.deepToString(arrayHelicopteros));

        System.out.println(arrayHelicopteros[1].altitudTipo());
        System.out.println(arrayHelicopteros[1].transportar(1));
        System.out.println("Número de pasajeros actuales->" + arrayHelicopteros[1].getCapActual());
        System.out.println(arrayHelicopteros[1].transportar(3));
        System.out.println("Número de pasajeros actuales->" + arrayHelicopteros[1].getCapActual());
        System.out.println(arrayHelicopteros[1].transportar(1));
        System.out.println("Número de pasajeros actuales->" + arrayHelicopteros[1].getCapActual());
        System.out.println(arrayHelicopteros[1].transportar(5));
        System.out.println("Número de pasajeros actuales->" + arrayHelicopteros[1].getCapActual());
        System.out.println(arrayHelicopteros[1].transportar(1));
        System.out.println("Número de pasajeros actuales->" + arrayHelicopteros[1].getCapActual());


        Coche[] arrayCoches = new Coche[3];
        {
            arrayCoches[0] = new Coche("Ford", 5, "12345A", Color.ROJO, 2015);
            arrayCoches[1] = new Coche("Audi", 4, "32345A", Color.AZUL, 2000);
            arrayCoches[2] = new Coche("Seat", 2, "22345A", Color.AMARILLO, 2012);
        }


        Arrays.sort(arrayCoches);
        System.out.println(Arrays.deepToString(arrayCoches));
        Arrays.sort(arrayCoches, new Comparator<Coche>() {
            @Override
            public int compare(Coche coche, Coche t1) {
                return coche.getAnyo() - t1.getAnyo();
            }
        });
        System.out.println(Arrays.deepToString(arrayCoches));


        arrayCoches[0].transportar(4);
        


        Motocicleta[] arrayMotocicletas = new Motocicleta[3];
        {
            arrayMotocicletas[0] = new Motocicleta("Ford", 2, "12345A", Color.ROJO, 2015);
            arrayMotocicletas[1] = new Motocicleta("Harley", 2, "1000A", Color.ROJO, 2000);
            arrayMotocicletas[2] = new Motocicleta("Noséotro", 2, "1000B", Color.AMARILLO, 2012);
        }
        Arrays.sort(arrayMotocicletas);
        System.out.println(Arrays.deepToString(arrayMotocicletas));
        Arrays.sort(arrayMotocicletas, new Comparator<Motocicleta>() {
            @Override
            public int compare(Motocicleta motocicleta, Motocicleta t1) {
                return motocicleta.getAnyo() - t1.getAnyo();
            }
        });
        System.out.println(Arrays.deepToString(arrayMotocicletas));
    }
}
