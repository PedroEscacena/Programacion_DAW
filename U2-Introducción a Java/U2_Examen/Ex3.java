package examenes;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String digitos = "1234567890";

        System.out.println("Introduzca un número entero");
        long numero = sc.nextLong();

        String cadena = Long.toString(numero);
        String aparece = " ";
        boolean esta = false;
        String no_aparece = "";

        for (int i = 0; i < cadena.length(); i++) {
            esta = false;
            for (int j = 0; j < aparece.length(); j++) {
                if (cadena.charAt(i) == aparece.charAt(j)) {
                    esta = true;
                }
            }
            if (!esta) {
                aparece = aparece + cadena.charAt(i) + " ";
            }
        }
        esta = false;
        for (int i = 0; i < digitos.length(); i++) {
            esta = false;
            for (int j = 0; j < aparece.length(); j++) {
                if (digitos.charAt(i) == aparece.charAt(j)) {
                    esta = true;
                }
            }
            if (!esta) {
                no_aparece = no_aparece + digitos.charAt(i) + " ";
            }
        }

        System.out.println("Digitos que aparecen: " + aparece + '\n' + "Digitos que no aparecen: " + no_aparece);
    }
}
