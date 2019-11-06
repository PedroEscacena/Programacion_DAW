package examenes;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String vocales = "aeiouAEIOUáéíóúÁÉÍÓÚäëïöüÄËÏÖÜ";//Posibles caracteres
        System.out.println("Introduzca una cadena de texto: ");
        String cadena = sc.nextLine();
        int contador = 0;

        for (int i = 0; i < cadena.length(); i++) {

            for (int j = 0; j < vocales.length(); j++) {

                if (cadena.charAt(i) == vocales.charAt(j)) {
                    contador++;
                    break;
                }

            }
        }
        System.out.println("la cantidad de vocales es: " + contador);


    }
}
