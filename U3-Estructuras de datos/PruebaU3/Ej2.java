package Pruebas2;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] vector = new int[4][5];
        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector[i].length; j++) {
                System.out.println("Escriba el número de la fila " + i + " y columna " + j);
                vector[i][j] = sc.nextInt();
            }
        }
        int[][] vector2 = mediaVector(vector);


        System.out.println("VIEJO ARRAY: ");
        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector[i].length; j++) {
                System.out.print(vector[i][j] + " |");
            }
            System.out.println("");
        }
        System.out.println('\n' + "NUEVO ARRAY: ");
        for (int i = 0; i < vector2.length; i++) {
            for (int j = 0; j < vector2[i].length; j++) {
                System.out.print(vector2[i][j] + " |");
            }
            System.out.println("");
        }
    }

    public static int[][] mediaVector(int[][] vector) {


        int alto = vector.length + 1;
        int ancho = vector.length + 1;

        int[][] vector2 = new int[alto][ancho];

        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector[i].length; j++) {
                vector2[i][j] = vector[i][j];
            }
        }


        int total_filas = 0;
        int total_columnas = 0;
        int local = 0;

        for (int i = 0; i < vector2.length; i++) {
            for (int j = 0; j < vector2[i].length; j++) {

                local += vector2[i][j];

                if (j == vector2[i].length - 1) {
                    local = (local / 5);
                    total_filas+=local;
                    vector2[i][j] = local;
                }
            }
            local = 0;
        }

        for (int i = 0; i < vector2.length; i++) {
            for (int j = 0; j < vector2[i].length; j++) {

                if (i == vector2.length - 1) {
                    break;
                } else {
                    vector2[vector2.length - 1][j] += vector2[i][j];
                }

            }
        }
        for (int i = 0; i <6 ; i++) {
            vector2[vector2.length - 1][i]=(vector2[vector2.length - 1][i]/4);
        }
        for (int i = 0; i < vector2.length; i++) {
            for (int j = 0; j < vector2[i].length; j++) {

                if (j == vector2[i].length - 1 || (i == vector2.length - 1 && j != vector2[i].length - 1)) {
                    vector2[alto - 1][ancho - 1] += vector2[i][j];
                }

            }
        }

        return vector2;
    }
}

