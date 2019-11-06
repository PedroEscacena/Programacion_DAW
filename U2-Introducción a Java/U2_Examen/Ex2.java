package examenes;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, introduzca un número entero positivo: ");
        long numero = sc.nextLong();
        if (numero > 0) {
            System.out.println("Introduzca la posición a partir de la cual quiere partir el número: ");
            int posic = sc.nextInt();
            String cadena = Long.toString(numero);
            while (posic > cadena.length()) {
                System.out.println("ERROR AL INTRODUCIR NUMERO,VUELVA A INTENTARLO");
                posic = sc.nextInt();
            }

            String parte1 = "";
            String parte2 = "";
            for (int i = 0; i < posic - 1; i++) {
                parte1 = parte1 + cadena.charAt(i);
            }
            for (int i = posic - 1; i < cadena.length(); i++) {
                parte2 = parte2 + cadena.charAt(i);
            }
            System.out.println("Los números partidos son el " + parte1 + " y el " + parte2);
        } else {
            System.out.println("ERROR AL INTRODUCIR NUMERO");
        }

    }
}
