package paquete_examen;

import java.util.Arrays;
import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Indique el tamaño del vector: ");
        int tamanyo = sc.nextInt();

        int[] tabla = new int[tamanyo];


        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = (int) (Math.random() * 101);
        }


        System.out.println("Tabla sin filtrar primos: ");

        for (int i = 0; i < tabla.length; i++) {
            System.out.print(tabla[i] + " ");
        }

        System.out.println('\n' + "Tabla filtrada(Devuelve -1 si no hay ningún primo): " + '\n' + Arrays.toString(filtraPrimos(tabla)));


        /*   int[] tabla2 = {4, 5, 6, 7, 8, 9, 10, 11};   VERSION DE PRUEBA
        System.out.println('\n' + "Tabla filtrada: " + '\n' + Arrays.toString(filtraPrimos(tabla2)));*/
    }

    public static int[] filtraPrimos(int[] tabla) {
        int[] tabla_primos = new int[1];
        int contador = 0;
        boolean es_primo = false;

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 1; j < tabla[i]; j++) {

                if (j != 1) {
                    if (tabla[i] % j == 0) {
                        es_primo = true;
                        break;

                    }
                }

            }

            if (!es_primo && tabla[i] != 0) {

                tabla_primos = Arrays.copyOf(tabla_primos, tabla_primos.length + 1);
                tabla_primos[contador] = tabla[i];
                contador++;
            }
            es_primo = false;
        }
        if (contador == 0) {
            tabla_primos[contador] = -1;
        } else {
            tabla_primos = Arrays.copyOf(tabla_primos, tabla_primos.length - 1);
        }

        return tabla_primos;
    }
}
