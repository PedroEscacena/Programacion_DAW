package paquete_examen;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fila;
        int columna;

        do {//Deben ser las filas y las columnas mayores de 1 para que el array no tenga 1 solo elemento
            System.out.println("Indique el tamaño de las filas(Debe ser mayor de 1): ");
            fila = sc.nextInt();
        } while (fila <= 1);

        do {
            System.out.println("Indique el tamaño de las columnas(Debe ser mayor de 1): ");
            columna = sc.nextInt();
        } while (columna <= 1);


        int[][] tabla = new int[fila][columna];


        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                tabla[i][j] = (int) (Math.random() * 1002 - 1);
            }
        }
/*     Por si desea ver que los datos están correctos

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.print(tabla[i][j]+" ");
            }
        }

*/
        System.out.println("El mayor número de esa matriz es: " + maxMatriz(tabla));

    }

    public static int maxMatriz(int[][] tabla) {

        int mayor = tabla[0][0];

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {

                if (tabla[i][j] > mayor) {
                    mayor = tabla[i][j];
                }

            }
        }


        return mayor;
    }
}
