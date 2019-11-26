package Pruebas2;

import java.util.Enumeration;
import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        do {
            System.out.println("¿Cuántos son? (Introduzca -1 para salir del programa): ");
            num = sc.nextInt();
        } while (num > 4 || num < -1);


        int[] datos = new int[10];
        for (int i = 0; i < datos.length; i++) {
            datos[i] = (int) (Math.random() * 6 - 1);
        }

        mostrar(datos);

        while (num != -1) {
            boolean introducido = false;

            for (int i = 0; i < datos.length; i++) {
                if (datos[i] == 0) {
                    System.out.println("Por favor, sientese en la mesa número " + (i + 1));
                    datos[i] = num;
                    introducido = true;
                    mostrar(datos);
                    break;
                }
            }
            if (!introducido) {
                for (int i = 0; i < datos.length; i++) {
                    if (datos[i] + num <= 4) {
                        System.out.println("Tendrá que compartir sitio,por favor, sientese en la mesa número " + (i + 1));
                        datos[i] = datos[i] + num;
                        mostrar(datos);

                        introducido = true;
                        break;
                    }
                }
            }
            if (!introducido) {
                System.out.println('\n' + "Lo siento no nos queda sitio.");
            }

            do {
                System.out.println("¿Cuántos son? (Introduzca -1 para salir del programa): ");
                num = sc.nextInt();
            } while (num > 4 || num < -1);
            introducido = false;
        }
        System.out.println("ADIOS!");
    }

    static void mostrar(int[] a) {

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
