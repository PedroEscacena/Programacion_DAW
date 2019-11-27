package paquete_examen;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String array_letras = "abcdefgh";

        System.out.println("Introduzca la posición del alfil: ");
        String posicion = sc.nextLine();
        posicion = posicion.toLowerCase();
        int numero_letra = 0;
        int numero_numero = (int) posicion.charAt(1) - (48);
        for (int i = 0; i < array_letras.length(); i++) {
            if (posicion.charAt(0) == array_letras.charAt(i)) {
                numero_letra = (i + 1);
                break;
            }
        }

        String[][] tablero = new String[8][8];


        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] =  array_letras.charAt(i)+ "" + (j + 1);
            }
        }


        int posic_alfil = (numero_letra + numero_numero);


        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println('\n'+"El alfil se puede mover a: "+'\n');

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {

                if ((i + 1) + (j + 1) == posic_alfil) {
                    System.out.print(array_letras.charAt(i) + "" + (j + 1) + " ");
                }

            }
        }


    }
}
