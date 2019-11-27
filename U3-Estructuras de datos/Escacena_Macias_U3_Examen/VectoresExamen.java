package paquete_examen;

import java.util.Arrays;

public class VectoresExamen {

    public static char[] unir(char[] vector1, char[] vector2) {
        char[] fusion = new char[vector1.length + vector2.length];

        for (int i = 0; i < vector2.length; i++) {
            fusion[i] = vector2[i];
        }
        for (int i = 0; i < vector1.length; i++) {
            fusion[i + vector2.length] = vector1[i];
        }


        return fusion;
    }



    public static char[] rotar(char[] vector, int posicion) {

        for (int i = 0; i < posicion; i++) {

            vector = Arrays.copyOf(vector, vector.length + 1);

            for (int j = vector.length - 2; j >= 0; j--) {
                vector[j + 1] = vector[j];
            }

            vector[0] = vector[vector.length - 1];
            vector = Arrays.copyOf(vector, vector.length - 1);


        }


        return vector;
    }


}
