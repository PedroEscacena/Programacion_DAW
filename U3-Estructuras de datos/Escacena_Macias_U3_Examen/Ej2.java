package paquete_examen;

import java.util.Arrays;
import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Indique el tamaño del vector: ");
        int tamanyo = sc.nextInt();
        int[] tabla = new int[tamanyo];


        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = (int) (Math.random() * 12 - 1);
        }

        System.out.println("Indique el valor que desea introducir: ");
        int valor = sc.nextInt();
        int posicion;

        do {
            System.out.println("Por último, indique la posición(No puede ser una posición que de error): ");
            posicion = sc.nextInt();
        } while (posicion > tabla.length || posicion < 0);

        System.out.println("Vector sin modificación: " + '\n' + Arrays.toString(tabla));
        System.out.println("Nuevo vector: " + '\n' + Arrays.toString(insertarValor(tabla, valor, posicion)));



        /*
        int[] tabla = {1, 2, 3, 4,5,6,7,8};     PARA PROBAR SI FUNCIONA
        System.out.println("Nuevo vector: " + '\n' + Arrays.toString(insertarValor(tabla, 8, 3)));
        */


    }

    public static int[] insertarValor(int[] tabla, int valor, int posicion) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        tabla[tabla.length - 1] = 0;
        for (int i = tabla.length - 2; i >= posicion; i--) {
            tabla[i + 1] = tabla[i];
        }
        tabla[posicion] = valor;


        return tabla;
    }
}
