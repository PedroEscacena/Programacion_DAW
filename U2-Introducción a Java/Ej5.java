package pruebas;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una palabra, por favor");
        String cadena = sc.nextLine();

        if (cadena.length() > 10) {
            cadena = cadena.substring(0, 10);
        }

        for (int i = 0; i < (cadena.length()) + 1; i++) {//Primero rombo

            for (int j = 0; j < (cadena.length()) - i; j++) {//Espacios primera parte rombo
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {//Primera parte de la línea del primero rombo
                System.out.print(cadena.toUpperCase().charAt(j));
            }
            for (int j = i - 1; j > 0; j--) {//Segunda parte de la línea del primero rombo
                System.out.print(cadena.toUpperCase().charAt(j - 1));
            }
            System.out.println("");
        }
        for (int i = 0; i < (cadena.length() - 1); i++) {

            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }

            System.out.println("");
        }
    }
}
